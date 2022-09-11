package com.dojinyou.xuint;

import java.lang.reflect.Method;

public class TestCase implements Test {
  protected final String name;

  public TestCase(String name) {
    this.name = name;
  }

  @Override
  public void run(TestResult testResult) {
    testResult.testStarted();
    setUp();

    try {
      Method method = getClass().getMethod(name);
      method.invoke(this);

    } catch (Exception e) {
      testResult.testFailed();
    }

    tearDown();
  }

  public void tearDown() {
  }

  public void setUp() {
  }
}
