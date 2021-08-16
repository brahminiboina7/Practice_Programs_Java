package com.wicore.encapsulation;

public class College {
	public static void main(String[] args) {
		Student st = new Student();
		st.setSName("Bhanu");
		st.setSbranch("ECE");
		st.setSno(401);
		st.setSfee(20000);
		System.out.println(st.getSName());
		System.out.println(st.getSbranch());
		System.out.println(st.getSno());
		System.out.println(st.getSfee());
		System.out.println(st);
	    	
		
	}

}
