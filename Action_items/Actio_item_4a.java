package Action_items;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class Actio_item_4a {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/Resource/chromedriver 2");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        WebDriver driver = new ChromeDriver(options);

        ArrayList<String> zipCodes = new ArrayList<>();
        zipCodes.add("11218");
        zipCodes.add("11238");
        zipCodes.add("11208");
        ArrayList<String> referralCode = new ArrayList<>();
        referralCode.add("1121");
        referralCode.add("1122");
        referralCode.add("1123");
        ArrayList<String> dentalProgram = new ArrayList<>();
        dentalProgram.add("PPO-LOW");
        dentalProgram.add("PPO-MEDIUM");
        dentalProgram.add("PPO-HIGH");

        //1.navigate to the url
        for (int i = 0; i < zipCodes.size(); i++) {
        driver.navigate().to("https://www.metlife.com/");
        String title = driver.getTitle();

        if (title.equals("Insurance and Employee Benefits | MetLife")) {
            System.out.println("Title matches with expected");
        }//end of the if condition
        else {
            System.out.println("Title doesn't matches");
        }//end of the else condition

        System.out.println("The name of the Title is " + title);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(text(),'SOLUTIONS')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(text(),'MetLife TakeAlong Dental')]")).click();

        String newTitle = driver.getTitle();
        if (newTitle.equals("MetLife TakeAlong Dental | MetLife")) {
            System.out.println("Title matches with expected");
        }//end of the if condition
        else {
            System.out.println("Title doesn't matches");
        }//end of the else condition

        System.out.println("The name of the Title is " + newTitle);


        driver.findElement(By.xpath("//*[contains(text(),'Enroll Now')]")).click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

            driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys(zipCodes.get(i));
            driver.findElement(By.xpath("//*[@id='txtZipCodetxt']")).click();
            System.out.println(driver.getTitle());
            Thread.sleep(5000);
            List<WebElement> checkBoxes= driver.findElements(By.xpath("//*[@id='PlanCheckBoxList_0__IsChecked']"));
         if(checkBoxes.get(i).getAttribute("class").equalsIgnoreCase(dentalProgram.get(i)));
         checkBoxes.get(i).click();
         driver.findElement(By.xpath("//a[@id='topenrolltab']")).click();
         Thread.sleep(2000);
            //driver.findElement(By.xpath("//input[@id='txtBxPromocode']")).sendKeys(referralCode.get(i));
            //driver.findElement(By.xpath("//button[@id='enrollgobtn']")).click();
           // System.out.println(driver.findElement(By.xpath("//label[@id='lblRefCodeError']")).getText());
       driver.findElement(By.xpath("//a[@id='withoutrefcode']")).click();

            System.out.println(driver.findElement(By.xpath("//div[@class='col-sm-8']")).getText());

            driver.close();
            driver.switchTo().window(tabs.get(0));




        }//end of the for loop
        driver.quit();
    }//end of the main method
}//end of the java class