import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_selenium {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","src/Resource/chromedriver 2");
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("http://qaclickacademy.com/interview.php");
            driver.findElement(By.xpath("//*[@id='tablist1-tab2']")).click();
        }
    }

