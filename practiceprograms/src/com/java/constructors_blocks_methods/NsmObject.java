package com.java.constructors_blocks_methods;

public class NsmObject {
	int x;
	int y;
	void m1() {
		NsmObject e1 = new NsmObject();
		System.out.println("In m1 " +e1);
		System.out.println("in m1 method where e1.x= "+e1.x+" and e1.y= "+e1.y);
		e1.m2();
	}
	
	void m2() {
		NsmObject e1 = new NsmObject();
		e1.x =10;
		e1.y = 30;
		System.out.println("In m2 " +e1);
		System.out.println("in m2 method where e1.x= "+e1.x+" and e1.y= "+e1.y);
		
	}
	 NsmObject m3() {
		NsmObject e1 = new NsmObject();
		e1.x = 17;
		e1.y = 7;
		System.out.println("in m3: " +e1);
		System.out.println("in m3 method where e1.x= "+e1.x+" and e1.y= "+e1.y);
		return e1;
	}
	public static void main(String[] args) {
		
		NsmObject e1 = new NsmObject();
		System.out.println("in mm: " +e1.x);
		e1.x = 20;
		e1.m1();
		System.out.println("in mm: " +e1.x);
		System.out.println("in mm: " +e1.y);
		NsmObject e2 = e1.m3();
		System.out.println("In mm 0" +e2);
		System.out.println("in mm method where e2.x= "+e2.x+" and e2.y= "+e2.y);
	}

}
