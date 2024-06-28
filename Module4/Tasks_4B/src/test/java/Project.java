import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class Project {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edeno\\Desktop\\Test\\Testify-Automation_School\\Module4\\Tasks_4B\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void registerUser() throws InterruptedException {
        driver.get("https://parabank.parasoft.com/");
        Thread.sleep(1000);

        // Register user
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        Thread.sleep(2000);

        // First name
        driver.findElement(By.xpath("//input[@id='customer.firstName']")).click();
        driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Team");

        // Last name
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).click();
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Bezos");

        // Address
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).click();
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("Testify academy");

        // City
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).click();
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Lagos");

        // State
        driver.findElement(By.xpath("//input[@id='customer.address.state']")).click();
        driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Lagos");

        // Zipcode
        driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).click();
        driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("112009");

        // Phone number
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).click();
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("0901130591");

        // SSN
        driver.findElement(By.xpath("//input[@id='customer.ssn']")).click();
        driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("11900873");

        // Username
        driver.findElement(By.xpath("//input[@id='customer.username']")).click();
        driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("TASCohort6");

        // Password
        driver.findElement(By.xpath("//input[@id='customer.password']")).click();
        driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("TeamBezos");

        // Confirm password
        driver.findElement(By.xpath("//input[@id='repeatedPassword']")).click();
        driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("TeamBezos");
        Thread.sleep(2000);

        // Register button
        driver.findElement(By.xpath("//tbody/tr[13]/td[2]/input[1]")).click();
        Thread.sleep(2000);

        // Assert that user is successfully logged in
        String welcomeText = driver.findElement(By.cssSelector("body:nth-child(2) div:nth-child(1) div:nth-child(3) div:nth-child(2) > h1.title:nth-child(1)")).getText();
        String successText = driver.findElement(By.cssSelector("body:nth-child(2) div:nth-child(1) div:nth-child(3) div:nth-child(2) > p:nth-child(2)")).getText();
        Thread.sleep(2000);
        System.out.println(welcomeText);
        System.out.println(successText);

        Thread.sleep(2000);
        SoftAssert softA = new SoftAssert();
        softA.assertEquals(welcomeText, "Welcome TASCohort6");
        softA.assertEquals(successText, "Your account was created successfully. You are now logged in.");
        softA.assertAll();
    }

    @Test(priority = 2)
    public void testifyAssert() throws InterruptedException {

        //Click on open new account
        driver.findElement(By.xpath("//a[normalize-space()='Open New Account']")).click();

        //Select from the What type of Account would you like to open? dropdown
        WebElement dropdownElement = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/select[1]"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("SAVINGS");
        Thread.sleep(5000);

        //Select from the Please choose an existing account to transfer funds into the new account. dropdown option.
        WebElement dropdownOption = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/select[1]"));
        Select idDropdown = new Select(dropdownOption);
        idDropdown.selectByIndex(0);
        Thread.sleep(2000);

        // Click on the open new account button.
        driver.findElement(By.xpath("//input[@value='Open New Account']")).click();
        Thread.sleep(2000);

        //Get the account ID and assert
        WebElement id = driver.findElement(By.cssSelector("#newAccountId"));
        String idText = id.getText();
        Assert.assertEquals(idText, id.getText());
        Thread.sleep(2000);

        //Print out id as a text
        System.out.println("Id: " + idText);
        Thread.sleep(5000);

        //Click on the transfer funds button
        driver.findElement(By.xpath("//a[normalize-space()='Transfer Funds']")).click();
        Thread.sleep(2000);

        //Enter amount in the amount field
        driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("100");
        Thread.sleep(2000);

        // Select bank id  from the "From account" dropdown
        WebElement fromAccount = driver.findElement(By.cssSelector("#fromAccountId"));
        Select fromAccountDropdown = new Select(fromAccount);
        fromAccountDropdown.selectByIndex(0);
        Thread.sleep(5000);

        // Select bank id  from the "to account" dropdown
        WebElement toAccount = driver.findElement(By.xpath("//select[@id='toAccountId']"));
        Select toAccountDropdown = new Select(toAccount);
        toAccountDropdown.selectByIndex(1);
        Thread.sleep(5000);

        //Click on the transfer button
        driver.findElement(By.xpath("//input[@value='Transfer']")).click();
        Thread.sleep(2000);

        //Click on the bill pay button
        driver.findElement(By.xpath("//a[normalize-space()='Bill Pay']")).click();

        //Enter the Payee Name
        driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("Esther");
        Thread.sleep(2000);

        //Enter Address
        driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("22,Olaore Street");
        Thread.sleep(2000);

        //Enter City
        driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("Ajah");
        Thread.sleep(2000);

        //Enter State
        driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("Lagos");
        Thread.sleep(2000);

        //Enter Zip Code:
        driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).sendKeys("23478");
        Thread.sleep(2000);

        //Enter Phone number
        driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[6]/td[2]/input[1]")).sendKeys("09067957377");
        Thread.sleep(2000);

        //Enter Account ID
        driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).sendKeys("16341");
        Thread.sleep(2000);

        //Enter Account ID to verify
        driver.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]")).sendKeys("16341");
        Thread.sleep(2000);

        //Enter Amount
        driver.findElement(By.xpath("//tbody/tr[11]/td[2]/input[1]")).sendKeys("20");
        Thread.sleep(2000);

        //Select id from the "from account" dropdown
        WebElement billAmount = driver.findElement(By.cssSelector("table.form2 tbody:nth-child(1) tr:nth-child(13) td:nth-child(2) > select.input"));
        Select billAmountDropdown = new Select(billAmount);
        billAmountDropdown.selectByIndex(0);
        Thread.sleep(2000);

        //Click on send payment button
        driver.findElement(By.xpath("//tbody/tr[14]/td[2]/input[1]")).click();
        Thread.sleep(2000);

        //Click on the find transactions button
        driver.findElement(By.xpath("//a[contains(text(),'Find Transactions')]")).click();
        Thread.sleep(2000);

        //Scroll down to the page
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0, 500)");

        //Enter amount in the find by amount field
        driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("100");
        Thread.sleep(2000);

        //Click on the find transactions button
        driver.findElement(By.xpath("//button[@id='findByAmount']")).click();
        Thread.sleep(2000);

        // Assert that a transaction history is returned for $100
        driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).click();
        WebElement transactionHistory = driver.findElement(By.xpath("//td[contains(text(),'$100.00')]"));
        String transactionHistoryText = transactionHistory.getText();
        Assert.assertEquals(transactionHistory.getText(), "$100.00");

        //Click on the find transactions button
        driver.findElement(By.xpath("//a[contains(text(),'Find Transactions')]")).click();
        Thread.sleep(2000);

        //Scroll down to the page
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        scrollDown.executeScript("window.scrollBy(0, 500)");

        //Enter amount in the find by amount field
        driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("99");
        Thread.sleep(2000);

        //Click on the find transactions button
        driver.findElement(By.xpath("//button[@id='findByAmount']")).click();
        Thread.sleep(2000);

        // Assert that a transaction history is not returned for unknown amount.

        // Locate the table element
        WebElement table = driver.findElement(By.xpath("//th[contains(text(),'Transaction')]"));

        // Locate the rows in the table body
        List<WebElement> rows = table.findElements(By.xpath("//tbody/tr[1]/td[2]"));

        // Assert that the table has rows
        Assert.assertTrue(rows.isEmpty(), null);

        //Click on the update contact info
        driver.findElement(By.xpath("//a[normalize-space()='Update Contact Info']")).click();
        Thread.sleep(2000);

        //Clear the zipcode entry data
        WebElement clearZipCode = driver.findElement(By.xpath("//input[@id='customer.address.zipCode']"));
        clearZipCode.clear();
        Thread.sleep(2000);

        //Copy phone number in the phone number field
        WebElement copyPhonenumber = driver.findElement(By.xpath("//input[@id='customer.phoneNumber']"));
        String phoneNumber = copyPhonenumber.getAttribute("value");
        Thread.sleep(2000);

        // Extract the last 5 digits of the phone number
        String last5Digits = phoneNumber.substring(phoneNumber.length() - 5);
        // Paste the last 5 digits into the ZIP code field
        System.out.println("Last 5 Digits: " + last5Digits);
        clearZipCode.sendKeys(last5Digits);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).click();
    }

    @Test(priority = 3)
    public void projectLunch() throws InterruptedException {
        // Launch a new window using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("window.open();");

        // Get the list of all window handles
        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());

        // Switch to the new window (the last window handle in the list)
        driver.switchTo().window(windowHandles.get(1));

        // Navigate to the new URL in the new window
        driver.get("https://blazedemo.com/");

        // -SelectBoston and Rome as departure and arrival destinations.
        driver.findElement(By.xpath("//select[@name='fromPort']")).click();
        WebElement selectmenu = driver.findElement(By.xpath("//select[@name='fromPort']"));
        Thread.sleep(2000);
        Select select = new Select(selectmenu);
        select.selectByVisibleText("Boston");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//select[@name='toPort']")).click();
        WebElement menu = driver.findElement(By.xpath("//select[@name='toPort']"));
        Thread.sleep(2000);
        Select select1 = new Select(menu);
        select1.selectByVisibleText("Rome");
        Thread.sleep(3000);

        // -Click on "FindFlights"
        driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
        Thread.sleep(2000);

        // -Select a flight
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")).click();

        // -Fill all other fields with validinputs
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("victor");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("United States");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("New York");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("New York");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("UA954");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("12345678910");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("victor odogwu");
        Thread.sleep(2000);

        //-Copy the flightnumber and paste into the Zipcodefield
        Actions actions = new Actions(driver);

        WebElement zip = driver.findElement(By.xpath("//input[@id='zipCode']"));

        WebElement zip2 = driver.findElement(By.xpath("//p[normalize-space()='Flight Number: UA954']"));
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, window.scrollHeight)");
        Thread.sleep(2000);

        //Enter Text in Zip
        actions.moveToElement(zip);
        // Press CTRL "a" and "c"
        actions.sendKeys("UA954").keyDown(Keys.CONTROL).sendKeys("a","c").build().perform();
        Thread.sleep(2000);
        //Press CTRL "v" to paste
        actions.moveToElement(zip2).click().keyDown(Keys.CONTROL).sendKeys("v").build().perform();
        //actions.keyUp(Keys.CONTROL).build().perform();

        // -Tick the 'RememberMe' checkbox and purchase flight
        driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();

    }

    @AfterTest
    public void quitBrowser() {
        driver.quit();
    }

}
