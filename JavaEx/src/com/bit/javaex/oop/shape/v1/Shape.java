package com.bit.javaex.oop.shape.v1;

//도형을 작성하기 위한 부모 설계 클래스 -> 실체화해야 할 필요가 없으므로 추상클래스로 생성
public abstract class Shape {
	//필드
	protected int x;
	protected int y;
	
	//생성자
	public Shape(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	//추상메서드 : 구현부는 없으며 상속받은 자식 클래스에서 반드시 구현해주어야한다.
	public abstract void draw();
	public abstract double area();
}
