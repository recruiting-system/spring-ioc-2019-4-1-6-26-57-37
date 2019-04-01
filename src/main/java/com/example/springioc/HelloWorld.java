package com.example.springioc;

public class HelloWorld {
  private String hello;

  public void setHello(String hello) {
    this.hello = hello;
  }

  public void getHello() {
    System.out.println(hello);
  }
}