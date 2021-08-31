package com.java.super_kw;
//Super Keyword
//Case2: Accessing super class hidden data members inside subclass
class Foo{
	int a = 5;
}
class Bar extends Foo{
	String a = "Bhanu";
	void method() {
		System.out.println(a);
		System.out.println(super.a);
	}
}
public class TestCase2 {
	public static void main(String[] args) {
		Bar b = new Bar();
		b.method();
	}
	

}
