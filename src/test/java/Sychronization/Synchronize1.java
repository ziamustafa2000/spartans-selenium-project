package Sychronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Synchronize1 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println();

        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("#signinLink")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("#email")).sendKeys("john2000@gmail.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("#password")).sendKeys("786@Allah");
        driver.findElement(By.cssSelector("#loginBtn")).click();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("#accountLink")).click();
        final var i = new Random().nextInt(9000) + 1000;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("#personalPhoneInput")).sendKeys("442202" + i);
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("#personalUpdateBtn")).click();
        //driver.quit();
        //login__subtitle #loginBtn #accountLink //.account__information-email
        //#personalPhoneInput
    }

}


