package com.caiwen.core.webAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Click extends AbstractWebAction {

    private By by;

    public Click(WebDriver driver, By by) {
        super(driver);
        this.by = by;
    }

    @Override
    public void perform() {
        driver.findElement(by).click();
    }
}
