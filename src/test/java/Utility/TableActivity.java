package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TableActivity {
    public static void main(String[] args) throws InterruptedException {
        System.out.println();


        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Thread.sleep(1000);

        driver.findElement(By.linkText("Login")).click();

        driver.findElement(By.id("username")).sendKeys("supervisor");
        driver.findElement(By.id("password")).sendKeys("tek_supervisor");
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Thread.sleep(1000);

        driver.findElement(By.linkText("Plans")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Thread.sleep(1000);

        driver.findElement(By.xpath("//thead/tr/th[3]"));
        //table/tbody/tr[1]/td[3]




    }
}