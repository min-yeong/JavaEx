package com.bit.javaex.oop.goods.v3;

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
	
/*	public void setName(String name) {
		this.name = name; //this.는 해당인스턴스를 의미함
	}
	
	public void setPrice(int price) {
	if (price>0)
		this.price = price;
	}
*/   //setter가 없으면 feild는 read only가 된다.
	
	//method영역
	public void showInfo() {
		System.out.println("상품이름 : "+name);
		System.out.println("상품가격 : "+price);
	}
	
	//생성자	
	public Goods(String name) { //
		this.name= name;
	} 
	
	//만약 코드에 생성자가하나도없다면 컴ㅠㅏ일러가 기본생성자를 자동으로 추가한다.(반드시하나는있어야함)
	public Goods(String name, int price) {
		//super(); //부모생성자호출 -> 부모로부터 물려받은 필드 초기화, 명시적으로 부모생성자를 호출하지 않으면 컴파일러가 기본 부모 생 서자를 끼워넣는다. 
		//this.name =name;
		this(name);
		this.price=price;
	}
}
