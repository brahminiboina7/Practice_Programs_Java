package com.java.final_kw;
class Alpha{
	final static int a = 7;
	final static int b;
	final static int c;
	static {
		b = 10;                    
	}
	Alpha(){
		//c = 3;	not allowed
	}
	static void fun() {
		//c = 2;	not allowed
	}
	static {
		c = 1;
	}
}
public class FinalSVDemo {
	public static void main(String[] args) {
		System.out.println(Alpha.a);
		System.out.println(Alpha.b);
		System.out.println(Alpha.c);
		//Alpha.a = 6;	not allowed
		//Alpha.b = Alpha.a+ 1;	not allowed
	}

}
