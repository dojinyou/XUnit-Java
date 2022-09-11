package com.dojinyou.xuint;

public class XUnitTest {
  public static void main(String[] args) {
    WasRun wasRun = new WasRun("testMethod");
    System.out.println("isFalse(wasRun.wasRun) : " + !wasRun.wasRun); // false
    wasRun.run();
    System.out.println("isTrue(wasRun.wasRun) : " + wasRun.wasRun); // false
  }
}
