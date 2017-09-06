package com.caiwen.core;

import java.util.ArrayList;
import java.util.List;

public class TestCase {

  private List<TestStep> testSteps = new ArrayList<>();

  public void addStep(TestStep testStep) {
    testSteps.add(testStep);
  }

  public List<TestStep> getTestSteps() {
    return testSteps;
  }

  public void setTestSteps(List<TestStep> testSteps) {
    this.testSteps = testSteps;
  }
}
