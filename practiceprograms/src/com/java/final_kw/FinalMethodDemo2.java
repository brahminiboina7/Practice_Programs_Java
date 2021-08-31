package com.java.final_kw;

class AdminUser{
	final void changePassword() {
		System.out.println("Please Enter old Password");
		System.out.println("__________________________");
		System.out.println("Please Enter new Password");
		System.out.println("__________________________");
		System.out.println("Please confirm new Password");
		System.out.println("__________________________");
	}
}
class Hacker extends AdminUser{
	/*
	void changePassword() {
		System.out.println("Please Enter new Password");
		System.out.println("__________________________");
		System.out.println("Please confirm new Password");
		System.out.println("__________________________");
	} */
	void changePassword(int a) {
		int x = a;
		System.out.println(x);
	}
}
public class FinalMethodDemo2 {
	public static void main(String[] args) {
		AdminUser a = new AdminUser();
		a.changePassword();
		AdminUser b = new Hacker();
		b.changePassword();
		Hacker c = new Hacker();
		c.changePassword(7);
	}
	

}
