package com.java.LambdaExpressions;

interface CalculatorOperation1{
	int Perform(int a, int b);
}
class TwoOperands1{
	int x;
	int y;
	public TwoOperands1(int a,int b) {
		x = a;
		y = b;
	}
	public int compute(CalculatorOperation1 operation) {
		return operation.Perform(x,y);
	}
}
public class LamdaExpressions2 {
	public static void main(String[] args) {
		TwoOperands1 op = new TwoOperands1(5,3);
		class Addition implements CalculatorOperation1{

			@Override
			public int Perform(int x, int y) {
				// TODO Auto-generated method stub
				return x+y;
			}
		}
		class Multiplication implements CalculatorOperation1{
				@Override
			public int Perform(int x, int y) {
				// TODO Auto-generated method stub
				return x*y;
			}
		}
		CalculatorOperation1 add = new Addition();
		CalculatorOperation1 mul = new Multiplication();
		int r1 = op.compute(add);
		int r2 = op.compute(mul);
		System.out.println(r1);
		System.out.println(r2);
		
	}

}
