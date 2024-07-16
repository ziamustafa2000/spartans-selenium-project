package Locatars.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static jdk.internal.org.jline.utils.Colors.s;

public class Locators01 {
    public static void main(String[] args) {
        System.out.println();
        webDriver driver = new ChromeDriver();
        webDriver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximaze();


        By signInLocator = By.name(signInLink);
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();

        By emailLocator = By.name(keyInEmail);
        WebElement keyInEmailElement = driver.keyInEmailElement(emailLocator);
        keyInEmailElement.sendKeys();


        By passwordLocator = By.Password(keyInPassword);
        WebElement keyInPassword = driver.keyInPasswordElement(passwordLocator);
        KeyInPasswordElement.sendKeys();


    }
}
