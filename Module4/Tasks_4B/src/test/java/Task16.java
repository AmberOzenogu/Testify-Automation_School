import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;
public class Task16 {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edeno\\Desktop\\Testify\\Testify-Automation_School\\Module4\\Tasks_4B\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void verifyContactDetails() throws InterruptedException {
        driver.get("https://testifyltd.com/");
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 5800)");
        Thread.sleep(3000);

        String email = "info@testifyltd.co.uk";
        String location = "Nigeria";
        String phone = "(+234)904-882-0971";

        SoftAssert softA = new SoftAssert();
        // Assert the contact details
        softA.assertEquals(email, "info@testifyltd.co.uk");
        softA.assertEquals(location, "Nigeria");
        softA.assertEquals(phone, "(+234)904-882-0971");
        softA.assertAll();
    }

    @AfterTest
    public void quitBrowser() {
        driver.quit();
    }
}
