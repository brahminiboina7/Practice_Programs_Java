package com.java.generics;

class Team<T> { }

class Student1 {
	private int rollno;
	private String name;
	public Student1(int r, String n) {
		this.rollno = r;
		this.name = n;
	}
	public String toString() {
		return rollno+", "+name;
	}
}

class Employee1 {
	private int eid;
	private String name;
	public Employee1(int e, String n) {
		this.eid = e;
		this.name = n;
	}
	public String toString() {
		return eid+", "+name;
	}
}

public class WildCardDemo1 {
	
	public static void show1(Team <Student1> t) {
		
		System.out.println(t);
		
	}
	
public static void show2(Team <?> t) {
		
		System.out.println(t);
		
	}
	
	public static void main(String[] args) {
		Team<Student1> st = new Team<Student1>();
		Team<Employee1> et = new Team<Employee1>();
		show1(st);
		//show1(et);
		show2(st);
		show2(et);
	}

}
