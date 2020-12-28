package com.designpatterns.creational.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		Shape circle=factory.getShape("circle");
		Shape rectangle =factory.getShape("rectangle");
		Shape square =factory.getShape("square");
		
		circle.draw();
		rectangle.draw();
		square.draw();
		
		
	}

}
