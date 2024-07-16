package Locatars.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {

    public static void main(String[] args) {
        System.out.println();

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("euro 2024 final score");
        driver.findElement(By.name("q")).click();

        driver.findElement(By.name("btnK")).click();

        //driver.findElement(By.anchor("href=\"https://tekschool.us/\"")).click();
       // driver.findElement(By.xpath("//a[@href='https://tekschool.us/']")).click();






    }

}
