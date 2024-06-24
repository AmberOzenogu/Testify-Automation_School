import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task12 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edeno\\Desktop\\Testify\\Testify-Automation_School\\Module4\\Tasks_4B\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://jqueryui.com/");

            driver.findElement(By.xpath("//a[contains(text(),'Resizable')]")).click();
            Thread.sleep(2000);

            driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
            Thread.sleep(2000);

            //resizable handle
            WebElement resizeHandle = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
            Actions mouse = new Actions(driver);
            mouse.clickAndHold(resizeHandle).moveByOffset(150, 150).release().perform();
            Thread.sleep(3000);
        } finally {
            driver.quit();
        }
    }
}