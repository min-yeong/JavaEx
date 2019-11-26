package com.bit.javaex.collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableEx {
	//HashTable은 키 - 값의 쌍, 키를 기반으로 값을 검색(Hash 기반)
	public static void main(String[] arg) {
		Map<String, ClassRoom> map = new Hashtable<>();
		
		//맵에 데이터 넣기
		map.put("101", new ClassRoom("Java", "R101"));
		map.put("201", new ClassRoom("C", "R201"));
		map.put("301", new ClassRoom("Python", "R301"));
		map.put("201", new ClassRoom("C++", "R201"));  //같은 키에 접근할 경우 나중에 put한 객체가 value로 사용(중복불가)
		System.out.println("MAP : "+map);
		
		//키가 있는 지 확인 : containsKey
		System.out.println("KEY 101 : "+map.get("101"));
		System.out.println("KEY 501 : "+map.get("501")); //없는 객체의 경우 null값을 반환
		
		//키로 값에 접근
		ClassRoom c = map.get("101");
		System.out.println("101강의실 : "+c);
		
		//값이 있는지 확인 : containsValue ->Java 강의실이 있는지 
		//System.out.println("containsValue : "+map.containsValue("Java")); 
		//->다른 값이 나옴, hashCode로 equals한지 검색해야함, ClassRoom클래스에 Override추가
		System.out.println("containsValue : "+map.containsValue(new ClassRoom("Java"))); 
		
		//HashTable의 키목록은 HashSet, HashTable 내의 키Set반환 후, iterator을 받을 수 있다
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			ClassRoom room = map.get(it.next()); //String key = it.next(); ClassRoom room = map.get(key);
			System.out.println("Room(it) : "+room);
		}
		
		map.clear();
		System.out.println("MAP : "+map);
	}
}
