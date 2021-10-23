package com.java.files_streams;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStream_WriteDemo1 {
	public static void main(String[] args) {
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write('a');
		bout.write('b');
		bout.write('c');
		byte b[] = bout.toByteArray();
		System.out.println(b[0]); //97
		System.out.println((char)b[0]); //a
	}

}
