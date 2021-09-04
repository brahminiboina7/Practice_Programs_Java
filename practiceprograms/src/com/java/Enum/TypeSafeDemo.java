package com.java.Enum;

public class TypeSafeDemo {
	public static void main(String[] args) {
		Color c = Color.RED;
		Day7 birthday = Day7.Wednesday;
		//System.out.println(c==birthday); -->c error bcz of type safety.
	}

}
