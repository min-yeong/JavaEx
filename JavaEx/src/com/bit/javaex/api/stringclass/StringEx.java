package com.bit.javaex.api.stringclass;

public class StringEx {
	public static void stringBasic() {
		//문자열의 생성 : 케릭터형 데이터가 여러개 연속으로존재, 한번생기면 변경되지않는다
		String s1 = "Java";	//리터럴(Literal)방식-> 실제소스코드에 직접입력한문자열
		String s2 = new String("Java"); //메모리에 새로 생성된 문자열
		String s3 = "Java";  //Liternal
		//Literal 문자열은 값이 같으면 같은 객체다
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		//문자열은 char 형의 집합이기 때문에 char의 배열로 문자열을 생성할 수 있다.
		char[] letters = {'J', 'a', 'v', 'a'};
		String s4 = new String(letters);
		System.out.println(s4);
		
		//기본 데이터형 자료가 있을 때 -> 문자열로 변경 (valueOf 메서드)
		String s5 = String.valueOf(3.14159);
		System.out.println(s5);
	}
	
	public static void methodEx() {
		//String에 유용한 매서드들
		String str = "Java Programming is Fun?";
		
		//길이 : .length() 메서드
		System.out.println("length:"+str.length());
		
		//변환 메서드
		System.out.println("UPPERCASE:"+str.toUpperCase());
		System.out.println("LOWERCASE:"+str.toLowerCase());
		//문자열은 변경 불가 자료이기 때문에 변환 메서드를 사용해도 원본은 바뀌지 않으므로 새로 할당 받아야한다.
		
		//검색 관련 메서드
		System.out.println("contains:"+str.contains("Java"));
		
		//5번 인덱스의 char는 무엇인가? 
		System.out.println("charAt:"+str.charAt(5));
		System.out.println("indexOf:"+str.indexOf("Fun"));	//문자열 내부에서 Fun 의 index반환
		System.out.println("lastIndexOf:"+str.lastIndexOf("Fun"));	//문자열을 검색하는데 뒤에서부터 검색
		System.out.println("없는 검색어의 인덱스:"+str.indexOf("fun"));	
		
		String str2 = "I Like Java, I Like Python";
		int i = str2.indexOf("Like");	//str2에서 Like의 인덱스(위치)
		System.out.println("Like index:"+i);
		i += "Like".length();	//Like에서의 e위치의 인덱스를 i에 저장
		i = str2.indexOf("Like", i);	//두번째 인자값은 검색 시작 위치, 두번째Like 인덱스
		System.out.println("Like 2nd index:"+i);
		
		//문자열 추출 : substring, 문자열str로부터 Programming 문자열 추출
		System.out.println("sibstring:"+str.substring(5, 16)); //두번째 인자값은 endIndex 직전까지 추출
		System.out.println("substring:"+str.substring(5)); //끝까지 출력할 경우, 두번째 인자값은 생략가능
		
		//치환 메서드 : replace
		//String str2 = "I Like Java, I Like Python";
		//str2의 "Like"를 소문자로 변환
		System.out.println(str2.replace("Like", "Hate"));	//뒤의 값으로 변경
		
		//공백 문자 제거 : trim()
		String str3 = "		Hello	";
		str3 = str3.trim(); //공백문자제거
		System.out.println("trim:"+str3);
		
		//문자열 분리 : split()
		//String str = "Java Programming is Fun?";
		String[] chunks = str.split(" ");  //공백문자를 기준으로 분리 -> 문자열 배열로 생성
		for(String word:chunks) {
			System.out.println("Word:"+word);
		}
	}
	
	public static void stirngBufferEx() {
		//string 버퍼는 내부에 버퍼(임시공간)을 가지고 있는 자료형
		//String 객체가 매번 새 객체를 생성하는 데 반해 stringBuffer는 내부 버퍼에서 모든 작업을 수행한다 -> ㅁ메모리효율증가
		StringBuffer sb = new StringBuffer("this");
		//문자열 추가 : .append()
		sb.append(" is pencil"); //sb는 "this is pencil" -> 기본 배열은 0~9지만 넣으려는 값이 10을 초과하므로 크기에 맞게 자동으로 더늘려줌
		//문자열 삽입 : .insert()
		sb.insert(8, "my");
		//문자열 치환 : .replace();
		sb.replace(8, 10, "your "); //my -> your 로 치환, 문자열이 늘어났지만 버퍼에의해 자동으로 늘어남
		System.out.println(sb);
		
		//메서드 체이닝
		StringBuffer sb2 = new StringBuffer("This").append(" is").append(" pencil").insert(8, "my").replace(8, 10, "your ");
		String s = sb2.toString();
		System.out.println(s);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringBasic();
		methodEx();
		stirngBufferEx();
	}

}
