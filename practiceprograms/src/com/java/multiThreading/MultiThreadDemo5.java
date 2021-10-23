package com.java.multiThreading;
// MultiThreading examples implementing Runnable Interface
class A5 implements Runnable{
	public void run() {
		MultiThreadDemo5.operationA();
	}
}
class B5 implements Runnable{
	public void run() {
		MultiThreadDemo5.operationB();
	}
}
public class MultiThreadDemo5 {
	static void operationA() {
		for(int i=0;i<35;i++) {
			System.out.printf("\r%6d A", i);
		}
	}
	static void operationB() {
		for(int i=0;i<35;i++) {
			System.out.printf("\r%20d B", i);
		}
	}
	public static void main(String[] args) {
		A5 a = new A5();
		B5 b = new B5();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t1.start();
		t2.start();
	}

}
