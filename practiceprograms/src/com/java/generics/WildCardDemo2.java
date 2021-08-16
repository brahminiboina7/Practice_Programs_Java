package com.java.generics;

import java.util.ArrayList;

public class WildCardDemo2 {
	
	public static void main(String[] args) {
		Student1 st1 = new Student1(401, "Bhanu");
		Student1 st2 = new Student1(411,"Swapna");
		Student1 st3 = new Student1(412,"Vydehi");
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		
		System.out.println("---------------------------");

		Employee1 e1 = new Employee1(127,"Brahmini");
		Employee1 e2 = new Employee1(128,"Kavya");
		Employee1 e3 = new Employee1(129,"Nandini");
		
		System.out.println(e1);
		System.out.println(e2); 
		System.out.println(e3);
		
		System.out.println("---------------------------");
		
		ArrayList<Student1> s1 = new ArrayList<Student1>();
		s1.add(st1);
		s1.add(st2);
		s1.add(st3);
		
		ArrayList<Employee1> et1 = new ArrayList<Employee1>();
		et1.add(e1);
		et1.add(e2);
		et1.add(e3);
		
		show1(s1);
		show2(et1);
	}
	
	public static void show1(ArrayList<Student1> l) {
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
			
		}
		System.out.println("---------------------------");

	}
	public static void show2(ArrayList<Employee1> l) {
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	}

}
