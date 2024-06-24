import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edeno\\Desktop\\Testify\\Testify-Automation_School\\Module4\\Tasks_4B\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/dialog/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[contains(text(),'Dialog')]")).click();
        Thread.sleep(2000);

        driver.switchTo().frame(driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]")));
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/button[1]/span[1]")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
