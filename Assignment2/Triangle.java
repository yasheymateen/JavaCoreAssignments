package com.ss.basics.assignment;

class Triangle implements Shape {
	int base = 0, height = 0;
	double area;
	
	@Override
	public void input() {
		base = 8;
		height = 16;
	}
	
	@Override
	public void calculateArea() {
		area = 0.5 * (base * height);
		System.out.println("Rectangle Area: " + area);
	}
	
	public void display() {
		
	}
	
	public static void main(String[] args) {
		Triangle shape = new Triangle();
		
		shape.input();
		shape.calculateArea();
	}
}
