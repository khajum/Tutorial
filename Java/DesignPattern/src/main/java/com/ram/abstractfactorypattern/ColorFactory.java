package com.ram.abstractfactorypattern;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String color) {
		if(color == null) {
			return null;
		}
		
		if(color.equalsIgnoreCase("Red")) {
			return new Red();
		} else if (color.equalsIgnoreCase("Green")) {
			return new Green();
		} else if (color.equalsIgnoreCase("Blue")) {
			return new Blue();
		}
		
		return null;
	}

}
