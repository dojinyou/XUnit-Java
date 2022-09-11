package com.dojinyou.xuint;

public class XUnitTest {
  public static void main(String[] args) {
    TestSuite testSuite = TestCaseTest.suite();

    TestResult testResult = new TestResult();
    testSuite.run(testResult);
    System.out.println(testResult.getSummary());

    TestSuite testSuite2 = new TestSuite();
    testSuite2.add(new WasRun("testMethod"));
    testSuite2.add(testSuite);
    testSuite2.add(testSuite);

    TestResult testResult2 = new TestResult();
    testSuite2.run(testResult2);
    System.out.println(testResult2.getSummary());
  }
}
