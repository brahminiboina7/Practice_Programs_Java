package com.java.files_streams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_WriteDemo1 {
	public static void main(String[] args) {
		try {
				FileOutputStream fout = new FileOutputStream("c:\\Users\\user\\Desktop\\sample.txt");
				fout.write('a');
				fout.write('\n');
				fout.write('\r');
				byte b[] = {'w'	, 'i', 'c' , 'o' , 'r', 'e'};
				fout.write(b);
				fout.write('\n');
				fout.write('\r');
				fout.write(b,2,3);
				fout.close();
			
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
	}

}
