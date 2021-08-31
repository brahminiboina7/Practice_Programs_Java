package com.java.super_kw;
//Super Keyword
//Case3: Calling super class overridden method from subclass
class Point1{
	private int x;
	private int y;
	
	public Point1(int a,int b) {
		x = a;
		y = b;
	}
	void show() {
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
class ThreeDPoint1 extends Point1{
	private int z;
	
	public ThreeDPoint1(int a, int b, int c) {
		//x = a; 	//not allowed as x & y are private members are inherited but not visible
		//y = b;
		super(a,b);
		z = c;
		
	}
	void show() {
		super.show();
		System.out.println("z = " +z);
	}
}
public class TestCase4 {
	public static void main(String[] args) {
		ThreeDPoint1 t;
		t = new ThreeDPoint1(5,6,7);
		t.show();
		
	}
}
