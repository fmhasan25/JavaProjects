package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Practice01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "//Users/firoz/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");// hit url on the browser
        driver.findElement(By.xpath("//form[@id='login_form']/table/tbody/tr[2]/td/input")).sendKeys("pass");
        //System.out.println(driver.getTitle());//validate if your page title is correct
        //System.out.println(driver.getCurrentUrl());// validate you are landed on correct url
        //driver.get("http://youtube.com");
        //driver.getTitle();
        //System.out.println(driver.getCurrentUrl());// validate you are landed on correct url
        //driver.navigate().back();
        //driver.close();

        //System.out.println(driver.getPageSource());//print page source

        //driver.get("http://yahoo.com");
        //driver.navigate().back();
        //driver.navigate().forward();
        //driver.close();//it closes current browser
        Thread.sleep(2000);


        driver.quit();//it closes all the browser opened by selenium script when we work on child window
    }
}
