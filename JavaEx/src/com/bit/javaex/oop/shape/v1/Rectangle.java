package com.bit.javaex.oop.shape.v1;

public class Rectangle extends Shape {	//추상메서드를 구현하지 않으면 Error
	//추가 필드 선언
	protected int width;
	protected int height;
	
	//생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	@Override 
	public void draw() {
		System.out.printf("사각형 [x=%d, y=%d, w=%d, h=%d, area=%f]을 그렸습니다.%n", x, y, width, height, area());
	}
	
	@Override 
	public double area() {
		return width*height;
	}
}
