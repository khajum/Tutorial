package com.ram.factorypattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		// create an Circle object and call its draw method.
		Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();
		
		// Create an Rectangle object and call its draw method.
		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();
		
		//get and Square object and call its draw() method
		Shape shape3 = shapeFactory.getShape("Square");
		shape3.draw();

	}

}
