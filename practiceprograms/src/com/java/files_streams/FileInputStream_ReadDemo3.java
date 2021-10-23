package com.java.files_streams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_ReadDemo3 {
	public static void main(String[] args) {
		try {
			FileInputStream fin;
			fin = new FileInputStream("c:\\Users\\user\\Desktop\\sample.txt");
			byte b[] = new byte[5];
			fin.read(b);
			for(int i = 0; i<b.length; i++) {
				System.out.println((char)b[i]);
				fin.close();	
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
