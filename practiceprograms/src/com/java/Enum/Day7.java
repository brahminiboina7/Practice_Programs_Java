package com.java.Enum;

public enum Day7 {
	Sunday("sleep"), Monday("sad"), Tuesday("boring"), Wednesday("thinking"), Thursday("creativity"), Friday("waiting for sunday"), Saturday("waiting for evng");
	private String name;
	Day7(String s){
		  name = s;
	}
	public String toString() {
		return name;
		
	}

}
