package com.caiwen.core.webAction;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

public abstract class AbstractWebAction implements TestAction {

  protected WebDriver driver;
  protected String[] arguments;

  public AbstractWebAction(WebDriver driver, String... arguments) {
    this.driver = driver;
    this.arguments = arguments;
  }

  public WebDriver getDriver() {
    return this.driver;
  }

  public void setDriver(WebDriver driver) {
    this.driver = driver;
  }

  public String[] getArguments() {
    return arguments;
  }

  public void setArguments(String[] arguments) {
    this.arguments = arguments;
  }

  protected By buildBy(String using, String value) {
    By by;
    switch (using) {
      case "id":
        by = new ById(value);
        break;
      case "css":
        by = new ByCssSelector(value);
        break;
      case "name":
        by = new ByName(value);
        break;
      case "tagName":
        by = new ByTagName(value);
        break;
      case "linkText":
        by = new ByLinkText(value);
        break;
      case "partialLinkText":
        by = new ByPartialLinkText(value);
        break;
      case "xpath":
        by = new ByXPath(value);
        break;
      default:
        by = null;
        break;
    }
    return by;
  }
}
