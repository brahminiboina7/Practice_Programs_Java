package com.java.constructors_blocks_methods;

public class ToString { 
	int id;
	String name;
	String dept;
	boolean isEmployee;
	public String toString() {
		return "id is: " +id+ "\n" +
				"name is: " +name+ "\n" +
				"department is: " +dept+ "\n"+
				"Is he/she Employee?: " +isEmployee;
				
	}
	public static void main(String[] args) {
		ToString e1 = new ToString();
		e1.id = 127;
		e1.name = "Bhanu";
		e1.dept = "Development";
		e1.isEmployee = true;
		System.out.println(e1);
	}

}
