package com.harman.model;

public class Circle extends Shape {

	public Circle() {
		/* default constructor */
	}
	
	public Circle(double firstDimension) {
		super(firstDimension);
	}

	@Override
	public double getArea() {
		return Math.PI*getFirstDimension()*getFirstDimension();
	}

}
