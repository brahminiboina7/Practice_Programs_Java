package com.java.files_streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student1 implements Serializable{
	public static final long serialVersionUID = 1L;
	public int rno;
	public String name;
	
}
public class WriteObject_Demo {
	public static void main(String[] args) throws IOException {
		Student1 s = new Student1();
		s.rno = 23;
		s.name = "Bhanu";
		FileOutputStream fout;
		fout = new FileOutputStream("c:\\Users\\user\\Desktop\\ss.txt");
		ObjectOutputStream os;
		os = new ObjectOutputStream(fout);
		os.writeObject(s);
		os.close();
		fout.close();
		System.out.println("student object is serialized");
	}

}
