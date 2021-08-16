package com.java.constructors_blocks_methods;

public class ObjectCall {
	int x;
	int y;
	void m1(ObjectCall e) {
		x = x + 1;
		y = y + 2;
		
		e.x = e.x + 3;
		e.y = e.y + 4;
	}
	public static void main(String[] args) {
		ObjectCall e1 = new ObjectCall();
		ObjectCall e2 = new ObjectCall();
		
		e1.m1(e2);
		System.out.println("e1.x: " +e1.x+ "... e1.y: " +e1.y);
		System.out.println("e2.x: " +e2.x+ "... e2.y: " +e2.y);
		
		e2.m1(e1);
		System.out.println("e1.x: " +e1.x+ "... e1.y: " +e1.y);
		System.out.println("e2.x: " +e2.x+ "... e2.y: " +e2.y);
		
		e1.m1(e1);
		System.out.println("e1.x: " +e1.x+ "... e1.y: " +e1.y);
		System.out.println("e2.x: " +e2.x+ "... e2.y: " +e2.y);
		
		e2.m1(e2);
		System.out.println("e1.x: " +e1.x+ "... e1.y: " +e1.y);
		System.out.println("e2.x: " +e2.x+ "... e2.y: " +e2.y);
	}

}
