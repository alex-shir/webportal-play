package ui;

import common.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportsTest extends BaseTest {

    @Test
    public void reportertest1() {
        System.out.println("This is test1");
        driver.get("https://ebay.com");
        Assert.assertTrue(false);
    }

    @Test
    public void reportertest2() {
        Reporter.log("This is test2");
        System.out.println("This is test2");
    }

    @Test
    public void reportertest3() {
        System.out.println("This is test3");
    }

    @Test
    public void reportertest4() {
        System.out.println("This is test4");
    }
}
