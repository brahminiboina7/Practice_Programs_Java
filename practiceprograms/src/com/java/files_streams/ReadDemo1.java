package com.java.files_streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDemo1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = null;
		fileread(fin);
	}

	private static void fileread(FileInputStream fin) throws IOException {
		try {
		fin = new FileInputStream("con");
		int b1 = fin.read();
		System.out.println(b1);
		System.out.println((char)b1);
		
		}catch(FileNotFoundException e1) {
			System.out.println("there is no such file "+e1.getMessage());
		}catch(IOException e2) {
			System.out.println(e2.getMessage());
		}finally {
			
			if(fin!=null) {
				fin.close();
				System.out.println("file closed successfuully");
			}
		}
		
	}
	

}
