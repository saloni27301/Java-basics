package com.harman.ui;

import com.harman.model.ComplexNumber;

public class ComplexNumberApp {

	public static void main(String[] args) {
		ComplexNumber c1;
		c1 = new ComplexNumber(5, 6);
		
		// c1.setRealPart(5);
		// c1.setImaginaryPart(10);
		
		System.out.println(c1.getRealPart() + "\t" + c1.getImaginaryPart());
		// System.out.println(c1);		// fully-qualified-class-name + '@' + hashcode-in-hex-form
		// System.out.println(c1.hashCode());	// hashcode-in-decimal-form

		
		ComplexNumber c2 = new ComplexNumber(1, 2);
		// c2.setRealPart(1);
		// c2.setImaginaryPart(2);
		System.out.println(c2.getRealPart() + "\t" + c2.getImaginaryPart());
		// System.out.println(c2);		// fully-qualified-class-name + '@' + hashcode-in-hex-form
		//System.out.println(c2.hashCode());	// hashcode-in-decimal-form
	}

}

