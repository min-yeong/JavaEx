package com.bit.javaex.practice.practice03.problem02;

import java.util.Scanner;

public class FriendApp
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    Friends[] friend = new Friends[3];
    System.out.println("친구 3명을 등록해주세요.");

    for (int i = 0; i < friend.length; i++) {
      friend[i] = new Friends();

      friend[i].setName(scanner.next());
      friend[i].setNumber(scanner.next());
      friend[i].setSchool(scanner.next());
    }

    for (int i = 0; i < friend.length; i++) {
      friend[i].show();
    }
    scanner.close();
  }
}