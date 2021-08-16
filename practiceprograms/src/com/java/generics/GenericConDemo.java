package com.java.generics;
class Student{}
class MCAStudent extends Student{}
class Employee{}
class Manager extends Employee{}
class Sample {
	public Sample(Student s) {
		System.out.println("sample obj");
	}
}
public class GenericConDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		MCAStudent s2 = new MCAStudent();
		Employee e1 = new Employee();
		Manager e2 = new Manager();
		
		Sample r1 = new Sample(s1);
		Sample r2 = new Sample(s2);
		//Sample r3 = new Sample(e1);
		//Sample r4 = new Sample(e2);

		
	}

}
