package com.bit.javaex.api.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		//캘린더 import 
		Calendar now = Calendar.getInstance();
		//캘린더는 new로 생성할 수 없고 getInstance() 메서드로 객체를 얻을 수 있다.
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.%n", now.get(Calendar.YEAR), now.get(Calendar.MONTH)+1, now.get(Calendar.DATE));
		//캘린더의 month 정보는 +1을 해주어야함(0부터 시작하기 떄문)
		
		Calendar custom = Calendar.getInstance();
		//custom 캘린더의 날짜를 바꿔보자
		custom.set(Calendar.YEAR, 2012);
		custom.set(Calendar.MONTH, 8); //월은0부터시작->9월
		custom.set(Calendar.DATE, 24);
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.%n", custom.get(Calendar.YEAR), custom.get(Calendar.MONTH)+1, custom.get(Calendar.DATE));
		
		//set메서드를 이용해서 년, 월, 일, 시, 분, 초를 일괄 변경
		custom.set(2012, 8, 24);
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.%n", custom.get(Calendar.YEAR), custom.get(Calendar.MONTH)+1, custom.get(Calendar.DATE));
		
		Calendar future = Calendar.getInstance(); //현재
		future.add(Calendar.YEAR, 10);  //캘린더의 년도 필드에 +10 -> 10년후의 오늘
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.%n", future.get(Calendar.YEAR), future.get(Calendar.MONTH)+1, future.get(Calendar.DATE));
		
		//이날의 요일은?
		System.out.println("요일:"+future.get(Calendar.DAY_OF_WEEK)); //일~토, 1~7
		
		int dow = future.get(Calendar.DAY_OF_WEEK);
		switch (dow) {
			case Calendar.SUNDAY :
				System.out.println("일요일");
				break;
			case Calendar.MONDAY :
				System.out.println("월요일");
				break;
			case Calendar.TUESDAY :
				System.out.println("화요일");
				break;
			case Calendar.WEDNESDAY :
				System.out.println("수요일");
				break;
			case Calendar.THURSDAY :
				System.out.println("목요일");
				break;
			case Calendar.FRIDAY :
				System.out.println("금요일");
				break;
			case Calendar.SATURDAY :
				System.out.println("토요일");
				break;
			default :
				break;
		}
	}

}
