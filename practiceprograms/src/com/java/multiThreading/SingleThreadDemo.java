package com.java.multiThreading;

public class SingleThreadDemo {
	static void operationA() {
		for(int i=0; i<655;i++) {
			System.out.printf("\r%6d A", i);
		}
	}
	static void operationB() {
		for(int i=0; i<655;i++) {
			System.out.printf("\r%6d B", i);
		}
	}
	public static void main(String[] args) {
		operationA();
		operationB();
		
	}

}
