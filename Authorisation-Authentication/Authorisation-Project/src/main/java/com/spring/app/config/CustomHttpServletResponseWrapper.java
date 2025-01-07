package com.spring.app.config;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;

public class CustomHttpServletResponseWrapper extends HttpServletResponseWrapper {

	private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	private final PrintWriter writer = new PrintWriter(byteArrayOutputStream);

	public CustomHttpServletResponseWrapper(HttpServletResponse response) {
		super(response);
	}

	@Override
	public PrintWriter getWriter() throws IOException {
		return super.getWriter();
	}

	public byte[] toByteArray() {
		writer.flush();
		return byteArrayOutputStream.toByteArray();
	}

}
