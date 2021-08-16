package com.java.generics;
import java.io.Serializable;
import java.util.ArrayList;

public class TypeInference {
	static <T> T pick(T a1, T a2) {
		System.out.println("a1 class: " +a1.getClass());
		System.out.println("a2 class: " +a2.getClass());
		return a2;
	}
	public static void main(String[] args) {
		Serializable s = pick("d", new ArrayList<String>());
		System.out.println("s class: " +s.getClass());
		//type inference with generic methods
		System.out.println("---------------------");
		TypeInference.<Integer> pick(23,5667899);
		System.out.println("---------------------");
		TypeInference.pick(2.2,4.4f);
	}

}
