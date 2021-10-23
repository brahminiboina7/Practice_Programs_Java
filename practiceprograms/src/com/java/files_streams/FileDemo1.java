package com.java.files_streams;

import java.io.File;
import java.io.IOException;

public class FileDemo1{
	public static void main (String[] args){
	File file = new File("C:\\Users\\user\\Desktop\\sample.txt");
	try{
		boolean s = file.createNewFile();
		if(s==true){
			  System.out.println(" A new file is created");
		}
		else System.out.println("file already exists");
	}catch(IOException e){
		System.out.println("failed to create a file " +e.getMessage());
	}
	}
}
