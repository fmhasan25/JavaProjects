package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
public class BrowserStake_practice01 {

        public static final String AUTOMATE_USERNAME = "mahamudhasan1";
        public static final String AUTOMATE_ACCESS_KEY = "4WCXpqZqww78xCxx9WL5";
        public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
        public static void main(String[] args) throws Exception {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("os_version", "10");
            caps.setCapability("resolution", "1920x1080");
            caps.setCapability("browser", "chrome");
            caps.setCapability("browser_version", "85.0");
            caps.setCapability("os", "Windows");
            WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
            driver.get("https://www.google.com");
            WebElement element = driver.findElement(By.name("q"));
            element.sendKeys("BrowserStack");
            element.submit();
            System.out.println(driver.getTitle());
            driver.quit();
        }
}
