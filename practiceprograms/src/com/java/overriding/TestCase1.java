package com.java.overriding;

class Alpha{
	void fun() {	//Overriden method
		System.out.println("Alpha fun");
	}
}
class Beta extends Alpha{
	void fun() {	//Overriding method
		System.out.println("Beta fun");
	}
}
class Employee{
	void work() {	//Overriden method
		System.out.println("doing the work");
	}
}
class Manager extends Employee{
	void work() {	//Overriding method                                                                                                                                                                                                                                                                          
		System.out.println("assigning the work");
	}
}
public class TestCase1 {
	public static void main(String[] args) {
		Alpha a;
		Beta b;
	
		a = new Alpha();
		a.fun();
		b = new Beta();
		b.fun();
		a = new Beta();
		a.fun();
		
		Employee e;
		Manager m;
		e = new Employee();
		e.work();
		m = new Manager();
		m.work();
		e = new Manager();
		e.work();
		
		
	}

}
