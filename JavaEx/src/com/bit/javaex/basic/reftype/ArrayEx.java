package com.bit.javaex.basic.reftype;

public class ArrayEx {

	public static void main(String[] args) {
		//defineArray();
		//multiDim();
		//arrayCopy();
		arrayCopySystem();
	}
	
	public static void defineArray() {
		//배열의 선언
		String[] names; //String name[]
		int scores[];  //int[] scores
		
		//초기화
		names = new String[] {"홍길동", "전우치", "장길산"};  //데이터를 입력하는 경우 배열의 갯수는 표기하지 않아도됨
		int height[] = {175, 180, 176};  //선언과 동시에 데이터 입력시 사용
		
		scores = new int[4]; //0~3까지 4개의 공간을 가진 배열
		//내부 공간에 접근 -> 인덱스번호 사용
		scores[0] = 80;
		scores[1] = 60;
		scores[2] = 85;
		scores[3] = 80;
		int sum = 0;
		
		//scores 배열의 점수를 합산하여 총점과 평균을 출력
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		//System.out.printf("총점%d, 평균%.2f%n", sum, (float)total/scores.length);
		System.out.println("총점 : "+sum+"\n평균 : "+(float)sum/scores.length);
	}
	
	public static void multiDim() {
		int[][] twoDim = new int[5][10];
		
		int table[][] = {{1,2,3,4,5}, {2,3,4,5,1}, {3,4,5,1,2,}, {4,5,1,2,3}};
		System.out.println("table의 열 수 : "+table.length);
		System.out.println("table의 0번 인덱스 : "+table[0]);  //주소값으로 출력됌
		System.out.println("table의 행 수 : "+table[0].length);
		
		//table 배열 안에 있는 모든 정수를 합산
		int total=0;
		for (int i=0; i<table.length; i++) {
			for (int j=0; j<table[i].length; j++) {
				int value = table[i][j];
				System.out.print(value+"\t");
				total += value;
			}
			System.out.println();
		}
		System.out.println("table의 총 합 : "+total);
	}
	
	public static void arrayCopy() {
		//배열은 한번 생성되면 크기를 변경할 수 없기 때문에 새로운 배열을 생성 후 값을 복사해야한다.
		int source[] = {1, 2, 3};
		int target[] =new int[10];
		
		//복사를 위한 반복문
		for (int i=0; i<source.length; i++) {
			target[i]=source[i];
		}
		
		for (int i=0; i<target.length; i++) {
			System.out.print(target[i]+"\t");
		}
		System.out.println();
		
		//향상된 for문을 사용하여 배열 값 출력 vowel:->배열의첫번째부터끝까지한개씩돌려준다
		for (int vowel: target) {
			System.out.print(vowel+"\t");
		}
		System.out.println();
	}
	
	public static void arrayCopySystem() {
		//메소드를 이용한 배열 복사
		int source[] = {1,2,3};
		int target[] = new int[10];
		
		System.arraycopy(source,            //원본배열
						0,                  //시작인덱스
						target,             //타겟배열
						5,                  //타겟배열의시작인덱스
						source.length);     //복사할 길이
		for (int vowel: target) {
			System.out.print(vowel+"\t");
		}
		System.out.println();
	}
}
