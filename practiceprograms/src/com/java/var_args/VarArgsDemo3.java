package com.java.var_args;

public class VarArgsDemo3 {
	public static void main(String[] args) {
		String[] a= {"hii Bhanu", "welcome"};
		int[] b= {1,2,3};
		int[][] c = {
						{1,1,1},{11,11,11},{111,111,111}
					};
		show(3,b,a,c);
		
	}
	public static void show(int x,int[] y,String[] str,int[]...z) {
		System.out.println("No.of arguments:"+str.length);
		for(String i:str) {
		System.out.println(i);
		
	}
		System.out.println(x);
		System.out.println("No.of arguments:"+y.length);
		for(int j:y) {
		System.out.println(j);
	}
		System.out.println("No.of arguments:"+z.length);
		for(int[] k:z) {
			for(int l:k)
			System.out.println(l);
		}
	}
}
