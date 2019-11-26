package com.bit.javaex.oop.casting;

//Animal class 상속
public class Dog extends Animal {
	//생성자
	public Dog(String name) {
		super(name);	//animal클래스에 기본생성자를 만들지 않았기 때문에 어떤 값을 가져올 것인지 명시해줘야 함
	}
	
	//메서드
	public void bark() {
		System.out.println(name+": 멍멍!");
	}
}

//클래스에는 반드시 생성자가 존재해야한다. 없을 시 자바컴파일러에서 기본생성자를 임의로 생성
//생성자내부에서는 반스디 부모클래스가 생성자 먼저 호출 -> 부분 클래스 생성자 호출하지 않앗다면 자바컴파일러가 임의로 부모의 기본생성자를 호출하여 끼워넣는다.