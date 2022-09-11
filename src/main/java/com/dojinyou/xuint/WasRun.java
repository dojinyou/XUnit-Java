package com.dojinyou.xuint;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WasRun {
  private final String name;
  public boolean wasRun = false;

  public WasRun(String name) {
    this.name = name;
  }

  public void testMethod() {
    wasRun = true;
  }

  public void run() {
    try {
      Method method = getClass().getMethod(name);
      method.invoke(this);

    } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }
}
