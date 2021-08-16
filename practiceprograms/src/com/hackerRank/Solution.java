package com.hackerRank;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a no.");
        int i = scan.nextInt();
        System.out.print("enter a no.");
        double d = scan.nextDouble();
        System.out.println("Enter the string:");
        String s=" ";
        s= scan.nextLine();
        s+=scan.nextLine();
        System.out.print("");
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
