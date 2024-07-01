package lesson17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Task17b {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edeno\\Desktop\\Test\\Testify-Automation_School\\Module4\\Tasks_4B\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void formsPage() throws InterruptedException {
        driver.get("https://demoqa.com/");
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200)");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/*[1]")).click();
        Thread.sleep(2000);

        SoftAssert softA = new SoftAssert();
        softA.assertTrue(driver.getCurrentUrl().contains("forms"));
        softA.assertAll();
    }

    @AfterTest
    public void quitBrowser() {
        driver.quit();
    }
}
