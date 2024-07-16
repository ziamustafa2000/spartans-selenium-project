package Review_week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Thread.sleep(20000);

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        //Locate the element.
        By signInLocator = By.id("signinLink");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();
        //find the Element
        By createNewAccount = By.id("newAccountBtn");
        WebElement createNewAccountElement = driver.findElement(createNewAccount);
        createNewAccountElement.click();

        //Perform the Action
        By nameLocator = By.id("nameInput");
        WebElement nameElement = driver.findElement(nameLocator);
        nameElement.sendKeys("Zia");

        By emailInputLocator = By.id("emailInput");
        WebElement emailInputElement = driver.findElement(emailInputLocator);
        emailInputElement.sendKeys("zia@hotmail.com");


        By passwordLocator = By.id("passwordInput");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("Kabul@Jan123");

        By confirmPasswordLocator = By.id("passwordInput");
        WebElement confirmPasswordElement = driver.findElement(confirmPasswordLocator);
        confirmPasswordElement.sendKeys("Kabul@Jan123");
        driver.findElement(By.id("confirmPasswordInput")).sendKeys("Eric@110");

        By signUpLocator = By.id("newAccountBtn");
        WebElement signUpElement = driver.findElement(signUpLocator);
        signUpElement.click();


        driver.findElement(By.id("signupBtn")).click();
        Thread.sleep(3000);
        boolean profilePicture = driver.findElement(By.id("profileImage")).isDisplayed();
        if (profilePicture) System.out.println("Test Passed...");
        else System.out.println("Test Failed...");
        driver.quit();

        }
    }

