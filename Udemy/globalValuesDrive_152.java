package Udemy;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Properties;

public class globalValuesDrive_152 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/Udemy/data.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("browser"));
        System.out.println(prop.getProperty("url"));
        prop.setProperty("browser", "firefox");
        System.out.println(prop.getProperty("browser"));

        FileOutputStream fos = new FileOutputStream("src/Udemy/data.properties");
        prop.store(fos, null);

    }//end of the main method
}//end of the java class
