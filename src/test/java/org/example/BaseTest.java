package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {

    DriverManager driverManager = new DriverManager();
    @BeforeMethod
    public  void setUp(){
        driverManager.openBrowser();
    }
    @AfterMethod

    public  void tearDown(){
        driverManager.closeBrowser();
    }

}
