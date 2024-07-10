package tek.intro;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleBrowser {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://google.com");

        String title = chromeDriver.getTitle();
        System.out.println(title);

        chromeDriver.close();
    }
}