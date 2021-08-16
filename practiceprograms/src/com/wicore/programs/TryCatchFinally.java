package com.wicore.programs;

public class TryCatchFinally {
	public static void main(String[] args) {
		int a = 10;
		int b  = 0;
		try {
			//int b = Integer.parseInt(args[1]);
			//int a = Integer.parseInt(args[0]);
			System.out.println(b/a);
			System.out.println(a/b);
		}
		catch(ArithmeticException e )
		{
			System.out.print("Dont Enter 0 as denominator ");
		}
		catch(ArrayIndexOutOfBoundsException e )
		{
			System.out.print(" Enter two arguments ");
		}
		catch(NumberFormatException e )
		{
			System.out.print("Enter Two Integers ");
		}
		catch(Exception e )
		{
			System.out.print("There are some exceptions please check ");
			e.printStackTrace();
		}
		finally {
		System.out.println("Are you happy?");
		}
	}
}
