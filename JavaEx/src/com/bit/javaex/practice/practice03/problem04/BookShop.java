package com.bit.javaex.practice.practice03.problem04;

import java.util.Scanner;

public class BookShop {

      public static void main(String[] args) {
         Book[] book = new Book[10];
         Scanner scan = new Scanner(System.in);
         
         book[0] = new Book(1, "트와일라잇", "스테파니메이어");
         book[1] = new Book(2, "뉴문", "스테파니메이어");
         book[2] = new Book(3, "이클립스", "스테파니메이어");
         book[3] = new Book(4, "브레이킹던", "스테파니메이어");
         book[4] = new Book(5, "아리랑", "조정래");
         book[5] = new Book(6, "젊은그들", "김동인");
         book[6] = new Book(7, "아프니깐 청준이다", "김난도");
         book[7] = new Book(8, "귀천", "천상병");
         book[8] = new Book(9, "태백산맥", "조정래");
         book[9] = new Book(10, "풀하우스", "원수연");
         
         System.out.printf("대여하고 싶은 책의 번호를 입력하세요:");
         int val = scan.nextInt();
         book[val-1].rent();
              
         System.out.println("******도서 정보 출력하기******");
         for(int i=0;i<book.length;i++) {
            book[i].print();
         }
        scan.close();
      }

}