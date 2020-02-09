package com.calculator;

public class Addition {

	private double op1,op2;
	Addition(double a,double b)
	{
		op1=a;
		op2=b;
	}
	public void Add()
	{
		
		Double d=op1+op2;
		System.out.print(op1+" + "+op2+" = "+d);
	}
}
