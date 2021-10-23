package com.java.multiThreading;

class ThreadA2 extends Thread{
	public void run() {
		for(int i=0;i<30;i++) {
			System.out.printf("\r%6d ThreadA", i);
		}
	}
}
class ThreadB2 extends Thread{
	public void run() {
		for(int i=0;i<30;i++) {
			System.out.printf("\r%20d ThreadB", i);
		}
	}
}
public class MultiThreadDemo2 {
	public static void main(String[] args) {
		ThreadA2 ta = new ThreadA2();
		ThreadB2 tb = new ThreadB2();
		ta.start();
		tb.start();
		for(int i=0;i<30;i++) {
			System.out.printf("\r%40d main", i);
		}
	}

}
