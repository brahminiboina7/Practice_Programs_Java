package com.java.files_streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	private int id;
	private String name;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void show() {
		System.out.println("id= "+id+ " , name="+name);
	}
	
}
public class SerializationDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout;
		fout = new FileOutputStream("c:\\Users\\user\\Desktop\\sample.txt");
		ObjectOutputStream os;
		os = new ObjectOutputStream(fout);
		Student s = new Student();
		s.setId(7);
		s.setName("Bhanu");
		os.writeObject(s);
		os.close();
		fout.close();
		System.out.println("student object is stored in sample.txt file");
	}

}
