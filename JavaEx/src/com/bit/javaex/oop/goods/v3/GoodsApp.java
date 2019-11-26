package com.bit.javaex.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {
		//Goods camera = new Goods(); //사용자정의생성자가 있어서 컴파일러가기본생성자를 끼워넣지 않음.
		
		//생성자를 이용한 초기화
		Goods camera = new Goods("Samsung", 400000);
		camera.showInfo();
		
		Goods notebook = new Goods ("LG그램", 900000);
		notebook.showInfo();
		
		//notebook.setPrice(9000); ->데이터정보변경불가능, price필드는 read only로 변경
		notebook.showInfo();
	}

}
