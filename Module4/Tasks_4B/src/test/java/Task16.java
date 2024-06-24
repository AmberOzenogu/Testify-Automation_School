import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
        Thread.sleep(2000);

        String email = driver.findElement(By.xpath("//span[contains(text(),'info@testifyltd.com')]")).getText();
        String phone = driver.findElement(By.xpath("//span[contains(text(),'(+234)905-882-0971')]")).getText();
        String country = driver.findElement(By.xpath("//span[contains(text(),'Nigeria')]")).getText();

        SoftAssert softA = new SoftAssert();
        softA.assertEquals(email, "info@testifyltd.com");
        softA.assertEquals(phone, "(+234)905-882-0971");
        softA.assertEquals(country, "Nigeria");
        softA.assertAll();

        Thread.sleep(2000);
        System.out.println(email);
        System.out.println(phone);
        System.out.println(country);
    }

    @AfterTest
    public void quitBrowser() {
        driver.quit();
    }
}

// Assert that an element is displayed assertThat(element).isDisplayed();
// Assert that an element has a specific text assertThat(element.getText()).isEqualTo("Expected Text");
// Assert that the page title matches an expected title
// assertThat(driver.getTitle()).isEqualTo("Expected Title");