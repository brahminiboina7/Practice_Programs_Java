package com.java.super_kw;
//Super Keyword
//Case1: Calling Super class constructor

class Point{
	private int x;
	private int y;
	public Point() {
		// TODO Auto-generated constructor stub
	}
	public Point(int a, int b) {
		x = a;
		y = b;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
}
class ThreeDPoint extends Point{
	private int z;
	public ThreeDPoint() {
		// TODO Auto-generated constructor stub
	}
	public ThreeDPoint(int a, int b, int c) {
		//x = a; 	//not allowed as x & y are private members are inherited but not visible
		//y = b;
		super(a,b);
		z = c;
		System.out.println("z: " +z);
	}
	int getZ() {
		return z;
	}
}
public class TestCase1 {
	public static void main(String[] args) {
		ThreeDPoint t;
		t = new ThreeDPoint(5,6,7);
		
	}
	
	

}
