package com.dojinyou.xuint;

public class WasRun extends TestCase {
  public boolean wasRun = false;
  protected boolean wasSetUp = false;

  public WasRun(String name) {
    super(name);
  }

  public void testMethod() {
    wasRun = true;
  }

  @Override
  public void setUp() {
    wasSetUp = true;
  }

}
