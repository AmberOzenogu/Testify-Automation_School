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

        // Locate the "Our contact" column
        WebElement contactColumn = driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]"));

        // Extract the contact details
        List<WebElement> contactDetails = contactColumn.findElements(By.tagName("p"));
        String email = contactDetails.get(0).getText().split(": ")[1];
        String location = contactDetails.get(1).getText().split(": ")[1];
        String phone = contactDetails.get(2).getText().split(": ")[1];

        SoftAssert softA = new SoftAssert();
        // Assert the contact details
        softA.assertEquals(email, "info@testifyltd.co.uk", "Email does not match");
        softA.assertEquals(location, "Nigeria", "Location does not match");
        softA.assertEquals(phone, "(+234) 904-882-0971", "Phone number does not match");
        softA.assertAll();
    }

    @AfterTest
    public void quitBrowser() {
        driver.quit();
    }
}
