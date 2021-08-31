package com.java.overriding;

/*Rules in OverRiding
Rule 2- In ovverriding sub class method return type must be same as super class method return type
 		or sub type of super class method return type*/
class Alpha2{
	void fun(int a, int b) {
		System.out.println("Alpha fun a: "+a+ " b: "+b);
	}
}
class Beta2 extends Alpha2{
	/*int fun(int a, int b) { 
		System.out.println("Beta fun a: "+a+" b: "+b);
		return a;
	}*/
	
}
public class TestCase3 {
	public static void main(String[] args) {
		Alpha2 a;
		a= new Alpha2();
		a.fun(1, 2);
		
		
		Beta2 b;
		b = new Beta2();
		b.fun(1, 2);
		
				
		a = new Beta2();
		a.fun(3,4);
		
	}

}
