package com.java.generics;
class Numeric <T> {
	private final T value;
	Numeric (T v){
		value = v;
	}
	T getValue() {
		return value;
	}
	void show() {
		value.getClass().getName();
	}
}

public class ObjectNumericDemo {
	public static void main(String[] args) {
		Numeric <Integer> in1 = new Numeric <Integer>(23);
		int r = in1.getValue()+1;
		System.out.println("integer " +r);
		
		Numeric <Double> nd = new Numeric <Double>(2.3);
		double d = nd.getValue()+1.7;
		System.out.println("double " +d);
		
		//Numeric <String> in2;
		Numeric <Integer> in2;
		Numeric rn1 = new Numeric("20");
		in2 = rn1; //will get ClassCastException
		int s = in2.getValue()+1;
		//String s = in2.getValue()+1;
		System.out.println("raw type  " +s);
		
		
	}

}
