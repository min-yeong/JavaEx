package dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Bookshop {
	public static void printAuthors() {
		System.out.println("[저자 목록]");
		AuthorDAO dao = new AuthorDAOImpl();
		List<AuthorVO> authors = dao.getList();
		
		Iterator<AuthorVO> iter = authors.iterator();
		while(iter.hasNext()) {
			AuthorVO author = iter.next();
			System.out.println(author);
		}
		System.out.println(authors.size()+"명의 저자가 있습니다.");
	}
	
	public static void showAuthor(Long id) {
		// pk가 1인 작가를 출력
		 AuthorDAO dao = new AuthorDAOImpl();
		 AuthorVO author = dao.get(id);
		 
		 if(author != null) System.out.println("Author : "+author);
		 else System.out.println("저자를 찾지 못함");
	}
	
	public static void insertAuthor() {
		// Scanner 에서 이름과 설명을 입력받아서 author테이블에 INSERT
		Scanner scanner = new Scanner(System.in);
		System.out.printf("저자이름 : ");
		String name = scanner.next();
		System.out.printf("셜명 : ");
		String desc = scanner.next();
		
		//DAO 의 INSERT 메서드에 전달할 AuthorVO 생성
		AuthorVO author = new AuthorVO(null, name, desc);
		AuthorDAO dao = new AuthorDAOImpl();
		boolean inSuccess = dao.insert(author);
		
		System.out.println("입력 성공?"+ inSuccess);
		printAuthors();
		scanner.close();
		}
	
	public static void deleteAuthor() {
		printAuthors();
		Scanner scanner = new Scanner(System.in);
		System.out.print("삭제할 저자의 id : ");
		int id = scanner.nextInt();
		
		AuthorDAO dao = new AuthorDAOImpl();
		boolean isSuccess = dao.delete(Long.valueOf(id));
		
		System.out.println("삭제성공?" + isSuccess);
		printAuthors();
		scanner.close();
	}
	
	public static void updateAuthor() {
		printAuthors();
		System.out.print("수정할 저자?");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		System.out.print("이름 : ");
		String name = scanner.next();
		System.out.print("설명 : ");
		String desc = scanner.next();
		
		AuthorVO author = new AuthorVO(Long.valueOf(id), name, desc);
		AuthorDAO dao = new AuthorDAOImpl();
		boolean isSuccess = dao.update(author);
		
		System.out.println("수정성공?"+isSuccess);
		printAuthors();
		
		scanner.close();
	}
	
	public static void main(String[] args) {
		
		printAuthors();
		//showAuthor(1L);
		//insertAuthor();
		//deleteAuthor();
		updateAuthor();
	}

}
