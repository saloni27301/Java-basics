package com.harman.ui;

public class Multiplication {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int multi = Integer.parseInt(args[1]);
		for(int i=1;i<=n;i++)
		{
			multi=n*i;
			System.out.println(multi);
		}
		
	}

}
