import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task15 {
    WebDriver driver;

    @BeforeClass
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edeno\\Desktop\\Testify\\Testify-Automation_School\\Module4\\Tasks_4B\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void searchTestify() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Testify ltd");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).submit();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void printButtonColor() throws InterruptedException {
        driver.get("https://www.mcdonalds.com/us/en-us.html");
        Thread.sleep(2000);
        WebElement orderNowBtn = driver.findElement(By.xpath("//a[@id='button-ordernow']"));
        String color = orderNowBtn.getCssValue("background-color");
        System.out.println("The color code of the Order Now button is: " + color);
    }

    @AfterClass
    public void quitBrowser() {
        driver.quit();
    }
}
