package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class customized_reusable {

    static int time=15;
    public static WebDriver setDriver(){
        System.setProperty("webdriver.chrome.driver","src/Resource/chromedriver 2");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        WebDriver driver= new ChromeDriver(options);
        return driver;
    }//end of the set driver method

    public static void verifyTitle(WebDriver driver, String expectedTitle){

      String actualTitle = driver.getTitle();
      if(actualTitle.equals(expectedTitle)){
          System.out.println("The title is as expected and the title is "+ actualTitle);
      }else{
          System.out.println("The title isn't as expected and the actual title is "+actualTitle);
      }//end of if else condition
    }//end of the verify title method

    public static void click(WebDriver driver, String locator, String ElementName){
        WebDriverWait wait = new WebDriverWait(driver,15);
        WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
        element.click();

    }

    public static void userInputClearNSubmit(WebDriver driver,String locator,String userInput, String ElementName){
        WebDriverWait wait = new WebDriverWait(driver,time);
        WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
        element.clear();
        element.sendKeys(userInput);
        element.submit();
    }//end of the userInput method

    public static String captureText(WebDriver driver,String locator, String elementName){
        String text= null;
        WebDriverWait wait = new WebDriverWait(driver,time);
        try{
            System.out.println("Capturing the text");
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
           text= element.getText();
            System.out.println(text);

        }catch (Exception e){
            System.out.println("Unable to capturing text "+ e);

        }


        return text;
    }//end of the capture text




}//end of the java class
