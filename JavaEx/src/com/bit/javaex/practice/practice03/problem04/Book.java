package com.bit.javaex.practice.practice03.problem04;

public class Book {
    private int bookNo;
    private String title;
    private String author;
    private int stateCode;
    
    public int getBookNo() {
       return bookNo;
    }
    public void setBookNo(int bookNo) {
       this.bookNo = bookNo;
    }
    public String getTitle() {
       return title;
    }
    public void setTitle(String title) {
       this.title = title;
    }
    public String getAuthor() {
       return author;
    }
    public void setAuthor(String author) {
       this.author = author;
    }
    public int getStateCode() {
       return stateCode;
    }
    public void setStateCode(int stateCode) {
       this.stateCode = stateCode;
    }
    
    public Book(int bookNo, String title, String author) {
       this.bookNo = bookNo;
       this.title = title;
       this.author = author;
       this.stateCode = 1;
    }
    
    public void rent() {
       if(stateCode==1) {
          System.out.printf("%s(이)가 대여 됐습니다.%n", title);
          stateCode=0;
       }else System.out.printf("%s(이)가 이미 대여 중입니다.%n", title);
    }
    
    public void print() {
      String message;
      if (stateCode==1) {
         message = "재고있음";
      } else message = "대여중";
       System.out.printf("%d 책제목:%s, 작가:%s, 대여유무:%s%n", bookNo, title, author, message);
    }
 }