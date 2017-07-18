package com.ram.abstractfactorypattern;

public abstract class AbstractFactory {
	abstract Shape getShape(String shapeType);
	abstract Color getColor(String color);

}
