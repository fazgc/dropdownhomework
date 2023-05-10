package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils {

    public  void openBrowser() {
        //open Chrome browser
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //open url
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }

    public  void closeBrowser() {
        driver.close();
    }
}
