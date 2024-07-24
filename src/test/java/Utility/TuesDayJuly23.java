package Utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TuesDayJuly23 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println();

        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Thread.sleep(1000);

        driver.findElement(By.id("promptBtn")).click();

        // Alert alert = driver.switchTo().alert();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Option 2) using wait and ExpectedCondition as alertIsPresent.
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());


        alert.sendKeys("Mufasa");

        Thread.sleep(2000);
        alert.accept();

        String text = driver.findElement(By.id("message")).getText();

        System.out.println(text);
    }
}
