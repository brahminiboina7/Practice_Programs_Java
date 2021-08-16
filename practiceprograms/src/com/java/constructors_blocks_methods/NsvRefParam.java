package com.java.constructors_blocks_methods;

public class NsvRefParam {
	int x =10;
	int y = 20;
	public NsvRefParam(NsvRefParam e3) {
		System.out.println("in constructor e: " +e3);
	}
	
	public NsvRefParam() {
		System.out.println("In Constructor");
	}
	public void m1(NsvRefParam e) {
		System.out.println("in m1 e: " +e);//here classname@hashcode is printed.
		//Here e1 reference is stored in "this" kw and e2 reference is stored in "e". Hence it shows that both e and e2 pointing to same object
		System.out.println(+e.x);
		
	}
	
	public static void main(String[] args) {
		NsvRefParam e1 = new NsvRefParam();
		NsvRefParam e2 = new NsvRefParam(e1);
		e2.x = 40;
		e1.m1(e2);
		System.out.println(+e1.x);
		System.out.println(+e2.x);
		
	}

}
