package Practice;

import net.bytebuddy.implementation.bytecode.constant.JavaConstantValue;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice_04 {

    public static WebDriver setDriver(){
        System.setProperty("webdriver.chrome.driver","src/Resource/chromedriver 2");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Incognito");
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }//end of the setDriver method

    public static void verifyTitle(WebDriver driver, String expectedTitle){
        String actualTitle= driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("The title is as expected and the title is "+ actualTitle);
        }else{
            System.out.println("The title is not as expected.The actual title is "+ actualTitle);
        }//end of the if else statement
    }//end of the verifyTitle method

    public static void mouseHover(WebDriver driver,String locator,String ElementName){
        WebDriverWait wait = new WebDriverWait(driver,15);
        Actions mouse = new Actions(driver);

        try{
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            mouse.moveToElement(element).build().perform();
            System.out.println("mouse hovering over the Men button");
        }catch (Exception e){
            System.out.println("Unable to mouse hover over Men button "+e);
        }//end of the try-catch function
    }//end of the mouseHover

    public static void click(WebDriver driver,String locator,String elementName){

        WebDriverWait wait = new WebDriverWait(driver,15);
        try{
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            element.click();
            System.out.println("clicking the "+ elementName);
        }catch (Exception e){
            System.out.println("Unable to click"+ elementName+ e);
        }//end of the try-catch function
    }//end of the click method

    public static void scroll(WebDriver driver,String locator,String elementName){

        WebDriverWait wait = new WebDriverWait(driver,15);
        JavascriptExecutor jsc= (JavascriptExecutor) driver;
        try{

            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            jsc.executeScript("arguments[0].scrollIntoView(true)",element);
            System.out.println("Scrolling to "+elementName);
        }catch (Exception e){
            System.out.println("Unable to scroll to "+elementName+ e);
        }//end of the try-catch function
    }






//--------------------------------------
static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver= practice_04.setDriver();
        driver.navigate().to("https://www2.hm.com/en_us/index.html");
        Thread.sleep(3500);
        practice_04.verifyTitle(driver,"HM");
        practice_04.mouseHover(driver,"(//*[@class='menu__super-link']) [3]","mouse hover");
        Thread.sleep(2500);
        practice_04.click(driver,"(//*[contains(text(),'Jeans')]) [3]","Jeans");
        Thread.sleep(2500);
        practice_04.scroll(driver,"(//*[@class='section']) [1]","Men's Jeans");
        practice_04.click(driver,"(//*[@class='item-link remove-loading-spinner']) [1]","clicking product");
        Thread.sleep(3000);
        practice_04.click(driver,"(//*[contains(@class,'js-picker')]) [1]","select size");
        Thread.sleep(2000);
        practice_04.click(driver,"//*[@data-code='0720810011059']","select size");
        //driver.findElement(By.cssSelector("li[data-code='0720810011059']")).click();

    }

}//end of the java class
