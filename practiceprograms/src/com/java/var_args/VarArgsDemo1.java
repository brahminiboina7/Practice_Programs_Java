 package com.java.var_args;

public class VarArgsDemo1 {
	public static void sum(int... a) {
		System.out.println("No. Of Parameters:" +a.length);
		int s = 0;
		for(int i:a) {
			s=s+i;
			
		}
		System.out.println("Sum is:" +s);
	}
	public static void main(String[] args) {
		sum();
		sum(2);
		sum(3,2);
		sum(3,2,1,4,5);
		int a[] = new int[3];
		a[0] = 11;
		a[1]= 2;
		a[2] = 3;
		sum(a);
	}
}
	


