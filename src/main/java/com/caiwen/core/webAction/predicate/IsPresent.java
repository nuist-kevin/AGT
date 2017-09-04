package com.caiwen.core.webAction.predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.function.Predicate;

public class IsPresent implements Predicate<By> {

    private WebDriver driver;

    public IsPresent(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean test(By by) {
        return by.findElement(driver).isDisplayed();

    }
}
