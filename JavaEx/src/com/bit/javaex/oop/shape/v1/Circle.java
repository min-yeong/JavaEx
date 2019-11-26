package com.bit.javaex.oop.shape.v1;

public class Circle extends Shape {
	//필드 추가
	protected double radious;	//반지름
	
	//생성자
	public Circle(int x, int y, double radious) {
		super(x, y);
		this.radious = radious;
	}
	
	@Override
	public void draw() {
		System.out.printf("원 [x=%d, y=%d, area=%f]을 그렸습니다.", x, y, area());
	}

	@Override
	public double area() {
		double area = Math.PI*Math.pow(radious, 2);
		return area;
	}

}
