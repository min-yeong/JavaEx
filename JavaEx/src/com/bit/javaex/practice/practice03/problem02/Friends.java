package com.bit.javaex.practice.practice03.problem02;

public class Friends
{
  private String name;
  private String number;
  private String school;

  public String getName()
  {
    return this.name;
  }
  public String getNumber() {
    return this.number;
  }
  public String getSchool() {
    return this.school;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setNumber(String number) {
    this.number = number;
  }
  public void setSchool(String school) {
    this.school = school;
  }

  public void show() {
    System.out.printf("이름:%s\t핸드폰:%s\t학교:%s%n", new Object[] { this.name, this.number, this.school });
  }
}