package com.harman.ui;

public class App2 {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.err.println("two inputs must be given using command line");
			System.exit(0);
		}

		int firstNumber = Integer.parseInt(args[0]);
		int secondNumber = Integer.parseInt(args[1]);
		int result;

		result = firstNumber + secondNumber;
		System.out.println("Sum = " + result);

		result = firstNumber - secondNumber;
		System.out.println("Difference = " + result);

		if (secondNumber == 0) {
			System.err.println("denominator cannot be 0");
			System.exit(0);
		}
		
		result = firstNumber / secondNumber;
		System.out.println("Quotient = " + result);

	}

}
