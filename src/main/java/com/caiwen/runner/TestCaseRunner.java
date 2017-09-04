package com.caiwen.runner;

import com.caiwen.core.webAction.TestAction;
import com.caiwen.core.webAction.WebAction;

import java.util.List;

public class TestCaseRunner {

    List<TestAction> actions;

    String result;

    public TestCaseRunner(List<TestAction> actions) {
        this.actions = actions;
    }

    public void run() {

        for (TestAction action: actions) {
            try {
                action.perform();
            } catch (Exception e) {
                e.printStackTrace();
                if (WebAction.class.isAssignableFrom(action.getClass())) {
                    ((WebAction)action).getDriver().quit();
                    result = "FAIL";
                    break;
                }
            }
        }
        result = (result == null) ? "SUCCESS" : "FAIL";
    }

    public List<TestAction> getActions() {
        return actions;
    }

    public String getResult() {
        return result;
    }
}
