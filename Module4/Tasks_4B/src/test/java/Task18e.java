import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

// Checkout Complete Page
public class Task18e {
    WebDriver driver;

    By finishButton = By.id("finish");
    By successMessage = By.xpath("//h2[@class='complete-header']");

    public Task18e(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFinish() {
        driver.findElement(finishButton).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }
}
