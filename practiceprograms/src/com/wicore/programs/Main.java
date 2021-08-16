package com.wicore.programs;

public class Main {

	public static void main(String[] args) {
		GSMPhone i = new Jio();
		GSMPhone a = new Airtel();
		GSMPhone v = new Vodafone();
		GSMPhone j = new Jio();
        i.callingThrough();
        a.callingThrough();
        v.callingThrough();
        j.callingThrough();
	}

}
