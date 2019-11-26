package com.bit.javaex.oop;

//기본적으로 클래스나 인터페이스 등은 각ㅈㅏ개별 파일에 작성할 것

abstract class Animal {
	//추상 클래스이므로 객체화 불가
	//필드
	protected String name;
	protected int age;
	
	//생성자
	public Animal(String name) {
		this.name = name;
	}
	
	//먼저 따로 선언한 name 먼저 호출하고 값 대입후,  age선언
	public Animal(String name, int age) {
		this(name);
		this.age = age;
	}
	
	//메서드
	public void eat() {
		System.out.printf("%s is eating...%n", name);
	}
	
	public abstract void say(); //반드시 Override
}

class Human extends Animal {
	//생성자
	public Human(String name, int age) {
		super(name, age);
	}
	
	@Override 
	public void say() {
		System.out.printf("안녕, 내이름은%s야%n", name);
	}
}
class Panda extends Animal {
	public Panda(String name, int age) {
		super(name, age);
	}
	//메서드
	@Override
	public void say() {
		System.out.println("zzz.....");
	}
}

interface Kungfu {
	public void kungfu(); //추상메서드지만 abstract는 없어도 된다.
}
interface Flyable {
	public void fly();
}

class KungfuPanda extends Panda implements Kungfu {
	//생성자
	public KungfuPanda(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void kungfu() {
		System.out.println(name+" : 아뵤~!");
	}
}

class KungfuHuman extends Human implements Kungfu {
	//생성자
	public KungfuHuman(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void kungfu() {
		System.out.println(name+" : I know Kungfu!");
	}
}

class TheOne extends Human implements Kungfu, Flyable {
	//상속은 단일 부모로부터만 받을 수 있지만 인터페이스는 여러개를 구현할 수 있다.
	public TheOne(String name, int age) {
		super(name, age);
	}

	@Override
	public void fly() {
		System.out.println(name+" : 하늘을 날 수 있어요!");	
	}
	@Override
	public void kungfu() {
		System.out.println(name+" : 쿵후를 할 수 있어요!");	
	}
}

public class SummaryApp {

	public static void main(String[] args) {
		//쿵푸를 할 수 있는 배열(도장)
		Human h1 = new Human("홍길동", 28);
		Human h2 = new KungfuHuman("네오", 40);
		Panda p1 = new Panda("판다", 30);
		Panda p2 = new KungfuPanda("포", 15);
		
		TheOne neo = new TheOne("NEO", 40);
		fight(h1);
		fight(h2);
		fight(p1);
		fight(p2);
		fight(neo);
		
		//쿵후 도장 만들기
		Kungfu[] dojang = {//(Kungfu)h1, 
							(Kungfu)h2, 
							//(Kungfu)p1,
							(Kungfu)p2,
							(Kungfu)neo}; //같은 인터페이스를 구현한 객체는 같은인터페이스타입으로 참조할수 있다.
		neo.fly();
	}
	
	public static void fight(Animal a) {
		//대련을 시켜보자
		//((Kungfu)a).kungfu();-->Error //객체가 인터페이스를 구현한 객체인지 먼저확인
		if(a instanceof Kungfu) {
			((Kungfu)a).kungfu();
		}else System.out.println(a.name+" : 쿵푸 못해요!");
	}

}
