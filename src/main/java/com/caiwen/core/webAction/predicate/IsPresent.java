package com.caiwen.core.webAction.predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IsPresent extends Predication {

  private By by;

  public IsPresent(By by) {
    this.by = by;
  }

  @Override
  public boolean test(WebDriver driver) {
    return driver.findElement(by).isDisplayed();
  }

}
