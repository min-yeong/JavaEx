package com.bit.javaex.oop.staticmember;

//member의 범위 확인
public class StaticEx {
	//static과 instance 변수는 클래스 영역에 선언
	public static int refCount;  //클래스변수(인스턴스화하지않아도접근가능 -> 정적변수), static method안에서는 static멤버만 접근가능
	public static String classVar;
	
	public String instanceVar;  //인스턴스변수, 생성된 개별 인스턴스 내부에서만 사용 가능 -> static멤버에서는 확인할 수 없다.
	
	static {
		//static변수의 초기화를 담당, 해당 클래스가 최초 사용될 때 한번 실행되고 이후 프로그램종료시 해제
		refCount = 0;
		classVar = "Static Member";
		System.out.println("----- Static Block");
		//intstanceVar = "Instance Var"; -->error //static 영역에서는 static만 접근가능
	}
	
	//생성자 -> Instance멤버의 초기화를 담당
	public StaticEx() {
		refCount++; //static변수이므로 어디서든 접근가능
		System.out.println("참조 갯수 : "+refCount);
		System.out.println("----- Instance 생성");
	}
	
	//소멸자 -> 인스턴스 소멸시 정리작업 담당
	protected void finalize() throws Throwable {
		refCount--;
		System.out.println("----- 소멸자 호출");
	}
}
