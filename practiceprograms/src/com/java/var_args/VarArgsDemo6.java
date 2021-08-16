package com.java.var_args;


public class VarArgsDemo6 {
	
	static void show(Student...s) {
		for(Student st:s) {
			System.out.println("Student id is: "+st.id);
			System.out.println("Student Name is: "+st.name);
		}
		
	}
	public static void main(String...args) {
		Student[] s = new Student[3];
		s[0] = new Student();
		s[1] = new Student();
		s[2] = new Student();
		s[0].id = 401;
		s[0].name = "Brahmini";
		s[1].id = 402;
		s[1].name = "Hema";
		s[2].id = 403;
		s[2].name = "mouli";
		show();
		show(s);
		
	}

}
