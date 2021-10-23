package com.java.multiThreading;

class Painter{
	void doPaint(boolean flag) {
		String ctn = Thread.currentThread().getName();
		for(int i=0;i<30;i++) {
			if(flag) {
				System.out.printf("\r%6d "+ctn, i);
			}else {
				System.out.printf("\r%40d "+ctn, i);
			}
		}
	}
}

class ThreadA3 extends Thread{
	Painter p = new Painter();
	public void run() {
		if(getName().equals("FirstThread"))
			p.doPaint(true);
		if(getName().equals("SecondThread"))
			p.doPaint(false);
	}
}

public class MultiThreadDemo3 {
	public static void main(String[] args) {
		ThreadA3 t1 = new ThreadA3();
		t1.setName("FirstThread");
		ThreadA3 t2 = new ThreadA3();
		t2.setName("SecondThread");
		t1.start();
		t2.start();
	}

}
