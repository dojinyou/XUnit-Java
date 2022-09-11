package com.dojinyou.xuint;

public class XUnitTest {
  public static void main(String[] args) {
    new TestCaseTest("testTemplateMethod").run();
    new TestCaseTest("testResult").run();
    new TestCaseTest("testFailResultFormatting").run();
    new TestCaseTest("testFailedResult").run();
  }
}
