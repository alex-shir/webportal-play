package common;


import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import utillities.testUtils;

import java.io.IOException;

public class Listeners extends testUtils implements ITestListener {
    public void onTestStart(ITestResult result) {
        Reporter.log("Method name is - " + result.getName());
        System.out.println("Test case is start");
    }

    public void onTestSuccess(ITestResult result) {
        Reporter.log("Status of execution is -" + result.getStatus());
        System.out.println("Test case is sucess");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test case is failure - screenshot");

        try {
            getScreenshot();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Reporter.log("<a href=\"C:\\gitprojects\\autowithmaven\\webportal\\scrennshot\\Mon-Aug-07-16-04-47-MSK-2023.png\">Test Results</a>");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test case is skip");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test case is failure within percentage");
    }
}