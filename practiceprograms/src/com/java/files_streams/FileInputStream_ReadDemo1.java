package com.java.files_streams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_ReadDemo1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = null;
		try {
		fin = new FileInputStream("c:\\Users\\user\\Desktop\\sample.txt");
		int ch = fin.read();
		while(ch!=-1) {
			//System.out.print(ch);
			
			System.out.print((char)ch);
			ch = fin.read();
		}
		}catch (Exception e) {
			
		}finally {
			fin.close();
		}
		
			
		
	}

}
