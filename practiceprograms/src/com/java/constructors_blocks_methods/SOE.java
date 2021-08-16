package com.java.constructors_blocks_methods;

public class SOE {
	static SOE e = new SOE();
	static{
		System.out.println("start of sb");
		System.out.println("end of sb");
	}
	int x = 20;
	{
		System.out.println("x : "+x);
		System.out.println("start of nsv");
		System.out.println("end of nsv");
	}
	SOE(){
		System.out.println("start of constructor");
		System.out.println("end of constructor");
	}
	public static void main(String[] args) {
		System.out.println("start of mm");
		System.out.println("end of mm");
	}

}
