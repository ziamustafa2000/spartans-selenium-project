package Locatars.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopaFinal {

    public static void main(String[] args) {
        System.out.println();

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("copa 2024 final");
        driver.findElement(By.name("q")).click();

        driver.findElement(By.name("btnK")).click();
    }
}