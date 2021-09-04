package com.java.abstract_kw;
abstract class ATMCard{
	abstract public String getBankName();
}
class SBICard extends ATMCard{
	public String getBankName() {
		return "SBI";
	}
}
class ICICICard extends ATMCard{
	public String getBankName() {
		return "ICICI";
	}
}
class HDFCCard extends ATMCard{
	public String getBankName() {
		return "HDFC";
	}
}
public class ATMMachine {
	public static void readCard(ATMCard c) {
		System.out.println("reading "+c.getBankName()+" bank card");
	}
	public static void main(String[] args) {
		readCard(new SBICard());
		readCard(new ICICICard());
		readCard(new HDFCCard());
	}

}
