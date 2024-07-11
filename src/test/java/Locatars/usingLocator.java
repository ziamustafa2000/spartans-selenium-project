package Locatars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingLocator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        // locate the Element
        By searchProductName = By.id("productName");
        //find the Element
        WebElement searchInputElement = driver.findElement(searchProductName);
        // Preform Action
        searchInputElement.sendKeys("tv");

        By searchButton = By.id("searchButton");
        WebElement searchButtonElement = driver.findElement(searchButton);
        searchButtonElement.click();

    }
}
