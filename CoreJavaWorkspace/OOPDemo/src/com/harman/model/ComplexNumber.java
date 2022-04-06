package com.harman.model;

public class ComplexNumber {
	/* data members (or) instance variable */
	private double realPart;
	private double imaginaryPart;
	
	/* parameter constructor */
	public ComplexNumber(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	/* methods */
	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}
	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	
	public double getRealPart() {
		return realPart;
	}
	public double getImaginaryPart() {
		return imaginaryPart;
	}
}
