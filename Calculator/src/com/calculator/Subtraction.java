package com.calculator;

public class Subtraction {

	private double op1,op2;
	Subtraction(double a,double b)
	{
		op1=a;
		op2=b;
	}
	public void Sub()
	{
		Double d=op1-op2;
		System.out.print(op1+" - "+op2+" = "+d);
	}
}
