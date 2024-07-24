package Utility;

/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class TuesDayJuly23NewTab {

    public static void main(String[] args) throws InterruptedException {
        System.out.println();
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Thread.sleep(1000);

        String currentWindowId = driver.getWindowHandle();

        driver.findElement(By.linkText("Test Selenium")).click();
        Thread.sleep(2000);

       // Set<String> allTabs = driver.getWindowHandles();


      /*  for (String tab = allTabs) {
            if (!tab.equals(currentWindowId)) {
                driver.switchTo().window(tab);
                break;
            }
        }
*/