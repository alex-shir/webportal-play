package ui;

import common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerDemoTest extends BaseTest {

    @Test(retryAnalyzer = common.Retry.class)
    public void launchApp() {
        driver.get("https://www.ebay.com/");
        Assert.assertTrue(false);
    }


}
