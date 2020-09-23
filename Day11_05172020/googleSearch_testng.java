package Day11_05172020;

import Resource.Reusable_Library;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class googleSearch_testng {


    WebDriver driver;


    @Test
    public void googleSearch() throws InterruptedException {
        //enter keyword car on my search
        Reusable_Library.userKeys(driver, "//*[@name='q']", "Cars", "Search Field");
        //click on submit
        Reusable_Library.submit(driver, "//*[@name='btnK']", "Google Search Button");
        Thread.sleep(2000);
        String searchResult = Reusable_Library.captureText(driver, "//*[@id='result-stats']", "Search Results");
        //split the text and print the number
        String[] arraySearch = searchResult.split(" ");
        System.out.println("My search number for car is " + arraySearch[1]);

    }//end of the google test

    @BeforeMethod
    public void callDriver() throws IOException, InterruptedException {

        driver = Reusable_Library.setDriver();
        driver.navigate().to("https://www.google.com");
    }//end of BeforeMethod

    @AfterMethod
    public void quitDriver() {
        driver.quit();


    }//end of AfterMethod
}//end of the java class


