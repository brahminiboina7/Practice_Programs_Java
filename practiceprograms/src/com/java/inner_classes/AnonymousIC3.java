package com.java.inner_classes;

public class AnonymousIC3 {
	public static void main(String[] args) {
		AnonymousIC3 e = new AnonymousIC3();
		Thread th1 = new Thread();
		Thread th2 = new Thread() {};
		e.m1(new Thread() {});
		e.m1(new Thread());
		e.m1(new Thread() {
			public void run() {
				System.out.println("hii");
			}
		});
	}

	private void m1(Thread thread) {
		System.out.println("in m1 thread");
		
	}

}
