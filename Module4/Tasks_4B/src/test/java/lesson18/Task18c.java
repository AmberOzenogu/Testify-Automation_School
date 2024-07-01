package lesson18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Cart Page
public class Task18c {
    WebDriver driver;

    By cartItems = By.className("inventory_item_name");
    By checkoutButton = By.id("checkout");

    public Task18c(WebDriver driver) {
        this.driver = driver;
    }

    public String getCartItemName(int itemIndex) {
        return driver.findElements(cartItems).get(itemIndex).getText();
    }

    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }
}
