package com.wicore.collections;

import java.util.Collection;
import java.util.HashSet;

class CurrencyNote{
	private final int value;
	public CurrencyNote(int v) {
		value = v;
	}
	public int getValue() {
		return value;
	}
	public String toString() {
		return value+"";
	}
	public boolean equals(Object obj) {
		CurrencyNote c = (CurrencyNote)obj;
		return this.value == c.value;
	}
	public int hashCode() {
		return value;
	}
}
public class TestCase2 {
	public static void main(String[] args) {
		CurrencyNote n1 = new CurrencyNote(5);
		CurrencyNote n2 = new CurrencyNote(10);
		CurrencyNote n3 = new CurrencyNote(20);
		CurrencyNote n4 = new CurrencyNote(50);
		CurrencyNote n5 = new CurrencyNote(100);
		CurrencyNote n6 = new CurrencyNote(200);
		CurrencyNote n7 = new CurrencyNote(5);
		CurrencyNote n8 = new CurrencyNote(20);
		CurrencyNote n9 = new CurrencyNote(500);
		CurrencyNote n10 = new CurrencyNote(10);
		CurrencyNote n11= new CurrencyNote(20);
		CurrencyNote n12 = new CurrencyNote(50);
		
		Collection<CurrencyNote> collection1;
		collection1 = new HashSet<CurrencyNote>();
		collection1.add(n1);
		collection1.add(n2);
		collection1.add(n3);
		collection1.add(n4);
		collection1.add(n5);
		collection1.add(n6);
		Collection<CurrencyNote> collection2;
		collection2 = new HashSet<CurrencyNote>();
		collection2.add(n7);
		collection2.add(n8);
		collection2.add(n9);
		collection2.add(n10);
		collection2.add(n11);
		collection2.add(n12);
		System.out.println(collection1);
		System.out.println(collection2);
		collection1.addAll(collection2);
		System.out.println("--------------------------------------");
		System.out.println(collection1);
		System.out.println(collection2);
		collection2.clear();
		System.out.println("--------------------------------------");
		System.out.println(collection1);
		System.out.println(collection2);
		if(collection1.contains(n12)) {
			System.out.println("--------------------------------------");
			System.out.println("has "+n7);
		}else System.out.println("there is no "+n1);
		
		System.out.println("--------------------------------------");
		System.out.println(collection1.containsAll(collection2));
		collection2.add(new CurrencyNote(25));
		System.out.println(collection1.containsAll(collection2));
		
		// Using ArrayList
		
	}
}
