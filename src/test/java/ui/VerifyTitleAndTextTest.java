package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitleAndTextTest {

    @Test
    public void titleTest() {
        SoftAssert softAssert = new SoftAssert();
        String expectedtitle = "Electronics,et Cars, Fashion, Collectibles & More | eBay";
        String expectedtext = "Search";
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        String actualtitle = driver.getTitle();
        System.out.println("Verifyng title");
        softAssert.assertEquals(expectedtitle, actualtitle, "Title verfification failed");
        String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
        System.out.println("Verifyng text");
        softAssert.assertEquals(expectedtext, actualtext, "Title verfification failed");
        driver.close();
        System.out.println("Close");
        softAssert.assertAll();

    }
}
