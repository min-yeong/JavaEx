package com.bit.javaex.api.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// 날짜를 얻어옴, java.util 안에 있으므로 명시적으로 impot
		Date now = new Date();
		String nowStr = now.toString();
		
		System.out.println("현재시간:"+nowStr);
		System.out.println(now.toLocaleString()); //현재시간을 현재시스템나라(대한민국)의설정에 따라변경, deprecated(중간에줄)->향후에는 없어질 예정이므로 다른방식 사용
		
		//날짜 출력 형식 DateFormat FULL, LONG, MEDIUM, SHORT
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(now));
		
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df.format(now));
		
		//SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println("포매팅된 날짜 정보:"+sdf.format(now));
	}

}
