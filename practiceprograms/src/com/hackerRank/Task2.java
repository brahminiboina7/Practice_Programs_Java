package com.hackerRank;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%05d%n", s1, x);
            }
            System.out.println("================================");
           
           //System.out.printf("Printing simple integer: x = %d\n", x);

    }
}




