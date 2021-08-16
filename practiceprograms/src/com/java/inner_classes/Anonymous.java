package com.java.inner_classes;

public class Anonymous implements AnonymousIC2 { 
	public static void main(String[] args) {
		// using Lambda Expressions.
		AnonymousIC2 plus = (a,b) -> a+b;
		AnonymousIC2 sub = (a,b) -> a-b;
		AnonymousIC2 mul= (a,b) -> a*b;
		
		int p = plus.calculate(2, 3);
		int s = sub.calculate(2, 3);
		int m = mul.calculate(2, 3);
		System.out.println("addition of given numbers is:\n" +p);
		System.out.println("subtraction of given numbers is:\n" +s);
		System.out.println("multiplication of given numbers is:\n" +m);
		
		//using anonymous class
		AnonymousIC2 a = new AnonymousIC2() {
			@Override
				public int calculate(int a, int b) {
					// TODO Auto-generated method stub
					return a+b;
				}
			};
			
		int q = a.calculate(3,4);
		System.out.println("addition of given numbers using anonymous inner class is:\n" +q);
	}

	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
