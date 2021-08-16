package com.wicore.encapsulation;

public class Student {
	private String sname = "Pavani";
	private String sbranch = "ECE" ;
	private int sno = 407;
	private double sfee = 20202;
	public double getSfee() {
		return sfee;
	}
	public void setSfee(double sfee) {
		this.sfee = sfee;
	}
	void setSName(String sname) {
		this.sname = sname;
	}
	String getSName() {
		return sname;
	}
	public String getSbranch() {
		return sbranch;
	}
	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String toString() {
		return "sname =" + "sandeep"+ "\n" +
				"sno = " +  98 +"\n"+
			   "sbranch =" + "ECE" +"\n" +
				"sfee ="+30000;
		/*return sname +"\n"+
				sno +"\n"+
				sbranch +"\n"+
				sfee;*/
				
				
	}

}
