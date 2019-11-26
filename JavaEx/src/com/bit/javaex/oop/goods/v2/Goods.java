package com.bit.javaex.oop.goods.v2;

public class Goods {
	//필드선언
	//private으로 접근제한
	private String name;
	private int price;
	
	//Getter와 Setter를 이용한 우회조건 (은닉되어있는 데이터에 접근)
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name; //this.는 해당인스턴스를 의미함
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	//method영역
	public void showInfo() {
		System.out.println("상품이름 : "+name);
		System.out.println("상품가격 : "+price);
	}
}
