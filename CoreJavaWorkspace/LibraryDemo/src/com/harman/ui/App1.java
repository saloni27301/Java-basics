package com.harman.ui;

/* it is an incorrect program since we are not following coding standards */

public class App1 {

	public static void main(String[] args) {
		try {
			int firstNumber = Integer.parseInt(args[0]);
			int secondNumber = Integer.parseInt(args[1]);
			int result;
			
			result = firstNumber + secondNumber;
			System.out.println("Sum = " + result);
			
			result = firstNumber - secondNumber;
			System.out.println("Difference = " + result);
			
			try {
				result = firstNumber / secondNumber;
				System.out.println("Quotient = " + result);
			} catch(ArithmeticException excep) {
				System.out.println("denominator cannot be zero");
			}
		} catch(ArrayIndexOutOfBoundsException excep) {
			System.out.println("no command line arguments are given.");
		} finally {
			System.out.println("exceptions are handled");
		}
	}

}
