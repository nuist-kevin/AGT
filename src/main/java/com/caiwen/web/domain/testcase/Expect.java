package com.caiwen.web.domain.testcase;

public class Expect {

  private Predication predication;
  private String[] arguments;

  public Predication getPredication() {
    return predication;
  }

  public void setPredication(Predication predication) {
    this.predication = predication;
  }

  public String[] getArguments() {
    return arguments;
  }

  public void setArguments(String[] arguments) {
    this.arguments = arguments;
  }
}
