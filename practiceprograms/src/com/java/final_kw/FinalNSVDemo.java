package com.java.final_kw;
class Alpha1{
	final int a = 7;
	final int b;
	final int c;
	final int d;
	
	{
		b = 17;
	}
	
	Alpha1(int x){
		c = 27;
		d = x;
	}
}
public class FinalNSVDemo {
	public static void main(String[] args) {
		Alpha1 r = new Alpha1(37);
		
		System.out.println(r.a);
		//r.a = 8;	not allowed
		System.out.println(r.b);
		//r.b = r.a+1;	not allowed
		System.out.println(r.c);
		System.out.println(r.d);
		
		Alpha1 r1 = new Alpha1(47);
		System.out.println(r1.d);
		
	}
}
