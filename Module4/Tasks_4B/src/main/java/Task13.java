import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task13 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edeno\\Desktop\\Testify\\Testify-Automation_School\\Module4\\Tasks_4B\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/");

        driver.findElement(By.xpath("//div[contains(text(),'Search')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("Demo dropdown");
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/label[1]/div[1]/*[1]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/article[1]/div[1]/div[2]/div[3]/div[1]/a[1]")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");

        Thread.sleep(2000);

        WebElement country = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]"));

        Select varCountry = new Select(country);
        varCountry.selectByVisibleText("Nigeria");
        Thread.sleep(2000);

        WebElement month = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/select[1]"));

        Select varMonth = new Select(month);
        varMonth.selectByVisibleText("January");
        varMonth.selectByVisibleText("February");
        varMonth.selectByVisibleText("March");
        Thread.sleep(2000);

        driver.quit();
    }
}
