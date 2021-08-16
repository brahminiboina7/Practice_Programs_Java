package com.java.constructors_blocks_methods;

public class NsmThis {
	int x = 20;
	int y = 30;
	static int a;
	static NsmThis e2 = new NsmThis();
	
	static {
		System.out.println(e2.x);
		
	}
	void SetXY(){
		this.x = 40;
		this.y = 50;
	}
	void printXY(){
		System.out.println("x: "+x+ " ..... y: "+y);
	}
	void m1() {
		this.SetXY();
		this.printXY();
	}
	public static void main(String[] args) {
		
		NsmThis e1 = new NsmThis();
		e1.m1();
		System.out.println(e1.a);
		System.out.println(e2.y);
		
		
		
	}
}
