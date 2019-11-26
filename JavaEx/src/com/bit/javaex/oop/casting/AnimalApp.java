package com.bit.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		Dog d = new Dog("Snoopy");
		d.walk();
		d.eat();
		d.bark();
		
		Animal pet = d;	//Up Casting : 자식인스턴스를 부모클래스 타입으로 참조하는 것 
		pet.walk();
		pet.eat();
		//pet.bark(); -->Error //자식클래스에 있는 기능은 사용불가
		
		pet = new Cat("아즈라엘");		
		pet.walk();
		pet.eat();
		//pet.meow(); -->Error //자식클래스에 있는ㄱ ㅣ능 사용불가
		
		//Down Casting : 부모 타입으로 참조하고 있는 것을 다시 원래 클래스 타입으로 돌려놓는것
		((Cat)pet).meow();	//자식클래스에 잇는 기능 사용 가능
		//((Dog)pet).bark(); -->Error	//현재 pet은 Cat을 참조하고 있기 때문에 Cat클래스의 기능만 사용가능. 해당인스턴스가 어떤 클래스의 객체인지 확인
		if(pet instanceof Dog) {
			((Dog)pet).bark();
		}else System.out.println("개가 아닙니다!");
	}

}
