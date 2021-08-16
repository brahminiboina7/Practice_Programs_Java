package com.java.LambdaExpressions;

interface CalculatorOperation{
	int Perform(int a, int b);
}
class TwoOperands{
	int x;
	int y;
	public TwoOperands(int a,int b) {
		x = a;
		y = b;
	}
	public int compute(CalculatorOperation operation) {
		return operation.Perform(x,y);
	}
}
public class LamdaExpressions1 {
	public static void main(String[] args) {
		TwoOperands op = new TwoOperands(5,3);
		class Addition implements CalculatorOperation{

			@Override
			public int Perform(int x, int y) {
				// TODO Auto-generated method stub
				return x+y;
			}
		}
		class Multiplication implements CalculatorOperation{
				@Override
			public int Perform(int x, int y) {
				// TODO Auto-generated method stub
				return x*y;
			}
		}
		CalculatorOperation add = new Addition();
		CalculatorOperation mul = new Multiplication();
		int r1 = op.compute(add);
		int r2 = op.compute(mul);
		System.out.println(r1);
		System.out.println(r2);
		
	}

}
