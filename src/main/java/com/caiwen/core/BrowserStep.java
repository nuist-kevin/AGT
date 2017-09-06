package com.caiwen.core;

import com.caiwen.core.webAction.AbstractWebAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserStep implements TestStep {

  private AbstractWebAction webAction;

  public BrowserStep(AbstractWebAction webAction) {
    this.webAction = webAction;
  }

  public AbstractWebAction getWebAction() {
    return webAction;
  }

  public void setWebAction(AbstractWebAction webAction) {
    this.webAction = webAction;
  }

  public void run() {
    try {
      webAction.perform();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }


  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chrome\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    try {
/*            driver.get("https://login.made-in-china.com");
            WebElement username = driver.findElement(By.id("logonInfo.logUserName"));
            username.sendKeys("producttest");
            WebElement password = driver.findElement(By.id("logonInfo.logPassword"));
            password.sendKeys("cpw2017why");
            driver.findElement(By.id("sign-in-submit")).submit();
            driver.get("http://g.made-in-china.com/fie/combuyer/list");
            driver.findElement(By.linkText("授信")).click();
            for (String window : driver.getWindowHandles()) {
                if (!window.equals(driver.getWindowHandle())) {
                    driver.switchTo().window(window);
                    break;
                }
            }
            driver.findElement(By.name("applyAmount")).sendKeys("10000");
            driver.findElement(By.name("ordAmount")).sendKeys("10000");*/
//            driver.get("https://login.made-in-china.com");
////            WebAction action = new Input(driver, By.id("logonInfo.logUserName"), "producttest");
//
//            TestSuite testSuite = new TestSuite();
//            TestCase testCase = new TestCase();
//            testSuite.addTestCase(testCase);
//            TestStep testStep = new BrowserStep(action);
//            testCase.addStep(testStep);
//
//            testStep.execute();

//            TestStep testStep = new BrowserStep(elementLocator, action);
//            testCase.addStep(testStep);

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      driver.quit();
    }


  }
}
