package com.caiwen.web.domain.testcase;

import java.util.List;
import java.util.Set;

public class TestCase {

  private List<Step> steps;
  private Set<Expect> expects;

  public List<Step> getSteps() {
    return steps;
  }

  public void setSteps(List<Step> steps) {
    this.steps = steps;
  }

  public Set<Expect> getExpects() {
    return expects;
  }

  public void setExpects(Set<Expect> expects) {
    this.expects = expects;
  }
}
