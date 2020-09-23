package Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class practice_03 {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = customized_reusable.setDriver();
        driver.navigate().to("https://www.usps.com");
        Thread.sleep(3000);
Actions mouse = new Actions(driver);
WebElement element = driver.findElement(By.xpath("//*[text()='Track & Manage']"));
mouse.moveToElement(element).build().perform();
driver.findElement(By.xpath("//*[contains(text(),'Rent or Renew')]")).click();
Thread.sleep(5000);
WebElement needHelp= driver.findElement(By.xpath("//*[contains(text(),'Need Help?')]"));
JavascriptExecutor jsc= (JavascriptExecutor) driver;
jsc.executeScript("arguments[0].scrollIntoView(true)",needHelp);

    }//end of the main method
}//end of the java class
