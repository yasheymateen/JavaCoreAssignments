package com.ss.basics.assignment;

 class Circle implements Shape {
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
	}
	
	public void display() {
		System.out.println("Circle area: " + area);
	
	}
	
	public static void main(String[] args) {
		Circle shape = new Circle();
		
		shape.input();
		shape.calculateArea();
		shape.display();
	}
}
