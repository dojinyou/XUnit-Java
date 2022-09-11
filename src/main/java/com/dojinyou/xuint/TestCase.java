package com.dojinyou.xuint;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
  protected final String name;

  public TestCase(String name) {
    this.name = name;
  }

  public TestResult run() {
    TestResult testResult = new TestResult();
    testResult.testStarted();
    setUp();

    try {
      Method method = getClass().getMethod(name);
      method.invoke(this);

    } catch (Exception e) {
      testResult.testFailed();
    }

    tearDown();
    return testResult;
  }

  public void tearDown() {

  }

  public void setUp() { }
}
