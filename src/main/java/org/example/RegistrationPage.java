package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {

    private By _firstName = (By.xpath("//input[@id=\"FirstName\"]"));
    private By _lastName =( By.xpath("//input[@id=\"LastName\"]"));
    private By _email = By.xpath("//input[@name=\"Email\"]");
    private By _password =By.xpath("//button[contains(@fdprocessedid,\"7m36z5\")]");
    private By _confirmPassword = (By.xpath("//button[contains(@fdprocessedid,\"3890gh\")]"));
    private By _registerButton = By.xpath("//div[contains(@class,\"buttons\")]");

//    By _dayOfBirth = By.name("DateOfBirthDay");
//    By _monthOfBirthday = By.name("")

   public void registerDetails(By by){
  //  public void typeText() {
        typeText(_firstName ,"tim");
        //enter last name
        typeText(_lastName, "bean");
//        selectElementByValue(_dayOfBirth, "26");
//        selectElementByIndex(_monthOfBirthday, 6););
//        selectElementByText(_yearOfBirthday, "1990");
        //enter email
        typeText(_email, "xyz+" + timestamp(by) + "@gmail.com");
        //enter password
        typeText(_password, "text1234");
        //confirm password
        typeText(_confirmPassword, "text12345");
        //click on register submit button
        clickOnElement(_registerButton);
    }
}

//    public void selectElementByIndex() {
//    }
//
//    private void selectElementByValue() {
//    }
//
//    private void selectElementByText(By by)(By.("april"));
//    }
//    public static selectElementByValue(By by){
//
//    }
//}
