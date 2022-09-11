package com.dojinyou.xuint;

public class TestCaseTest extends TestCase {

  WasRun wasRun;

  public TestCaseTest(String name) {
    super(name);
  }

  @Override
  public void setUp() {
    wasRun = new WasRun("testMethod");
  }

  public void testRunning() {
    Assert.assertEquals(false, wasRun.wasRun);
    wasRun.run();
    Assert.assertEquals("setUp testMethod", wasRun.log);
    Assert.assertEquals(true, wasRun.wasRun);
  }

  public void testSetUp() {
    Assert.assertEquals(false, wasRun.wasSetUp);
    wasRun.run();
    Assert.assertEquals("setUp testMethod", wasRun.log);
    Assert.assertEquals(true, wasRun.wasSetUp);
  }
}
