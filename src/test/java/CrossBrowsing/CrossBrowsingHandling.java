package CrossBrowsing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class CrossBrowsingHandling {

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Choose browser chrome, firefox and edge");
            scn.next();
            String browserType = scn.next();

            WebDriver driver;

            if (browserType.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            } else if (browserType.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            } else if (browserType.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            }else {
                throw new RuntimeException("Wrong driver");
            }

            driver.get("https://google.com");
        }
    }
