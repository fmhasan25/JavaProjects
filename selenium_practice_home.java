import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_practice_home {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/Resource/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.spicejet.com");

        driver.findElement(By.xpath("(//span[@class='text-label']) [3]")).submit();
    }
}
