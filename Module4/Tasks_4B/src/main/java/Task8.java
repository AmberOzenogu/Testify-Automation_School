import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edeno\\Desktop\\Testify\\Testify-Automation_School\\Module4\\Tasks_4B\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://idorenyinankoh.github.io/loginPage/");
        Thread.sleep(2000);

        // first name
        driver.findElement(By.xpath("//input[@id='firstName']")).click();
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Bambi");
        Thread.sleep(2000);

        // check if the "create account" button is enabled"
        boolean button = driver.findElement(By.id("create")).isEnabled();
        System.out.println(button);
        Thread.sleep(2000);

        // last name
        driver.findElement(By.xpath("//input[@id='lastName']")).click();
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Darren");
        Thread.sleep(2000);

        // email
        driver.findElement(By.xpath("//input[@id='email']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bambiD@gmail.com");
        Thread.sleep(2000);

        // gender
        driver.findElement(By.xpath("//input[@id='female']")).click();

        // password
        driver.findElement(By.xpath("//input[@id='password']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password3");
        Thread.sleep(2000);

        // confirm password
        driver.findElement(By.xpath("//input[@id='confirmPass']")).click();
        driver.findElement(By.xpath("//input[@id='confirmPass']")).sendKeys("Password3");
        Thread.sleep(2000);

        // about you
        driver.findElement(By.xpath("//input[@id='xpLevel']")).click();
        driver.findElement(By.xpath("//input[@id='xpLevel']")).sendKeys("I like reading books.");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]")).click();

        boolean btn = driver.findElement(By.xpath("//button[@id='create']")).isEnabled();
        System.out.println(btn);

        Thread.sleep(2000);
        driver.quit();
    }
}
