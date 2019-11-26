package com.bit.javaex.practice.practice03.problem03;

public class Account
{
  private int saving;
  private int withdraw;
  private int balance;
  private boolean exit;

  public int getSaving()
  {
    return this.saving;
  }
  public int getWithdraw() {
    return this.withdraw;
  }
  public int getBalance() {
    return this.balance;
  }
  public boolean getExit() {
    return this.exit;
  }
  public void setSaving(int saving) {
    this.saving = saving;
  }
  public void setWithdraw(int withdraw) {
    this.withdraw = withdraw;
  }
  public void setBalance(int balance) {
    this.balance = balance;
  }
  public void setExit(boolean exit) {
    this.exit = exit;
  }

  public void show() {
    System.out.println("---------------------");
    System.out.println("1.예금|2.출금|3.잔고|4.종료");
    System.out.println("---------------------");
  }
}
