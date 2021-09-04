package com.java.abstract_kw;
/*Abstract KeyWord
* Rule1 :If a class contains one or more abstract methods then the class must be declared as abstract class
* Rule2 :If a sub class extends an abstract super class then that  sub class must be defined all abstract
		methods of super class.
		If the sub class is not defining all abstract methods of super class then the sub class must be
		declared as abstract class
* Rule3 :If a class is declared as abstract class then we can create reference of that class but we can 
		not create object of the class.
* Rule4 :In java we can define a class as abstract class without abstract method also
*/
abstract class Worker{
	abstract void fun();
	/*abstract void fun() { 	//not allowed c error
		System.out.println("fun1")
	}*/ 
	abstract void task1();
	abstract void task2();
	void fun1() {	//not an abstract method . Its a normal method
		System.out.println("in fun1 method");
	}
}
abstract class Painter extends Worker{ //it is not implementing all the methods in its abstract super class 
	void task1() {
		System.out.println("painting walls");
	}
	void task2() {
		System.out.println("painting on canwas");
	}	
}
class Engineer extends Worker{
	void fun() {
		System.out.println("Do work");
	}
	void task1() {
		System.out.println("developing projects");
	}
	void task2() {
		System.out.println("Guiding others");
	}
	
}
public class Abstract_Kw_Demo1 {
	public static void main(String[] args) {
		Worker w; //allowed
	 // w = new Worker();   not allowed
	}

}
