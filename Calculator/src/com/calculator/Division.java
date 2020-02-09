package com.calculator;

public class Division {

	private double op1,op2;
	Division(double a,double b)
	{
		op1=a;
		op2=b;
	}
	public void Div()
	{
		Double d=op1/op2;
		System.out.print(op1+" / "+op2+" = "+d);
	}
}
