package com.java.var_args;

public class VarArgsDemo5 {
	public static void main(String[] args) {
		int a[] = {23,44};
		int b[] = {78,12,33};
		int c[][] = {
						{1,0,0}, {0,1,0}, {0,0,1}
					};
		show(a);
		show(b);
		show(a,b);
		show(c);
		
		}
	public static void show(int[]... x){
		
		System.out.println("Number of arguments: " + x.length);
		for(int[] k:x) {
		for(int p:k) {
			System.out.println(p);
		}
		
		}	
	}
		
	}


