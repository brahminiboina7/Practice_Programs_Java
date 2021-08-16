package com.wicore.programs;

public class StringSplit {
	public static void main(String[] args) {
		String s = "Nano wicore labs ltd";
		String[] b = s.split(" ");
		for(String c : b) {
			System.out.println(c);
		}
	}

}
