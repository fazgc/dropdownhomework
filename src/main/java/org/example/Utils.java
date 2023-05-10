package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.sql.Timestamp;

import static java.awt.SystemColor.text;

public class Utils extends BasePage {

    public static void clickOnElement(By by){driver.findElement(by).click();}
    public static void typeText(By by, String text){driver.findElement(by).sendKeys(text);}
    public static String getTextFromElement(By by){return driver.findElement(by).getText();}
    public static long timestamp(By by) {Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();}

    public static void selectOptionText (By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);}

    public static void selectOptionByValue (By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);}

    public static void selectOptionByIndex (By by,int index){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);}

//    public static void selectOptionText(By by, String text){
//        Select select = new Select{driver.findElement(by);
//        Select.selectByVisibleText(text);}
////       public static void selectElementByText(By by, String text){
//            Select select = new Select(driver.findElement(By.xpath() .xpath("")));
//            select.getText(text);
//////        }
//        public static void selectElementByValue (By by, String value){
//            Select select = new Select(driver.findElement(by.));
//            select.selectByVisibleValue(value);
//        }
//        public static void selectElementByIndex (By by,int index){
//            Select select = new Select(driver.findElement(by));
//            select.selectByVisibleValue(index);
//        }
    // selectOptionText(By.xpath("Us doller"));
    }