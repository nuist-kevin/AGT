package com.caiwen.core.webAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue extends AbstractWebAction {

  public SelectByValue(WebDriver driver, String... arguments) {
    super(driver, arguments);
  }

  @Override
  public void perform() {
    Select select = new Select(driver.findElement(buildBy(arguments[0], arguments[1])));
    select.selectByValue(arguments[2]);
  }
}
