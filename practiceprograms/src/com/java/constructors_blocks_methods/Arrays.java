package com.java.constructors_blocks_methods;

public class Arrays {
	public static void main(String[] args) {
		int[] ia = {1,2,3,4,5};
		System.out.println(java.util.Arrays.toString(ia));
		for(int a:ia) {
			System.out.println(a);
		}
		for(int i=0;i<ia.length;i++) {
			System.out.println("\n"+ia[i]);
		}
	}

}
