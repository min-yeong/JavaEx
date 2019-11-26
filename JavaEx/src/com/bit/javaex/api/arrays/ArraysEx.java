package com.bit.javaex.api.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysEx {
	
	public static void arrayCopyEx() {
		//배열의 복사 -> Arrays 클래스의 도움
		char src[] = "Java Programming".toUpperCase().toCharArray();
		System.out.println("Arrays.toSting:"+ Arrays.toString(src));
		
		//복사 : 원본배열 src를 새 배열로 복사
		char target[] = Arrays.copyOf(src, src.length);
		System.out.println("복제된 배열:"+ Arrays.toString(target));
		
		//src와 target은 같은 객체인가? -> 복제된 것이기 때문에 다른 주소를 가지고 있다
		System.out.println(src==target);
		
		//일부복사 : copyOfRange
		target = Arrays.copyOfRange(src, 5, 10); //원본배열 5번인덱스부터 10번 인덱스까지 새배열로 복사
		System.out.println("범위복사:"+Arrays.toString(target));
	}
	
	public static void sortEx() {
		//정렬
		int scores[] = {80, 70, 90, 75, 65, 50, 77, 88};
		System.out.println("배열 원본:"+Arrays.toString(scores));
		Arrays.sort(scores);
		System.out.println("기본 정렬:"+Arrays.toString(scores)); //기본정렬은 오름차순
		Integer[] scores2 = {80, 70, 90, 75, 65, 50, 77, 88};
		Arrays.sort(scores2, Collections.reverseOrder()); //기본정렬의 역순
		System.out.println("역순 정렬:"+Arrays.toString(scores2));
	}
	
	public static void binarySearchEx() {
		//기본타입의 검색
		int[] nums = {5, 3, 6, 1, 3, 2, 7, 10};
		
		//nums로 부터 5를 검색
		int index = Arrays.binarySearch(nums, 5);
		System.out.println("5의 인덱스:"+index);	//->binarySearch의 경우 이분검색을 하기 때문에 내부데이터가 정렬이 되어있어야한다.
		
		Arrays.sort(nums);
		index = Arrays.binarySearch(nums, 5);
		System.out.println("기본 정렬:"+Arrays.toString(nums));
		System.out.println("5의 인덱스:"+index);
		
		String[] words = "Java C C++ Python Linux".split(" ");
		Arrays.sort(words);
		//words배열 안에서 Python찾기
		index = Arrays.binarySearch(words, "Python");
		System.out.println("Python의 인덱스:"+index);
		System.out.println("기본 정렬:"+Arrays.toString(words));	
	}
	
	public static void cumstomClassSortEx() {
		//Member의 배열을 만들고 정렬
		Member[] members = {new Member("홍길동"), new Member("장길산"), new Member("전우치")};
		System.out.println("원본배열:"+Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("정렬된 배열:"+Arrays.toString(members));
	}

	public static void main(String[] args) {
		 //arrayCopyEx();
		 sortEx();
		 //binarySearchEx();
		 cumstomClassSortEx();
	}

}
