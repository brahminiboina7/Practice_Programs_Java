package com.java.inheritance;

public class NonSub1 {
	public static void main(String[] args) {
		
		NonSub1 n = new NonSub1();
		n.show();
	}
	Sample s = new Sample();
	void show() {
	//	System.out.println(s.a); --> not allowed since a is private
		System.out.println(s.b);
		System.out.println(s.c);
		System.out.println(s.d);
	}

}
