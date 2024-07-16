package Locatars.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagName {

    public static void main(String[] args) {
        System.out.println();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");

        By anchorsTagLocator = By.tagName("a");

        List<WebElement> anchorElements = driver.findElements(anchorsTagLocator);

        System.out.println(anchorElements.size());

        for (WebElement element : anchorElements) {
            System.out.println(element.getText());
        }
        By imageTag = By.tagName("img");
        List<WebElement> imagesElements = driver.findElements(imageTag);
            System.out.println(imagesElements.size());

        List<WebElement> buttonsElements = driver.findElements(By.tagName("button"));
            System.out.println(buttonsElements.size());

        for (WebElement element : buttonsElements){
            String text = element.getText();
            if(!text.isEmpty())
                System.out.println(text);
        }
            driver.quit();
        }
    }

}