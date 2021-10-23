package com.java.files_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin;
		fin = new FileInputStream("c:\\Users\\user\\Desktop\\sample.txt");
		ObjectInputStream oin;
		oin = new ObjectInputStream(fin);
		Student s = (Student)oin.readObject();
		s.show();
		oin.close();
		fin.close();
		System.out.println("student object is stored in sample.txt file");
	}



}
