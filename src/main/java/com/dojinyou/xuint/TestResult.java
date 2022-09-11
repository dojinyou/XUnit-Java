package com.dojinyou.xuint;

public class TestResult {
  int runCount = 0;
  int failCount = 0;

  public void testStarted() {
    runCount++;
  }

  public void testFailed() {
    failCount++;
  }
  
  public String getSummary() {
    return runCount + " run, " + failCount + " failed";
  }

}
