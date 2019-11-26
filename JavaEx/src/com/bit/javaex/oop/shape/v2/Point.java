package com.bit.javaex.oop.shape.v2;

public class Point implements Drawable {
	//필드(Protected: 상복받은 클래스도접근가능)
	protected int x;
	protected int y;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x; //this.는 해당인스턴스를 의미함
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.printf("점 [%d, %d]를 그렸습니다.%n", x, y);
	}
	
	//같은 이름의 리턴 타입, 같은 이름의 메서드를 중복해서 선언하는것 (메서드 오버로딩)
	//메서드 인자값에 따라 조금씩 다른 기능을 수행하도록 만들 수 있다.
	public void draw(boolean show) {
		//boolean show 가 true면 -> 그렸습니다.
		//               false면 -> 지웠습니다.
		String message = String.format("점 [%d, %d]를", x, y);
		if(show) message +="그렸씁니다.";
		else message +="지웠씁니다.";
		
		System.out.println(message);
	}	
	
	//만약 코드에 생성자가하나도없다면 컴ㅠㅏ일러가 기본생성자를 자동으로 추가한다.(반드시하나는있어야함)
	public Point(int x, int y) {
		//super(); //부모생성자호출 -> 부모로부터 물려받은 필드 초기화, 명시적으로 부모생성자를 호출하지 않으면 컴파일러가 기본 부모 생 서자를 끼워넣는다. 
		this.x =x;
		this.y=y;
	}
}
