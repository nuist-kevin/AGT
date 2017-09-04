package com.caiwen.core.webAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.function.Function;
import java.util.function.Predicate;

public class Predication implements Function<Predicate<By>, String> {

    By by;

    @Override
    public String apply(Predicate<By> byPredicate) {
        byPredicate.test(by);
        return null;
    }
}
