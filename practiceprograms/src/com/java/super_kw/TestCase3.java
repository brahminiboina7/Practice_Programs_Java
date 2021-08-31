package com.java.super_kw;
//Super Keyword
//Case3: Calling super class overridden method from subclass
class Foo1{
	void method() {
		System.out.println("foo method");
	}
}
class Bar1 extends Foo1{
	
	void method() {
		System.out.println("Bar Method");
		super.method();
	}
}
public class TestCase3 {
	public static void main(String[] args) {
		Bar1 b = new Bar1();
		b.method();
	}
	

}
