package com.bit.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		//camera.name = "SAMSUNG";
     	//camera.price = 400000;
		camera.setName("Samsung");
		camera.setPrice(400000);
		
		//System.out.println("Camera : "+camera); //Goods클래스의 주소값이 출력
		//System.out.printf("Carmera : %s, %d원\n", camera.getName(), camera.getPrice());
		camera.showInfo();
		
		Goods notebook = new Goods();
		notebook.setName("LG그램");
		notebook.setPrice(900000);
		//System.out.printf("Notebook : %s, %d원\n", notebook.getName(), notebook.getPrice());
		notebook.showInfo();
	}

}
