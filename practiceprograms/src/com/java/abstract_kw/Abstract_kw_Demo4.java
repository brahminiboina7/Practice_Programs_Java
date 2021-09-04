package com.java.abstract_kw;
/* 1. Abstract class can contain static data members and non-static data members
 * 2. Abstract class can contain static methods and non-static methods
 * 3. Abstract class can contain abstract methods and normal methods
 * 4. Abstract class can contain constructors. Abstract class Constructors are called by Sub class Constructors
 * 5. Abstract class can extend another normal classes or Abstract classes.
 * 6. Abstract class can implement other interfaces
 * 7. Abstract class cannot be declared as final class
 * 8. Abstract method cannot be declared as final method
 * 9. Abstract method cannot be declared as static method
 * 10. Abstract method canot be declared as private
 */
class X{
	
}
abstract class Y extends X{ // allowed, as abstract class can extend another normal class
	
}
abstract class Z extends Y{	// allowed, as abstract class can extend another abstract class
	
}

interface Work{
	
}
abstract class doWork implements Work{	// allowed, as abstract class can implement another interfaces
	
}

/*final abstract class D{ //not allowed, as abstract class can't be declared as final
	
}*/
abstract class D{ 
	/*final abstract void fun1() {	//not allowed, as abstract method can't be declared as final
		
	}*/
}

abstract class E{
	/*static abstract void fun2() {	//not allowed, as abstract method can't be declared as static method
		
	}*/
}

abstract class F{
	/*private abstract void fun3() {	//not allowed, as abstract method can't be declared as private method
		
	}*/
}


abstract class A{
	static int x;	 //allowed, as abstract class can contain static data members 
	int a;	//allowed, as abstract class can contain non-static data members 
	abstract public void doTask();
	static void fun() {	//allowed, as abstract class can contain static methods
		System.out.println("in static method");
	}
	A(){	//allowed, as abstract class can contain constructors
		System.out.println("A constructor is executed");
		a = 7;
	}
}
class B extends A{
	static int y;
	int b;
	
	void fun1() {	//allowed, as abstract class can contain non-static methods
		System.out.println("in non-static method");
	}
	B(){
		System.out.println("B constructor is executed");
		b = 6;
	}
	public void doTask() {
		System.out.println("in abstract method");
	}
}
public class Abstract_kw_Demo4 {
	public static void main(String[] args) {
		B r = new B();
		System.out.println(r.x);
		System.out.println(r.y);
		System.out.println(r.a);
		System.out.println(r.b);
		r.fun();
		r.fun1();
		r.doTask();
	}
}
