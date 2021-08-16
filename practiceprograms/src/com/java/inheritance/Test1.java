package com.java.inheritance;
class Student{
	static int a;
	static int b;
	static {
		System.out.println("im  student");
	}
}
class MCAStudent extends Student{
	static {
		System.out.println("im  mca");
	}
	
}
class MBAStudent extends Student{
	static {
		System.out.println("im  mba");
	}
	
}
public class Test1 {
	public static void main(String[] args) {
		Student s1,s2,s3;
		s1 = new MCAStudent();
		s2 = new MBAStudent();
		MCAStudent m1 = new MCAStudent();
		s3 = m1;
		MCAStudent m2,m3;
		// m2 = s3;
		m2 = (MCAStudent) s3;
		m3 = (MCAStudent) s3;
	}
}
