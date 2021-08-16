package com.java.var_args;

public class VarArgsDemo4 {
	
	static void show(Student...s) {
		for(Student st:s) {
			System.out.println("Student id is: "+st.id);
			System.out.println("Student Name is: "+st.name);
		}
		
	}
	public static void main(String...args) {
		Student s1 = new Student();
		
		s1.id = 401;
		s1.name = "Brahmini";
		Student s2 = new Student();
		s2.id = 402;
		s2.name = "Hema";
		Student s3 = new Student();
		s3.id = 403;
		s3.name = "mouli";
		show();
		show(s1);
		show(s2);
		show(s3);
	}

}
