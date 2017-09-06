package com.caiwen.core.webAction;

import org.openqa.selenium.WebDriver;

/**
 * Created by caiwen on 2017/6/18.
 */
public class Visit extends AbstractWebAction {

  public Visit(WebDriver driver, String... arguments) {
    super(driver, arguments);
  }

  @Override
  public void perform() {
    driver.get(arguments[0]);
  }
}
