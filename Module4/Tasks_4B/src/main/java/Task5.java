import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edeno\\Desktop\\Testify\\Testify-Automation_School\\Module4\\Tasks_4B\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try{

            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");

            // Username field
            driver.findElement(By.xpath("//input[@id='user-name']")).click();
            driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

            // Password field
            driver.findElement(By.xpath("//input[@id='password']")).click();
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

            driver.findElement(By.xpath("//input[@id='login-button']")).click();
            Thread.sleep(2000);
            // Add to cart
            driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
            Thread.sleep(2000);

            // Shopping cart icon
            driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
            Thread.sleep(2000);

            // Checkout
            driver.findElement(By.xpath("//button[@id='checkout']")).click();
            Thread.sleep(2000);

        } catch (InterruptedException e) {
        e.printStackTrace();
        } finally {
        // Close the browser
        driver.quit();
        }
    }
}
