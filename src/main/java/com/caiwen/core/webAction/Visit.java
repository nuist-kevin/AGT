package com.caiwen.core.webAction;

import org.openqa.selenium.WebDriver;

/**
 * Created by caiwen on 2017/6/18.
 */
public class Visit extends AbstractWebAction {

    private String url;

    public Visit(WebDriver driver, String url) {
        super(driver);
        this.url = url;
    }


    @Override
    public void perform() {
        this.driver.get(this.url);
    }
}
