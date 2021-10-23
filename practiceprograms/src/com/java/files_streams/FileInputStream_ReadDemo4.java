package com.java.files_streams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_ReadDemo4 {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("c:\\Users\\user\\Desktop\\sample.txt");
			byte b[] = {'w', 'i', 'c', 'o', 'r', 'e'};
			System.out.print("value in byte array b is: ");
			for(int i= 0;i<b.length;i++) {
				System.out.print((char)b[i]);
			}
			fin.read(b,2,4);
			System.out.println();
			System.out.println("after reading input into byte array b the value in byte array"
					+  " b is : ");
			for(int i=0;i<b.length;i++) {
				System.out.print((char)b[i]);
			}
			fin.close();
		}catch(IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
