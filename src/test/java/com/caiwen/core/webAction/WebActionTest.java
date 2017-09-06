package com.caiwen.core.webAction;

import com.caiwen.core.TestCase;
import com.caiwen.runner.TestCaseRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.TestRunner;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WebActionTest {

  @Test
  public void test() {
/*        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        TestAction visit = new Visit(driver, "https://login.made-in-china.com");

        TestAction input = new Input(driver, By.id("logonInfo.logUserame"), "producttest");

        TestAction click = new Click(driver, By.id("sign-in-submit"));

        List<TestAction> testActions = new ArrayList<>();

        testActions.add(visit);
        testActions.add(input);
        testActions.add(click);

        TestCaseRunner testCaseRunner = new TestCaseRunner(testActions);
        testCaseRunner.run();


        System.out.println(testCaseRunner.getResult());*/

    System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chrome\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://login.made-in-china.com");
    WebElement element = driver.findElement(By.id("logonInfo.logUserName"));
    element.sendKeys("producttest");
    System.out.println("hello");

  }
}
