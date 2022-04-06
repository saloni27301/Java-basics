package com.harman.ui;

public class SimpleInterest {

	public static void main(String[] args) {
		int Principle = Integer.parseInt(args[0]);
		int Rate = Integer.parseInt(args[1]);
		int Time = Integer.parseInt(args[2]);
		int SI = (Principle * Rate/100 * Time) / 100 ;
		System.out.println(SI);

	}

}
