package com.caiwen.core.webAction;

import org.openqa.selenium.WebDriver;

public abstract class AbstractWebAction implements TestAction {

    protected WebDriver driver;

    public AbstractWebAction(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return this.driver;
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }



}
