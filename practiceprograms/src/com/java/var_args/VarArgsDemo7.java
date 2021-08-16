package com.java.var_args;


public class VarArgsDemo7 {
	public static void sam(int[] i,String...k) {
		System.out.println("No.of arguments:"+k.length);
		System.out.println("No.of arguments:"+i.length);
		
		for(String s:k) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		int a[] = {1,3,2};
		String b[] = {"b","h","a","n", "u"};
		sam(a);
		sam(a, b);
	}

}
