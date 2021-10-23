package com.java.multiThreading;

class A4 implements Runnable{
	public void run() {
		String ctn = Thread.currentThread().getName();
		for(int i=0;i<30;i++) {
				System.out.printf("\r%6d "+ctn, i);
		}
	}
}
class B4 implements Runnable{
	public void run() {
		String ctn = Thread.currentThread().getName();
		for(int i=0;i<30;i++) {
				System.out.printf("\r%25d "+ctn, i);
		}
	}
}

public class MultiThreadDemo4 {
	public static void main(String[] args) {
		A4 a = new A4();
		B4 b = new B4();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t1.start();
		t2.start();
		String ctn = Thread.currentThread().getName();
		for(int i=0;i<30;i++) {
			System.out.printf("\r%40d "+ctn, i);
	}
	}

}
