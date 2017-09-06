package com.caiwen.core.webAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Click extends AbstractWebAction {

  public Click(WebDriver driver, String... arguments) {
    super(driver, arguments);
  }

  @Override
  public void perform() {
    driver.findElement(buildBy(arguments[0], arguments[1])).click();
  }
}
