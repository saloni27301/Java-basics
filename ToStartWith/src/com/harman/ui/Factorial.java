package com.harman.ui;

public class Factorial {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int fact = Integer.parseInt(args[1]);
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
