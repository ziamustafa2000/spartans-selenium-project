package CrossBrowsing;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowsing {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();


        driver.manage().window().maximize();
        driver.get("https://google.com");

        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
