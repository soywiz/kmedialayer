// WARNING: File autogenerated DO NOT modify
// https://www.khronos.org/registry/OpenGL/api/GLES2/gl2.h
@file:Suppress("unused", "RedundantUnitReturnType")

package com.soywiz.kmedialayer

import org.lwjgl.opengl.GL11.*
import org.lwjgl.opengl.GL13.*
import org.lwjgl.opengl.GL14.*
import org.lwjgl.opengl.GL15.*
import org.lwjgl.opengl.GL20.*
import org.lwjgl.opengl.GL30.*
import org.lwjgl.opengl.GL41.*
import java.nio.*

actual class KmlGl {
    actual fun activeTexture(texture: Int): Unit = glActiveTexture(texture)
    actual fun attachShader(program: Int, shader: Int): Unit = glAttachShader(program, shader)
    actual fun bindAttribLocation(program: Int, index: Int, name: String): Unit = glBindAttribLocation(program, index, name)
    actual fun bindBuffer(target: Int, buffer: Int): Unit = glBindBuffer(target, buffer)
    actual fun bindFramebuffer(target: Int, framebuffer: Int): Unit = glBindFramebuffer(target, framebuffer)
    actual fun bindRenderbuffer(target: Int, renderbuffer: Int): Unit = glBindRenderbuffer(target, renderbuffer)
    actual fun bindTexture(target: Int, texture: Int): Unit = glBindTexture(target, texture)
    actual fun blendColor(red: Float, green: Float, blue: Float, alpha: Float): Unit = glBlendColor(red, green, blue, alpha)
    actual fun blendEquation(mode: Int): Unit = glBlendEquation(mode)
    actual fun blendEquationSeparate(modeRGB: Int, modeAlpha: Int): Unit = glBlendEquationSeparate(modeRGB, modeAlpha)
    actual fun blendFunc(sfactor: Int, dfactor: Int): Unit = glBlendFunc(sfactor, dfactor)
    actual fun blendFuncSeparate(sfactorRGB: Int, dfactorRGB: Int, sfactorAlpha: Int, dfactorAlpha: Int): Unit = glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha)
    actual fun bufferData(target: Int, size: Long, data: KmlBuffer?, usage: Int): Unit = glBufferData(target, size, data?.nioBuffer, usage)
    actual fun bufferSubData(target: Int, offset: Long, size: Long, data: KmlBuffer?): Unit = glBufferSubData(target, offset, size, data?.nioBuffer)
    actual fun checkFramebufferStatus(target: Int): Int = glCheckFramebufferStatus(target)
    actual fun clear(mask: Int): Unit = glClear(mask)
    actual fun clearColor(red: Float, green: Float, blue: Float, alpha: Float): Unit = glClearColor(red, green, blue, alpha)
    actual fun clearDepthf(d: Float): Unit = glClearDepthf(d)
    actual fun clearStencil(s: Int): Unit = glClearStencil(s)
    actual fun colorMask(red: Boolean, green: Boolean, blue: Boolean, alpha: Boolean): Unit = glColorMask(red, green, blue, alpha)
    actual fun compileShader(shader: Int): Unit = glCompileShader(shader)
    actual fun compressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, imageSize: Int, data: KmlBuffer?): Unit = glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data?.nioBuffer)
    actual fun compressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, imageSize: Int, data: KmlBuffer?): Unit = glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data?.nioBuffer)
    actual fun copyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, height: Int, border: Int): Unit = glCopyTexImage2D(target, level, internalformat, x, y, width, height, border)
    actual fun copyTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int): Unit = glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height)
    actual fun createProgram(): Int = glCreateProgram()
    actual fun createShader(type: Int): Int = glCreateShader(type)
    actual fun cullFace(mode: Int): Unit = glCullFace(mode)
    actual fun deleteBuffers(n: Int, buffers: KmlBuffer?): Unit = glDeleteBuffers(n, buffers?.nioBuffer)
    actual fun deleteFramebuffers(n: Int, framebuffers: KmlBuffer?): Unit = glDeleteFramebuffers(n, framebuffers?.nioBuffer)
    actual fun deleteProgram(program: Int): Unit = glDeleteProgram(program)
    actual fun deleteRenderbuffers(n: Int, renderbuffers: KmlBuffer?): Unit = glDeleteRenderbuffers(n, renderbuffers?.nioBuffer)
    actual fun deleteShader(shader: Int): Unit = glDeleteShader(shader)
    actual fun deleteTextures(n: Int, textures: KmlBuffer?): Unit = glDeleteTextures(n, textures?.nioBuffer)
    actual fun depthFunc(func: Int): Unit = glDepthFunc(func)
    actual fun depthMask(flag: Boolean): Unit = glDepthMask(flag)
    actual fun depthRangef(n: Float, f: Float): Unit = glDepthRangef(n, f)
    actual fun detachShader(program: Int, shader: Int): Unit = glDetachShader(program, shader)
    actual fun disable(cap: Int): Unit = glDisable(cap)
    actual fun disableVertexAttribArray(index: Int): Unit = glDisableVertexAttribArray(index)
    actual fun drawArrays(mode: Int, first: Int, count: Int): Unit = glDrawArrays(mode, first, count)
    actual fun drawElements(mode: Int, count: Int, type: Int, indices: KmlBuffer?): Unit = glDrawElements(mode, count, type, indices?.nioBuffer)
    actual fun enable(cap: Int): Unit = glEnable(cap)
    actual fun enableVertexAttribArray(index: Int): Unit = glEnableVertexAttribArray(index)
    actual fun finish(): Unit = glFinish()
    actual fun flush(): Unit = glFlush()
    actual fun framebufferRenderbuffer(target: Int, attachment: Int, renderbuffertarget: Int, renderbuffer: Int): Unit = glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer)
    actual fun framebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: Int, level: Int): Unit = glFramebufferTexture2D(target, attachment, textarget, texture, level)
    actual fun frontFace(mode: Int): Unit = glFrontFace(mode)
    actual fun genBuffers(n: Int, buffers: KmlBuffer?): Unit = glGenBuffers(n, buffers?.nioBuffer)
    actual fun generateMipmap(target: Int): Unit = glGenerateMipmap(target)
    actual fun genFramebuffers(n: Int, framebuffers: KmlBuffer?): Unit = glGenFramebuffers(n, framebuffers?.nioBuffer)
    actual fun genRenderbuffers(n: Int, renderbuffers: KmlBuffer?): Unit = glGenRenderbuffers(n, renderbuffers?.nioBuffer)
    actual fun genTextures(n: Int, textures: KmlBuffer?): Unit = glGenTextures(n, textures?.nioBuffer)
    actual fun getActiveAttrib(program: Int, index: Int, bufSize: Int, length: KmlBuffer?, size: KmlBuffer?, type: KmlBuffer?, name: KmlBuffer?): Unit = glGetActiveAttrib(program, index, bufSize, length?.nioBuffer, size?.nioBuffer, type?.nioBuffer, name?.nioBuffer)
    actual fun getActiveUniform(program: Int, index: Int, bufSize: Int, length: KmlBuffer?, size: KmlBuffer?, type: KmlBuffer?, name: KmlBuffer?): Unit = glGetActiveUniform(program, index, bufSize, length?.nioBuffer, size?.nioBuffer, type?.nioBuffer, name?.nioBuffer)
    actual fun getAttachedShaders(program: Int, maxCount: Int, count: KmlBuffer?, shaders: KmlBuffer?): Unit = glGetAttachedShaders(program, maxCount, count?.nioBuffer, shaders?.nioBuffer)
    actual fun getAttribLocation(program: Int, name: String): Int = glGetAttribLocation(program, name)
    actual fun getBooleanv(pname: Int, data: KmlBuffer?): Unit = glGetBooleanv(pname, data?.nioBuffer)
    actual fun getBufferParameteriv(target: Int, pname: Int, params: KmlBuffer?): Unit = glGetBufferParameteriv(target, pname, params?.nioBuffer)
    actual fun getError(): Int = glGetError()
    actual fun getFloatv(pname: Int, data: KmlBuffer?): Unit = glGetFloatv(pname, data?.nioBuffer)
    actual fun getFramebufferAttachmentParameteriv(target: Int, attachment: Int, pname: Int, params: KmlBuffer?): Unit = glGetFramebufferAttachmentParameteriv(target, attachment, pname, params?.nioBuffer)
    actual fun getIntegerv(pname: Int, data: KmlBuffer?): Unit = glGetIntegerv(pname, data?.nioBuffer)
    actual fun getProgramiv(program: Int, pname: Int, params: KmlBuffer?): Unit = glGetProgramiv(program, pname, params?.nioBuffer)
    actual fun getProgramInfoLog(program: Int, bufSize: Int, length: KmlBuffer?, infoLog: KmlBuffer?): Unit = glGetProgramInfoLog(program, bufSize, length?.nioBuffer, infoLog?.nioBuffer)
    actual fun getRenderbufferParameteriv(target: Int, pname: Int, params: KmlBuffer?): Unit = glGetRenderbufferParameteriv(target, pname, params?.nioBuffer)
    actual fun getShaderiv(shader: Int, pname: Int, params: KmlBuffer?): Unit = glGetShaderiv(shader, pname, params?.nioBuffer)
    actual fun getShaderInfoLog(shader: Int, bufSize: Int, length: KmlBuffer?, infoLog: KmlBuffer?): Unit = glGetShaderInfoLog(shader, bufSize, length?.nioBuffer, infoLog?.nioBuffer)
    actual fun getShaderPrecisionFormat(shadertype: Int, precisiontype: Int, range: KmlBuffer?, precision: KmlBuffer?): Unit = glGetShaderPrecisionFormat(shadertype, precisiontype, range?.nioBuffer, precision?.nioBuffer)
    actual fun getShaderSource(shader: Int, bufSize: Int, length: KmlBuffer?, source: KmlBuffer?): Unit = glGetShaderSource(shader, bufSize, length?.nioBuffer, source?.nioBuffer)
    actual fun getString(name: Int): String = glGetString(name)
    actual fun getTexParameterfv(target: Int, pname: Int, params: KmlBuffer?): Unit = glGetTexParameterfv(target, pname, params?.nioBuffer)
    actual fun getTexParameteriv(target: Int, pname: Int, params: KmlBuffer?): Unit = glGetTexParameteriv(target, pname, params?.nioBuffer)
    actual fun getUniformfv(program: Int, location: Int, params: KmlBuffer?): Unit = glGetUniformfv(program, location, params?.nioBuffer)
    actual fun getUniformiv(program: Int, location: Int, params: KmlBuffer?): Unit = glGetUniformiv(program, location, params?.nioBuffer)
    actual fun getUniformLocation(program: Int, name: String): Int = glGetUniformLocation(program, name)
    actual fun getVertexAttribfv(index: Int, pname: Int, params: KmlBuffer?): Unit = glGetVertexAttribfv(index, pname, params?.nioBuffer)
    actual fun getVertexAttribiv(index: Int, pname: Int, params: KmlBuffer?): Unit = glGetVertexAttribiv(index, pname, params?.nioBuffer)
    actual fun getVertexAttribPointerv(index: Int, pname: Int, pointer: KmlBuffer?): Unit = glGetVertexAttribPointerv(index, pname, pointer?.nioBuffer)
    actual fun hint(target: Int, mode: Int): Unit = glHint(target, mode)
    actual fun isBuffer(buffer: Int): Boolean = glIsBuffer(buffer)
    actual fun isEnabled(cap: Int): Boolean = glIsEnabled(cap)
    actual fun isFramebuffer(framebuffer: Int): Boolean = glIsFramebuffer(framebuffer)
    actual fun isProgram(program: Int): Boolean = glIsProgram(program)
    actual fun isRenderbuffer(renderbuffer: Int): Boolean = glIsRenderbuffer(renderbuffer)
    actual fun isShader(shader: Int): Boolean = glIsShader(shader)
    actual fun isTexture(texture: Int): Boolean = glIsTexture(texture)
    actual fun lineWidth(width: Float): Unit = glLineWidth(width)
    actual fun linkProgram(program: Int): Unit = glLinkProgram(program)
    actual fun pixelStorei(pname: Int, param: Int): Unit = glPixelStorei(pname, param)
    actual fun polygonOffset(factor: Float, units: Float): Unit = glPolygonOffset(factor, units)
    actual fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, pixels: KmlBuffer?): Unit = glReadPixels(x, y, width, height, format, type, pixels?.nioBuffer)
    actual fun releaseShaderCompiler(): Unit = glReleaseShaderCompiler()
    actual fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int): Unit = glRenderbufferStorage(target, internalformat, width, height)
    actual fun sampleCoverage(value: Float, invert: Boolean): Unit = glSampleCoverage(value, invert)
    actual fun scissor(x: Int, y: Int, width: Int, height: Int): Unit = glScissor(x, y, width, height)
    actual fun shaderBinary(count: Int, shaders: KmlBuffer?, binaryformat: Int, binary: KmlBuffer?, length: Int): Unit = glShaderBinary(count, shaders?.nioBuffer, binaryformat, binary?.nioBuffer, length)
    actual fun shaderSource(shader: Int, string: String): Unit = glShaderSource(shader, string)
    actual fun stencilFunc(func: Int, ref: Int, mask: Int): Unit = glStencilFunc(func, ref, mask)
    actual fun stencilFuncSeparate(face: Int, func: Int, ref: Int, mask: Int): Unit = glStencilFuncSeparate(face, func, ref, mask)
    actual fun stencilMask(mask: Int): Unit = glStencilMask(mask)
    actual fun stencilMaskSeparate(face: Int, mask: Int): Unit = glStencilMaskSeparate(face, mask)
    actual fun stencilOp(fail: Int, zfail: Int, zpass: Int): Unit = glStencilOp(fail, zfail, zpass)
    actual fun stencilOpSeparate(face: Int, sfail: Int, dpfail: Int, dppass: Int): Unit = glStencilOpSeparate(face, sfail, dpfail, dppass)
    actual fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: KmlBuffer?): Unit = glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels?.nioBuffer)
    actual fun texParameterf(target: Int, pname: Int, param: Float): Unit = glTexParameterf(target, pname, param)
    actual fun texParameterfv(target: Int, pname: Int, params: KmlBuffer?): Unit = glTexParameterfv(target, pname, params?.nioBuffer)
    actual fun texParameteri(target: Int, pname: Int, param: Int): Unit = glTexParameteri(target, pname, param)
    actual fun texParameteriv(target: Int, pname: Int, params: KmlBuffer?): Unit = glTexParameteriv(target, pname, params?.nioBuffer)
    actual fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: KmlBuffer?): Unit = glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels?.nioBuffer)
    actual fun uniform1f(location: Int, v0: Float): Unit = glUniform1f(location, v0)
    actual fun uniform1fv(location: Int, count: Int, value: KmlBuffer?): Unit = glUniform1fv(location, count, value?.nioBuffer)
    actual fun uniform1i(location: Int, v0: Int): Unit = glUniform1i(location, v0)
    actual fun uniform1iv(location: Int, count: Int, value: KmlBuffer?): Unit = glUniform1iv(location, count, value?.nioBuffer)
    actual fun uniform2f(location: Int, v0: Float, v1: Float): Unit = glUniform2f(location, v0, v1)
    actual fun uniform2fv(location: Int, count: Int, value: KmlBuffer?): Unit = glUniform2fv(location, count, value?.nioBuffer)
    actual fun uniform2i(location: Int, v0: Int, v1: Int): Unit = glUniform2i(location, v0, v1)
    actual fun uniform2iv(location: Int, count: Int, value: KmlBuffer?): Unit = glUniform2iv(location, count, value?.nioBuffer)
    actual fun uniform3f(location: Int, v0: Float, v1: Float, v2: Float): Unit = glUniform3f(location, v0, v1, v2)
    actual fun uniform3fv(location: Int, count: Int, value: KmlBuffer?): Unit = glUniform3fv(location, count, value?.nioBuffer)
    actual fun uniform3i(location: Int, v0: Int, v1: Int, v2: Int): Unit = glUniform3i(location, v0, v1, v2)
    actual fun uniform3iv(location: Int, count: Int, value: KmlBuffer?): Unit = glUniform3iv(location, count, value?.nioBuffer)
    actual fun uniform4f(location: Int, v0: Float, v1: Float, v2: Float, v3: Float): Unit = glUniform4f(location, v0, v1, v2, v3)
    actual fun uniform4fv(location: Int, count: Int, value: KmlBuffer?): Unit = glUniform4fv(location, count, value?.nioBuffer)
    actual fun uniform4i(location: Int, v0: Int, v1: Int, v2: Int, v3: Int): Unit = glUniform4i(location, v0, v1, v2, v3)
    actual fun uniform4iv(location: Int, count: Int, value: KmlBuffer?): Unit = glUniform4iv(location, count, value?.nioBuffer)
    actual fun uniformMatrix2fv(location: Int, count: Int, transpose: Boolean, value: KmlBuffer?): Unit = glUniformMatrix2fv(location, count, transpose, value?.nioBuffer)
    actual fun uniformMatrix3fv(location: Int, count: Int, transpose: Boolean, value: KmlBuffer?): Unit = glUniformMatrix3fv(location, count, transpose, value?.nioBuffer)
    actual fun uniformMatrix4fv(location: Int, count: Int, transpose: Boolean, value: KmlBuffer?): Unit = glUniformMatrix4fv(location, count, transpose, value?.nioBuffer)
    actual fun useProgram(program: Int): Unit = glUseProgram(program)
    actual fun validateProgram(program: Int): Unit = glValidateProgram(program)
    actual fun vertexAttrib1f(index: Int, x: Float): Unit = glVertexAttrib1f(index, x)
    actual fun vertexAttrib1fv(index: Int, v: KmlBuffer?): Unit = glVertexAttrib1fv(index, v?.nioBuffer)
    actual fun vertexAttrib2f(index: Int, x: Float, y: Float): Unit = glVertexAttrib2f(index, x, y)
    actual fun vertexAttrib2fv(index: Int, v: KmlBuffer?): Unit = glVertexAttrib2fv(index, v?.nioBuffer)
    actual fun vertexAttrib3f(index: Int, x: Float, y: Float, z: Float): Unit = glVertexAttrib3f(index, x, y, z)
    actual fun vertexAttrib3fv(index: Int, v: KmlBuffer?): Unit = glVertexAttrib3fv(index, v?.nioBuffer)
    actual fun vertexAttrib4f(index: Int, x: Float, y: Float, z: Float, w: Float): Unit = glVertexAttrib4f(index, x, y, z, w)
    actual fun vertexAttrib4fv(index: Int, v: KmlBuffer?): Unit = glVertexAttrib4fv(index, v?.nioBuffer)
    actual fun vertexAttribPointer(index: Int, size: Int, type: Int, normalized: Boolean, stride: Int, pointer: Long): Unit = glVertexAttribPointer(index, size, type, normalized, stride, pointer)
    actual fun viewport(x: Int, y: Int, width: Int, height: Int): Unit = glViewport(x, y, width, height)
}
