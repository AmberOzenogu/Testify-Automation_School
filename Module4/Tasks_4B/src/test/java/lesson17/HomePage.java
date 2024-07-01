package lesson17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edeno\\Desktop\\Test\\Testify-Automation_School\\Module4\\Tasks_4B\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void verifyHomePage() {
        driver.get("https://demoqa.com");
        Assert.assertEquals(driver.getTitle(), "DEMOQA");
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
