package com.ss.basics.assignment;

public interface Shape {
	void input();
	void calculateArea();

}

class Circle implements Shape{
	int radius = 0;
	double pi = 3.14, area = 0;
	
	@Override
	public void input()
	{
		radius = 5;
	}
	
	@Override
	public void calculateArea() {
		area = pi * (Math.pow(radius, 2));
		System.out.println("Circle area: " + area);
	}
}

class Rectangle extends Circle{
	int length = 0, width = 0;
	double area;
	public void input() {
		super.input();
		length = 8;
		width = 16;
	}
	public void calculateArea() {
		super.calculateArea();
		area = length * width;
		System.out.println("Rectangle Area: " + area);
	}
}
