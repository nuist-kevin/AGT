package com.caiwen.core.webAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input extends AbstractWebAction{

    private By by;
    private String content;

    public Input(WebDriver driver, By by, String content) {
        super(driver);
        this.by = by;
        this.content = content;
    }


    @Override
    public void perform() {
        driver.findElement(by).sendKeys(content);
    }
}
