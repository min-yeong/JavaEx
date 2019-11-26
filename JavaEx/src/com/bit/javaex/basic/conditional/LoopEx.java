package com.bit.javaex.basic.conditional;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//whileEx();
		//whileEx2();
		//forEx();
		//continueEx();
		//breakEx();
		doWileEx();
	}
	
	public static void whileEx() {
		//while문 연습 : 100 이하의 정수를 합산하여 결과를 출력
		int i = 1;  //반복조건을 확인하기 위한 제어변수
		int sum = 0;  //합산변수
		while(i<=100) {
			sum += i;
			i++;  //반복지속 여부 판단을 위한 변수는 직접 제어
		}
		System.out.println("100이하 정수의 합 : "+sum);
	}
	
	public static void whileEx2() {
		//while문 연숩 : 키보드로부터 숫자르 입력받아 해당하는 숫자의 구구단 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("구구단의 단수를 입력하시오. : ");
		int i = scanner.nextInt();
		int j = 1;
		
		while(j<=9) {
			System.out.println(i+"x"+j+"="+i*j);
			j++;
		}
		scanner.close();
	}
	
	public static void forEx() {
		//for문 연습 : 키보드로부터 숫자를 입력받아 해당하는 숫자의 구구단 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("구구단의 단수를 입력하시오. : ");
		int i = scanner.nextInt();
		
		for(int j=1; j<10; j++) {
			System.out.println(i+"x"+j+"="+i*j);
		}
		scanner.close();
	}
	
	public static void continueEx() {
		//continue -> 반복문에서 남아있는 코드를 더 이상 실행하지 않고 다름 루프를 진행
		//1~100까지의 수 중에서 2의 배수와 3의 배수를 제외한 수 출력
		for (int i=1; i<=100; i++) {
			if (i%2==0 || i%3==0) continue;  //2의배수와 3의배수는 더이상 밑에를 실행하지 않고 i++ 실행
			System.out.println(i);
		}
	}
	
	public static void breakEx() {
		//break문은 반복문을 종료하고 반목문 다음 문장으로 이동
		//1부터 차례로 반복하면서 해당숫자가 6과 14로 동시에 나누어 떨어지는 수 출력
		//몇번의 반복을 해야 하는 지 모르기 때문에 while문 사용
		int i=1;
		
		while(true)  {
			if(i%6==0 && i%14==0) break;
			i++;
		}
		System.out.println(i);
	}
	
	public static void doWileEx() {
		//do-while은 코드가 최소 한번은 실행되어야 함, 반복 조건의 판별은 나중
		//0이아니면합산, 0이면종료 -> 판별조건이뒤에있는경우
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		
		do {
			System.out.print("정수를 입력하시오.(0이면 종료) : ");
			i = scanner.nextInt();
			sum +=i;
			System.out.println("입력된 정수의 합 : "+sum);
		}while(i!=0);
		System.out.println("종료");
		scanner.close();
	}
}
