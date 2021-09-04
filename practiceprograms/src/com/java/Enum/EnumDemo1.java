package com.java.Enum;

public class EnumDemo1 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		//Color c = new Color();	not allowed

		Color c1,c2,c3;
		c1 = Color.RED;
		c2 = Color.BLACK;
		c3 = Color.WHITE;
		System.out.println("-------------------");  
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println("-------------------");
		System.out.println(Color.Pink);
		System.out.println(Color.Green);
		System.out.println(Color.Purple);
		System.out.println("-------------------");
		System.out.println(Color.Pink.getColorValue());
		System.out.println(Color.Green.getColorValue());
		System.out.println(Color.Purple.getColorValue());
		System.out.println("-------------------");
		System.out.println("-------------------");
		System.out.println(Day7.Sunday);
		System.out.println(Day7.Monday);
		System.out.println(Day7.Tuesday);
		System.out.println(Day7.Wednesday);
		System.out.println(Day7.Thursday);
		System.out.println(Day7.Friday);
		System.out.println(Day7.Saturday);
		
		
	}
}
