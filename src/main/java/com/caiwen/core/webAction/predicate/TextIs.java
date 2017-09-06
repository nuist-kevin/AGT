package com.caiwen.core.webAction.predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextIs extends Predication {

  private By by;
  private String expectText;

  public TextIs(By by, String expectText) {
    this.by = by;
    this.expectText = expectText;
  }

  @Override
  public boolean test(WebDriver driver) {
    String actualText = driver.findElement(by).getText();
    if (actualText != null) {
      return actualText.contains(expectText);
    }
    return false;
  }
}
