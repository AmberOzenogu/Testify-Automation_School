import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Inventory Page
public class Task18b {
    WebDriver driver;

    By firstItem = By.xpath("//div[@class='inventory_item'][1]//button");
    By secondItem = By.xpath("//div[@class='inventory_item'][2]//button");
    By cartIcon = By.className("shopping_cart_link");

    public Task18b(WebDriver driver) {
        this.driver = driver;
    }

    public void addItemToCart(int itemIndex) {
        driver.findElement(By.xpath("//div[@class='inventory_item'][" + itemIndex + "]//button")).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }
}
