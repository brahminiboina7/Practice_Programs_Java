package com.java.Enum;

enum Color {
	RED, BLACK, WHITE,Pink(16),Green(7),Purple(10) ;
	private int colorvalue;
	
	static void fun() {
		//Color c = new Color();	not allowed
	}
	
	Color(){
		System.out.println("color object is created");
	}
	Color(int cv){
		colorvalue = cv;
	}
	int getColorValue() {
		return colorvalue;
	}
	
}
