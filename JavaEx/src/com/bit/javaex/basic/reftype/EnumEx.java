package com.bit.javaex.basic.reftype;

public class EnumEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enumTest();
		enumTest2();
	}
	
	public static void enumTest() {
		DayOfWeek dow = DayOfWeek.WEDSDAY;
		
		//DayOfWeek.WEDSDAY의 열거상수 이름과 순서를 확인
		System.out.printf("Today is %s(%d)%n", dow.name(), dow.ordinal());
		
		
		//문자열을 가지고 있을 때 해당 문자열과 일치하는 열거 상수 얻어오기
		DayOfWeek dow2= DayOfWeek.valueOf("FRIDAY");
		System.out.printf("%s(%d)%n", dow2.name(), dow2.ordinal());
	}
	
	public static void enumTest2() {
		//switch에서 만들었던 내용을 enum으로 변경
		DayOfWeek today = DayOfWeek.WEDSDAY;
		String message;
		
		switch(today) {
			case MONDAY:
			case TUESDAY:
			case WEDSDAY:
			case THURSDAY:
				message = "열공";
				break;
			case FRIDAY:
				message = "불금";
				break;
			case SATURDAY:
			case SUNDAY:
				message = "휴식";
				break;
			default:
				message = "?";
				break;
		}
		System.out.println(message);
	}
}
