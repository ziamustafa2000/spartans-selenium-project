package Locatars.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static jdk.internal.org.jline.utils.Colors.s;

public class Locators01 {
    public static void main(String[] args) {
        System.out.println();
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();


        By signInLocator = By.linkText("signInLink");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();

        driver.findElement(By.linkText("Create New Account")).click();

        driver.findElement(By.name("name")).sendKeys("Zia");

        driver.findElement(By.name("email")).sendKeys("zia123@gmail.com");

        driver.findElement(By.name("password")).sendKeys("123Cancel");

        driver.findElement(By.name("confirmPassword")).sendKeys("123Cancel");

        driver.findElement(By.id("signupBtn")).click();

        String errorText = driver.findElement(By.className("error")).getText();

        System.out.println(errorText);

        driver.quit();




    }
}
