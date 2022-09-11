package com.dojinyou.xuint;

public class WasRun extends TestCase {
  public boolean wasRun = false;
  protected boolean wasSetUp = false;
  public String log;

  public WasRun(String name) {
    super(name);
  }


  @Override
  public void setUp() {
    wasSetUp = true;
    log = "setUp";
  }

  public void testMethod() {
    wasRun = true;
    log += " testMethod";
  }

}
