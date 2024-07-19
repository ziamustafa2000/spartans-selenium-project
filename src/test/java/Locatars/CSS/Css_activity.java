package Locatars.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.awt.SystemColor.text;

public class Css_activity {

    public static void main(String[] args) throws InterruptedException {

        System.out.println();

        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("#signinLink")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("john2000@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("786@Allah");
        driver.findElement(By.cssSelector("#loginBtn")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#accountLink")).click();
        driver.findElement(By.cssSelector(".account__information-email")).getText();
        //driver.findElement(By.cssSelector("a#accountLink")).click();
        String email = driver.findElement(By.cssSelector(".account__information-email")).getText();
        System.out.println("Email: " + email);
        driver.quit();
        //login__subtitle #loginBtn #accountLink //.account__information-email
    }

}
