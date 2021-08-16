package com.java.Patterns;

public class PatternNum {
	public static void main(String[] args) {
		int n = 4;
		int t=0;
		int k=0;
		int p = 0;
		for(int i=1;i<=3;i++) {
			
			if(i==1) {
				System.out.print(" "+n);
			} 
			for(int j=1;j <= p+3;j++) {
				if(i==2 && j==1) {
					
					n=n*3;
					System.out.print(" "+n);
					t=n;
					//p=3;
				}
				if(i==3 && j==1) {
					n=n*3;
					System.out.print(" "+n);
					t=n;
					p=3;
				}
				
				if(j>1 && i>1) {
					
					k=t+2;
					System.out.print(" "+k);
					t=k;
					
				}
				
				
			}
			
			
			System.out.println();
		}
	}

}
