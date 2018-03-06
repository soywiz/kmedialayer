package com.soywiz.kmedialayer.sample

import com.soywiz.kmedialayer.*

object KmedilayerSample {
    fun main(args: Array<String>) {
        Kml.application(
            WindowConfig(
                width = 640,
                height = 480,
                title = "KmedilayerSample"
            ), object : KMLWindowListener() {
                lateinit var program: KmlGlProgram
                lateinit var layout: KmlGlVertexLayout
                lateinit var buffer: KmlGlBuffer
                lateinit var tex: KmlGlTex

                override fun init(gl: KmlGl) = gl.run {
                    program = createProgram(
                        vertex = """
                            attribute vec2 aPos;
                            attribute vec2 aTex;
                            varying vec2 vTex;
                            void main() {
                                gl_Position = vec4(aPos, 0.0, 1.0);
                                vTex = aTex;
                            }
                        """,
                        fragment = """
                            uniform sampler2D utex;
                            varying vec2 vTex;

                            void main(void) {
                                //gl_FragColor = vec4(0.8, 0.3, 0.4, 1.0);
                                //texture2D(utex, vTex);
                                gl_FragColor = texture2D(utex, vTex);
                            }
                        """
                    )
                    layout = program.layout {
                        float("aPos", 2)
                        float("aTex", 2)
                    }
                    buffer = createArrayBuffer()
                    tex = createKmlTexture().upload(
                        2, 2, intArrayOf(
                            0xFF0000FF.toInt(), 0xFF00FFFF.toInt(),
                            0xFF00FFFF.toInt(), 0xFF0000FF.toInt()
                        ).toIntBuffer()
                    )
                }

                var n = 0
                override fun render(gl: KmlGl) = gl.run {
                    buffer.setData(
                        KmlFloatBuffer(
                            floatArrayOf(
                                0f, 0f, 0f, 0f,
                                1f, 0f, 1f, 0f,
                                0f, 1f, 0f, 1f,
                                1f, 1f, 1f, 1f
                            )
                        )
                    )
                    n++
                    clearColor(.5f, .55f, .6f, 1f)
                    clear(COLOR_BUFFER_BIT)

                    layout.drawArrays(buffer, TRIANGLE_STRIP, 0, 4) {
                        tex.bind(0)
                        gl.uniform1i(program.getUniformLocation("utex"), 0)
                    }
                }

                override fun keyUpdate(keyCode: Int, pressed: Boolean) {
                    println("keyUpdate($keyCode, $pressed)")
                }

                override fun gamepadUpdate(button: Int, pressed: Boolean, ratio: Double) {
                    println("gamepadUpdate($button, $pressed, $ratio)")
                }

                override fun mouseUpdate(x: Int, y: Int, buttons: Int) {
                    println("mouseUpdate($x, $y, $buttons)")
                }
            }
        )
    }
}