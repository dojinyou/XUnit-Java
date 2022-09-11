package com.dojinyou.xuint;

public class WasRun extends TestCase {
  public String log;

  public WasRun(String name) {
    super(name);
  }

  @Override
  public void setUp() {
    log = "setUp";
  }

  @Override
  public void tearDown() {
    log += " tearDown";
  }

  public void testMethod() {
    log += " testMethod";
  }

  public void testBrokenMethod() {
    throw new AssertionError();
  }



}
