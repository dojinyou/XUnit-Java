package com.dojinyou.xuint;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
  protected final String name;

  public TestCase(String name) {
    this.name = name;
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
