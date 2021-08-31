package com.java.overriding;
/*Rules in OverRiding
Rule 2- In ovverriding sub class method return type must be same as super class method return type
 		or sub type of super class method return type*/
class Student{
	
}
class MCAStudent extends Student{
	
}
class Employee1{
	
}
class Alpha3{
	Student fun1() { //overridden method
		System.out.println("student object is created");
		return new Student();
	}
	Student fun2() { //overridden method
		System.out.println("student object is created");
		return new Student();
	}
	void fun3(MCAStudent m) { //method overloading
		System.out.println("beta fun3 ");
	}
	
}
class Beta3 extends Alpha3 {
	MCAStudent fun1() { //overriding method
		System.out.println("mcastudent object is created");
		return new MCAStudent();
	}
	
	void fun3(Student s) {
		System.out.println("alpha fun3 ");
	}
	/*Employee1 fun2() { //overridden method
		System.out.println("employee object is created");
		return new Employee1();
	} --------> c error */
}
public class TestCase4 {
	public static void main(String[] args) {
		
		Alpha3 a;
		Beta3 b;
		
		a = new Beta3();
		a.fun1();
		//a.fun3(new Student());
		a.fun3(new MCAStudent());
		 
		b = new Beta3();
		b.fun1();
		b.fun3(new Student());
		b.fun3(new MCAStudent());
	}

}
