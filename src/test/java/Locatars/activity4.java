package Locatars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class activity4 {


    public static void main(String[] args) throws InterruptedException {
        System.out.println();


        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);



       driver.findElement(By.xpath("//p[text()='Video Games']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//p[text()='PlayStation 5 Console']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
        Thread.sleep(1500);


        System.out.println();
        }
    }

