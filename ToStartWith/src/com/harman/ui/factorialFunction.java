package com.harman.ui;

public class factorialFunction {

	static int factorial(int num)
	{
		int i ,fact;
		fact=1;
		for(i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}
	public static void main(String[] args) {
		System.out.println(factorial(6));

	}

}
