package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class FaceBookActivity {
    public static void main(String[] args) throws InterruptedException {
        System.out.println();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(3000);

       // wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account"))).click();

        //driver.findElement(By.xpath("//a[text()=\"Create new account\"]"));.click();


        //#u_0_0_XH
    }
}
