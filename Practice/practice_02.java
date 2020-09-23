package Practice;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class practice_02 {
   static WebDriver driver;
    public static void main(String[] args) {

     driver = customized_reusable.setDriver();
     ArrayList <String >sports= new ArrayList<>();
        sports.add("Cricket");
        sports.add("Football");
        sports.add("Baseball");
        for(int i=0; i<sports.size(); i++) {
            driver.navigate().to("https://www.google.com");

            customized_reusable.verifyTitle(driver, "Google browser");
            customized_reusable.click(driver, "//*[@name='q']", "Clicking");
            customized_reusable.userInputClearNSubmit(driver, "//*[@name='q']", sports.get(i), "user input and go");
            String text = customized_reusable.captureText(driver, "//*[@id='result-stats']", "Capturing text");
            String[] fraction = text.split(" ");
            System.out.println("The resutlt is " + fraction[1]);
        }//end of the for loop
        driver.quit();
    }
}
