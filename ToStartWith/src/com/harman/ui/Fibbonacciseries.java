package com.harman.ui;

public class Fibbonacciseries {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int T0 = Integer.parseInt(args[1]);
		int T1 = Integer.parseInt(args[2]);
		System.out.println(T0);
		System.out.println(T1);
		
		for(int i=3;i<=n;i++)
		{
			int T2=T0+T1;
			System.out.println(T2);
			T0 = T1;
			T1=T2;
			
		}
	}

}
