package com.java.multiThreading;

class ThreadA1 extends Thread{
	public void run() {
		MultiThreadDemo1.operationA();
	}
}

class ThreadB1 extends Thread{
	public void run() {
		MultiThreadDemo1.operationB();
	}
}
public class MultiThreadDemo1 {
	static void operationA() {
		for(int i=0;i<10;i++) {
			System.out.printf("\r%6d A", i);
		}
	}
	static void operationB() {
		for(int i=0;i<10;i++) {
			System.out.printf("\r%20d B", i);
		}
	}
	public static void main(String[] args) {
		ThreadA1 ta = new ThreadA1();
		ThreadB1 tb = new ThreadB1();
		ta.start();
		tb.start();
	}

}
