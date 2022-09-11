package com.dojinyou.xuint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.annotation.AnnotationUtils;

public class TestSuite implements Test {

  List<Test> tests = new ArrayList<>();

  public TestSuite(Class<? extends TestCase> testClass) {
    Arrays
        .stream(testClass.getDeclaredMethods())
        .filter(m -> AnnotationUtils.findAnnotation(m, com.dojinyou.xuint.annotation.Test.class) != null)
        .forEach(m -> {
          try {
            add(testClass
                    .getConstructor(String.class)
                    .newInstance(m.getName()));
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        });
    ;
  }

  public TestSuite() {
  }

  public void add(Test test) {
    tests.add(test);
  }

  public void run(TestResult testResult) {
    tests.forEach(t -> t.run(testResult));
  }
}
