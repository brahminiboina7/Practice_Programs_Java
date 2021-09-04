package com.java.abstract_kw;

abstract class Account{
	abstract public void deposite();
	abstract public void withdrawl();
	
}
class SBIAccount extends Account{
	public void deposite() {
		System.out.println("in sbi account deposite");
	}
	public void withdrawl() {
		System.out.println("in sbi account withdrawl");
	}
}
class ICICIAccount extends Account{
	public void deposite() {
		System.out.println("in icici account deposite");
	}
	public void withdrawl() {
		System.out.println("in icici account withdrawl");
	}
}
class AxisAccount extends Account{
	public void deposite() {
		System.out.println("in axis account deposite");
	}
	public void withdrawl() {
		System.out.println("in axis account withdrawl");
	}
}
public class Abstract_kw_Demo2 {
	
}
