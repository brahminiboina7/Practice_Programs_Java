package com.java.multiThreading;

public class Thread_Demo2 {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.setName("a");
		t2.setName("b");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t1.getPriority());
		t1.setPriority(7);
		System.out.println(t1.getPriority());
		System.out.println(t1);
		System.out.println(t2);
	}


}
