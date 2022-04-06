package com.harman.ui;

import com.harman.model.Circle;
import com.harman.model.Rectangle;
import com.harman.model.Shape;

public class AbstractApp {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10,6);
		Rectangle rect2 = new Rectangle(10, 6);
		System.out.println(rect == rect2);
		System.out.println(rect.equals(rect2));
		
		System.out.println(rect);		// fully qualified class name + '@' + hashcode-in-hexa-decimal-form
		System.out.println(rect.toString());
		
		System.out.println(rect.getArea());
		
		Circle cir = new Circle(4);
		System.out.println(cir);
		System.out.println(cir.getArea());

		/* polymorphic way */
		Shape shape;
		
		shape = new Rectangle(10, 6);
		System.out.println(shape.getArea());
		
		shape = new Circle(4);
		System.out.println(shape.getArea());
		
	}

}
