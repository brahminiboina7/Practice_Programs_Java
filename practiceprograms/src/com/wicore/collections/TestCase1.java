package com.wicore.collections;

class Student{
	private int rollno;
	private String name;
	public Student (int r, String n) {
		rollno = r;
		name = n;
	}
	public String toString() {
		return rollno+"   "+name;
	}
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		if(this.rollno==s.rollno && this.name==s.name) {
			return true;
		}else
			return false;
	}
	
}
public class TestCase1 {
	public static void main(String[] args) {
		Student s1 = new Student(1,"Brahmini");
		Student s2 = new Student(2,"Hema");
		Student s3 = new Student(3,"Krishna");
		Student s4 = new Student(1,"Brahmini");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("-------------------------------");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println("-------------------------------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}

}
