import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edeno\\Desktop\\Testify\\Testify-Automation_School\\Module4\\Tasks_4B\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try{

            driver.manage().window().maximize();
            driver.get("https://worldweather.wmo.int/en/home.html");

            // Search
            driver.findElement(By.xpath("//input[@id='q_search']")).click();
            driver.findElement(By.xpath("//input[@id='q_search']")).sendKeys("Lagos");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input.top_searchbox_submit")).click();
            Thread.sleep(2000);

            String day1 = driver.findElement(By.xpath("//div[@class='city_fc_block_mask']/child::div[1]/child::div[1]")).getText();
            System.out.println("Day 1 : \n" +day1);
            System.out.println("-----------------");

            String day2 = driver.findElement(By.xpath("//div[@class='city_fc_block_mask']/child::div[1]/child::div[2]")).getText();
            System.out.println("Day 2 : \n" +day2);
            System.out.println("-----------------");

            String day3 = driver.findElement(By.xpath("//div[@class='city_fc_block_mask']/child::div[1]/child::div[3]")).getText();
            System.out.println("Day 3 : \n" +day3);
            System.out.println("-----------------");

            String day4 = driver.findElement(By.xpath("//div[@class='city_fc_block_mask']/child::div[1]/child::div[4]")).getText();
            System.out.println("Day 4 : \n" +day4);
            System.out.println("-----------------");

//            String day5 = driver.findElement(By.xpath("//div[@class='city_fc_block_mask']/child::div[1]/child::div[5]")).getText();
//            System.out.println("Day 5 : \n" +day5);
//            System.out.println("-----------------");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
