package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitleTest {

    @Test
    public void titleTest() {
        String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        String actualtitle = driver.getTitle();

        Assert.assertEquals(expectedtitle, actualtitle);
        driver.close();
    }
}
