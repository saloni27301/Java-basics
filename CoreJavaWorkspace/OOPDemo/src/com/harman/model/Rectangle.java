package com.harman.model;

public class Rectangle extends Shape {

	public Rectangle() {
		/* default constructor */
	}

	public Rectangle(double firstDimension, double secondDimension) {
		super(firstDimension, secondDimension);
	}

	@Override
	public double getArea() {
		return getFirstDimension()*getSecondDimension();
	}

}
