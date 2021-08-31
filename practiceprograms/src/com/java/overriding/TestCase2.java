package com.java.overriding;
/* Rules in OverRiding
Rule 1 - In ovverriding, sub class method number of parameters and order of parameters and type of 
parameters must be same as super class method
*/
class Alpha1{
	void fun1(int a, int b) {
		System.out.println("Alpha fun a: "+a+ " b: "+b);
	}
	void fun2(int a, int b) { //Overridden method
		System.out.println("Alpha fun a: "+a+ " b: "+b);
	}
}
class Beta1 extends Alpha1{
	void fun1(int a, double b) { //Method overloading
		System.out.println("Beta fun a: "+a+" b: "+b);
	}
	void fun2(int x, int y) { //OverRiding method
		System.out.println("Beta fun x: "+x+ " y: "+y);
	}
}
public class TestCase2 {
	public static void main(String[] args) {
		Alpha1 a;
		a= new Alpha1();
		a.fun1(1, 2);
		a.fun2(3, 4);
		//a.fun1(1, 2.00);
		
		Beta1 b;
		b = new Beta1();
		b.fun1(1, 2);
		b.fun2(3, 4);
		b.fun1(1, 2.01);
				
		a = new Beta1();
		a.fun1(3,4);
		a.fun2(24, 4);
		//a.fun1(4, 7.02);
	}

}
