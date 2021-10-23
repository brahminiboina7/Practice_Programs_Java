package com.java.files_streams;

import java.io.FileInputStream;

public class FileInputStream_ReadDemo2 {
	public static void main(String[] args) {
		FileInputStream fin;
		try {
			fin = new FileInputStream("con");
			//in linux fin = new FileInputStream("dev/stdin");
			System.out.println("enter a byte");
			int ch = fin.read();
			System.out.println("ch = "+ch);
			System.out.println("ch = "+(char)ch);
			fin.close();			
		}catch (Exception e) {
			System.out.println("exception " +e.getMessage());
		}
	}

}
