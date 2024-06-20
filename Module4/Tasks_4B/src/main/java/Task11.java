import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edeno\\Desktop\\Testify\\Testify-Automation_School\\Module4\\Tasks_4B\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).click();
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Testify ltd");

        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/img[1]")).click();
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/div[1]/div[1]/div[1]/div[2]/cite[1]")).click();
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 5800)");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("svg.artdeco-icon.lazy-loaded")).click();

        //driver.switchTo().frame(driver.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[2]/div[1]/div[2]/aside[1]/section[1]/iframe[1]")));

        String text = driver.findElement(By.xpath("//body[1]/div[4]/div[3]/div[1]/div[2]/div[1]/div[2]/main[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/p[1]")).getText();
        System.out.println(text);

        Thread.sleep(2000);
        driver.quit();
    }
}
