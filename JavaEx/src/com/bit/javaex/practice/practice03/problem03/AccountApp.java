package com.bit.javaex.practice.practice03.problem03;

import java.util.Scanner;

public class AccountApp
{
  public static void main(String[] args)
  {
    Account account = new Account();
    Scanner scan = new Scanner(System.in);
    int sum = 0;

    System.out.println("312-89562-123456 계좌가 개설되었씁니다.");
    System.out.println();
    account.setExit(true);
    while (account.getExit()) {
      account.show();
      System.out.print("선택>");
      int val = scan.nextInt();
      switch (val) {
      	case 1:
      		System.out.print("예금액>");
      		account.setSaving(scan.nextInt());
      		sum += account.getSaving();
      		break;
      	case 2:
      		System.out.print("출금액>");
      		account.setWithdraw(scan.nextInt());
      		sum -= account.getWithdraw();
      		break;
      	case 3:
      		account.setBalance(sum);
      		System.out.println("잔고액>" + account.getBalance());
      		break;
      	case 4:
      		System.out.println("프로그램종료");
      		account.setExit(false);
      		break;
      	default:
      		System.out.println("다시입력해주세요.");
      }
    }
    scan.close();
  }
}