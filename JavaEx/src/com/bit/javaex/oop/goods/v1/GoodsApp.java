package com.bit.javaex.oop.goods.v1;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		camera.name = "SAMSUNG";
		camera.price = 400000;
		
		//System.out.println("Camera : "+camera); //Goods클래스의 주소값이 출력
		System.out.printf("Carmera : %s, %d원\n", camera.name, camera.price);
		
		Goods notebook = new Goods();
		notebook.name = "LG그램";
		notebook.price = 900000;
		System.out.printf("Notebook : %s, %d원\n", notebook.name, notebook.price);
	}

}
