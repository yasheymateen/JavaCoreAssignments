package com.ss.basics.assignment;

public class Rectangle extends Circle{
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
	}
	
	public void display(){
		System.out.println("Rectangle Area: " + area);

	public static void main(String[] args) {
		Rectangle shape = new Rectangle();
		
		shape.input();
		shape.calculateArea();
		shape.display();
	}
}
