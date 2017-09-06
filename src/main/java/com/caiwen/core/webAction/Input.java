package com.caiwen.core.webAction;

import org.openqa.selenium.WebDriver;

public class Input extends AbstractWebAction {

  public Input(WebDriver driver, String... arguments) {
    super(driver, arguments);
  }

  @Override
  public void perform() {
    driver.findElement(buildBy(arguments[0], arguments[1])).sendKeys(arguments[2]);
  }


}
