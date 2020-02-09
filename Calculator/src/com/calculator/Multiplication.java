package com.calculator;

public class Multiplication {

	private double op1,op2;
	Multiplication(double a,double b)
	{
		op1=a;
		op2=b;
	}
	public void Mul()
	{
		Double d=op1*op2;
		System.out.print(op1+" * "+op2+" = "+d);
	}
}
