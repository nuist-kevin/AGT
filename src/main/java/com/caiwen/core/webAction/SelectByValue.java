package com.caiwen.core.webAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue extends AbstractWebAction {

    private By by;
    private String value;

    public SelectByValue(WebDriver driver, By by, String value) {
        super(driver);
        this.by = by;
        this.value = value;
    }

    @Override
    public void perform() {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
}
