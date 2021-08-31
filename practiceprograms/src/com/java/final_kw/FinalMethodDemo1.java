package com.java.final_kw;

class Alpha2{
	final void task() {
		System.out.println("alpha task");
	}
}
class Beta2 extends Alpha2{
	/*	not allowed
	  void task() {
		System.out.println("beta task");
	}
	*/
}
public class FinalMethodDemo1 {
	public static void main(String[] args) {
		Alpha2 a = new Alpha2();
		a.task();
		a = new Beta2();
		a.task();
	}
	

}
