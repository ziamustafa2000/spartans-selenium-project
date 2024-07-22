package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


    public class activity2 {
        public static void main(String[] args) throws InterruptedException {
            System.out.println();

            WebDriver driver = new ChromeDriver();
            driver.get("https://retail.tekschool-students.com/selenium/dropdown");
            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            Thread.sleep(1000);

            WebElement element = driver.findElement(By.id("languageSelect"));

            Select languageSelect = new Select(element);

            languageSelect.selectByValue("Italian");


        }
    }