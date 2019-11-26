package com.bit.javaex.api.objectclass.ex03;

//특정 클래스를 extends하지 않아도 java.lang.object클래스를 상속받게된다 -> 최상위 클래스 : object
//복제 가능하도록 Cloneable implements
public class Point implements Cloneable {
	//Cloneable 인터페이스를 구현하면 내부에서 Clone 메서드를 사용할 수 있다.
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//문자열 출력을 위한 toString 메서드 오버라이드
	@Override
	public String toString() {
		return String.format("Point(%d, %d)%n", x, y);  //출력할 데이터 문자열을 리턴
	}
	
	//내부값의 비교를 위해서 equals 메서드를 override해준다
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			//obj는 Point의 객체 -> 캐스팅가능
			Point other = (Point)obj;
			//각 x,y값을 비교할 수 있음
			return x==other.x && y==other.y;
		}
		return super.equals(obj); //Point가 아닐경우
	}
	
	//복제 객체를 얻기위한 메서드 작성
	public Point getClone() {
		//현재 인스턴스를 복재(clone)해서 새 Point를 만들어서 return
		Point newPoint = null;
		
		try {
			newPoint = (Point)clone(); //현재 객체를 복제한 후에 캐스팅
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();  //복제를 실패할 경우
		}
		return newPoint;  //복제된 새 객체를 return
	}
}
