package com.java.ExceptionHandling;

class DocNotFoundException extends Exception{
	
}

class Printer{
	void allocatePrinter() {
		System.out.println("printer allocated");
	}
	void releasePrinter() {
		System.out.println("printer released");
	}
}

class TryCatchFinallyDemo{
	static void printDoc(int a) {
		Printer p = new Printer();
		try {
			p.allocatePrinter();
			if(a==1) {
				throw new DocNotFoundException();
			}
			if(a==2) {
				throw new RuntimeException("unknown error");
			}
		}catch(DocNotFoundException e) {
			System.out.println("caught DNFE");
		}
		finally {
			p.releasePrinter();
		}
	}
	public static void main(String[] args) {
		printDoc(0);
		printDoc(1);
		printDoc(2);
		
	}
}
