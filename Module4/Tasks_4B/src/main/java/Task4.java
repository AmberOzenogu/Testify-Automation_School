import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edeno\\Desktop\\Testify\\Testify-Automation_School\\Module4\\Tasks_4B\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/");

        driver.findElement(By.linkText("Security Project")).click();
//        driver.findElement(By.id("dismiss-button")).click();
        driver.navigate().refresh();

        driver.findElement(By.linkText("Security Project")).click();
        driver.findElement(By.name("uid")).sendKeys("AmberO");
        driver.findElement(By.name("password")).sendKeys("Test123");
    }
}