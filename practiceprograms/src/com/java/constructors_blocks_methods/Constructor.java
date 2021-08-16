package com.java.constructors_blocks_methods;

public class Constructor{
	Constructor(){
		System.out.println("In Constructor");
		return; //constructor return type is void
	}
	public static void main(String[] args){
		Constructor c = new Constructor();
		System.out.println("In Main Method");
	}
}
