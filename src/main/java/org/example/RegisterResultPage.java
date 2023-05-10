package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.Utils.getTextFromElement;

public class RegisterResultPage extends Utils {

    static String expectedRegisterCompleteMessage = "Registration completed";
    private By _getTextEelement = By.className("result");
    private By _continueButton = By.className("\"button-1 register-continue-button\"");


    public void verifyUserRegisteredSuccessfully(){
        //getting text from element (result page)
        String actualMassage = getTextFromElement(_getTextEelement);
        System.out.println("my actual result is:" + actualMassage);
        Assert.assertEquals(actualMassage, expectedRegisterCompleteMessage, "registration failed");
    }
    public void continueButtonAfterRegistration(){
        clickOnElement(_continueButton);
    }
}
