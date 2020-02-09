package com.calculator;

import java.util.Scanner;

public class MyCalulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Calculator operations:");
		System.out.print("\t1.Addition\n\t2.Subtraction\n\t3.Multiplication\n\t4.Division");
		System.out.print("\nChoose an operation:");
		int op=s.nextInt();
		if(op<1 && op>4)
		{
			System.out.println("Enter valid operation......");
		}
		else
		{
			System.out.print("\nEnter operand 1 : ");
			Double num1=s.nextDouble();
			System.out.print("Enter operand 2 : ");
			Double num2=s.nextDouble();
			if(op==1)
			{
				System.out.print("\nPerforming Addition:");
				Addition add=new Addition(num1,num2);
				add.Add();
				
			}
			else if(op==2)
			{
				System.out.print("\nPerforming Subtraction:");
				Subtraction sub=new Subtraction(num1,num2);
				sub.Sub();
			}
			else if(op==3)
			{
				System.out.print("\nPerforming Multiplication:");
				Multiplication mul=new Multiplication(num1,num2);
				mul.Mul();
			}
			else if(op==4)
			{
				System.out.print("\nPerforming Division:");
				Division div=new Division(num1,num2);
				div.Div();
			}
		}
		
	}

}
