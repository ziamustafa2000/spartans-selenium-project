package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;


public class Activity2 {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.getTitle();
        driver.quit();
    }
}

