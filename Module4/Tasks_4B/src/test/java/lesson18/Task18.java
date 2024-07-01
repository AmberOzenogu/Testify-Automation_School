package lesson18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task18 {
    WebDriver driver;
    Task18a loginPage;
    Task18b inventoryPage;
    Task18c cartPage;
    Task18d checkoutPage;
    Task18e checkoutCompletePage;

    @BeforeTest
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edeno\\Desktop\\Test\\Testify-Automation_School\\Module4\\Tasks_4B\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new Task18a(driver);
        inventoryPage = new Task18b(driver);
        cartPage = new Task18c(driver);
        checkoutPage = new Task18d(driver);
        checkoutCompletePage = new Task18e(driver);
    }

    @Test
    public void testOrderItem() throws InterruptedException {
        driver.get("https://www.saucedemo.com");

        // Login
        loginPage.login("standard_user", "secret_sauce");
        Thread.sleep(2000);

        // Add items to cart
        inventoryPage.addItemToCart(1);
        inventoryPage.addItemToCart(2);

        // Go to cart
        inventoryPage.goToCart();
        Thread.sleep(2000);

        // Assert items in cart
        Assert.assertEquals(cartPage.getCartItemName(0), "Sauce Labs Backpack");
        Assert.assertEquals(cartPage.getCartItemName(1), "Sauce Labs Bike Light");
        Thread.sleep(2000);

        // Checkout
        cartPage.clickCheckout();
        Thread.sleep(2000);
        checkoutPage.enterCheckoutInformation("Gladys", "Chance", "12201");
        Thread.sleep(3000);

        // Assert items in checkout overview
        Assert.assertEquals(cartPage.getCartItemName(0), "Sauce Labs Backpack");
        Assert.assertEquals(cartPage.getCartItemName(1), "Sauce Labs Bike Light");
        Thread.sleep(2000);

        // Finish order
        checkoutCompletePage.clickFinish();
        Thread.sleep(3000);
        Assert.assertEquals(checkoutCompletePage.getSuccessMessage(), "Thank you for your order!");
        Thread.sleep(2000);
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
