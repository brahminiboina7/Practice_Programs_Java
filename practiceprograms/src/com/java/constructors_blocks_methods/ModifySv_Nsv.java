package com.java.constructors_blocks_methods;

public class ModifySv_Nsv {
	static int a = 10;
	static int b = 20;
	int x = 30;
	int y = 40;
	public static void main(String[] args) {
		ModifySv_Nsv e1 = new ModifySv_Nsv();
		ModifySv_Nsv e2 = new ModifySv_Nsv();
		ModifySv_Nsv e3 = null;
		
		System.out.println("NSV before modification for e1 : " +e1.x+ " & " +e1.y);
		System.out.println("SV before modification for e1 : " +e1.a+ " & " +e1.b);
		System.out.println("SV before modification for e3 : " +e3.a+ " & " +e3.b);
		
		e2.a = 100;
		e2.b = 200;
		
		e2.x = 300;
		e2.y = 400;
		
		System.out.println("NSV after modification for e1 : " +e1.x+ " & " +e1.y);
		System.out.println("NSV after modification for e2 : " +e2.x+ " & " +e2.y);
		System.out.println("SV after modification for e1 : " +e1.a+  " & " +e1.b);
		System.out.println("SV after modification for e3 : " +e3.a+ " & " +e3.b);
		
	}

}
