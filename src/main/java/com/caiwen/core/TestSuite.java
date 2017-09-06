package com.caiwen.core;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {

  private List<TestCase> testCases = new ArrayList<>();

  public List<TestCase> getTestCases() {
    return testCases;
  }

  public void setTestCases(List<TestCase> testCases) {
    this.testCases = testCases;
  }

  public void addTestCase(TestCase testCase) {
    this.getTestCases().add(testCase);
  }
}
