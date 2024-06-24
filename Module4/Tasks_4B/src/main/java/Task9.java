import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edeno\\Desktop\\Testify\\Testify-Automation_School\\Module4\\Tasks_4B\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // Username field
        driver.findElement(By.xpath("//input[@id='user-name']")).click();
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(2000);

        // Password field
        driver.findElement(By.xpath("//input[@id='password']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

        // Log in
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(2000);

        // Navigate back
        driver.navigate().back();
        Thread.sleep(2000);

        String logIn = driver.findElement(By.xpath("//input[@id='login-button']")).getAttribute("value");
        System.out.println(logIn);

        // Navigate forward
        driver.navigate().forward();
        Thread.sleep(2000);

        String product = driver.findElement(By.xpath("//a[@id='item_4_title_link']")).getText();
        System.out.println(product);

        Thread.sleep(2000);
        driver.quit();
    }
}
