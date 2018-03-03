package com.soywiz.kmedialayer


class KmlGlProgram(val gl: KmlGl, val program: Int, val vertex: Int, val fragment: Int) {
    fun use() = gl.useProgram(program)
    fun unuse() = gl.useProgram(0)
    fun getAttribLocation(name: String) = gl.getAttribLocation(program, name)
    fun dispose() {
        gl.deleteProgram(program)
        gl.deleteShader(vertex)
        gl.deleteShader(fragment)
    }

    inline fun use(callback: () -> Unit) {
        val oldProgram = gl.getIntegerv(GL_CURRENT_PROGRAM)
        gl.useProgram(program)
        try {
            callback()
        } finally {
            gl.useProgram(oldProgram)
        }
    }
}

private fun KmlGl.createShader(type: Int, source: String): Int {
    val shader = createShader(type)
    shaderSource(shader, source)
    compileShaderAndCheck(shader)
    return shader
}

// TODO: Release resources on failure
fun KmlGl.createProgram(vertex: String, fragment: String): KmlGlProgram {
    val program = createProgram()
    val shaderVertex = createShader(GL_VERTEX_SHADER, vertex)
    val shaderFragment = createShader(GL_FRAGMENT_SHADER, fragment)
    attachShader(program, shaderVertex)
    attachShader(program, shaderFragment)
    linkProgramAndCheck(program)
    return KmlGlProgram(this, program, shaderVertex, shaderFragment)
}

class KmlGlVertexLayout(val program: KmlGlProgram) {
    data class Element(val index: Int, val size: Int, val type: Int, val pointer: Int, val normalized: Boolean)

    private val gl = program.gl
    private var index: Int = 0
    private var size: Int = 0
    private val elements = arrayListOf<Element>()

    private fun add(name: String, type: Int, esize: Int, count: Int, normalized: Boolean): KmlGlVertexLayout {
        elements += Element(program.getAttribLocation(name), count, type, size, normalized)
        size += count * esize
        index++
        return this
    }

    fun int(name: String, count: Int, normalized: Boolean = false): KmlGlVertexLayout =
        add(name, GL_INT, 4, count, normalized)

    fun float(name: String, count: Int, normalized: Boolean = false): KmlGlVertexLayout =
        add(name, GL_FLOAT, 4, count, normalized)

    fun enable(): Unit = gl.run {
        for ((index, element) in elements.withIndex()) {
            enableVertexAttribArray(index)
            vertexAttribPointer(
                element.index,
                element.size,
                element.type,
                element.normalized,
                size,
                element.pointer.toLong()
            )
        }
    }

    fun disable(): Unit = gl.run {
        for ((index, _) in elements.withIndex()) {
            disableVertexAttribArray(index)
        }
    }

    inline fun use(callback: () -> Unit): Unit {
        program.use {
            enable()
            try {
                callback()
            } finally {
                disable()
            }
        }
    }
}

fun KmlGlProgram.layout(config: KmlGlVertexLayout.() -> Unit): KmlGlVertexLayout = KmlGlVertexLayout(this).apply(config)

class KmlGlBuffer(val gl: KmlGl, val type: Int, val bufs: KmlIntBuffer) {
    fun bind() {
        gl.bindBuffer(type, bufs[0])
    }

    fun unbind() {
        gl.bindBuffer(type, 0)
    }

    fun setData(data: KmlBuffer): KmlGlBuffer {
        bind()
        gl.bufferData(type, data.baseBuffer.size.toLong(), data, GL_STATIC_DRAW)
        return this
    }

    fun dispose() {
        gl.deleteBuffers(bufs.size, bufs)
    }
}

fun KmlGl.createBuffer(type: Int): KmlGlBuffer {
    val bufs = KmlIntBuffer(1)
    genBuffers(1, bufs)
    return KmlGlBuffer(this, type, bufs)
}

fun KmlGl.createArrayBuffer(): KmlGlBuffer = createBuffer(GL_ARRAY_BUFFER)
fun KmlGl.createElementArrayBuffer(): KmlGlBuffer = createBuffer(GL_ELEMENT_ARRAY_BUFFER)