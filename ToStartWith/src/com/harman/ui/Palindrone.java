package com.harman.ui;

public class Palindrone {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int t=	Integer.parseInt(args[0]);
		int sum= Integer.parseInt(args[1]);
		while(n>0)
		{
			int r =n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(t==sum)
		{
			System.out.println("Palindrone Number");
		}
		else
		{
			System.out.println("Not Palindrone");
		}
	}

}
