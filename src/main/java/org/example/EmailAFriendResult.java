package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendResult extends Utils{

    static String expectedEmailAFriendMsg = "Only registered customers can use email a friend feature";
    static String expectedEmailMassageOnWebPage = " message has been sent.";
    private By _getTextEmail = By.name("Only registered customers can use email a friend feature");
    private By _actualMassageOnEmailAFriend = By.className("result");

    public void expectedEmailAFriendWithoutRegistration(){
        //GetText from web element
        String actualMessage = getTextFromElement(_getTextEmail);
        //show error
        System.out.println("My massage:" + actualMessage);
        String expectedmessage = null;
        Assert.assertEquals(actualMessage,expectedEmailAFriendMsg, "you have sent successfully");}

    public void expectedEmailFriendWithRegistration(){
        String actualMassageOnEmailAFriendPage = getTextFromElement(_actualMassageOnEmailAFriend);
        System.out.println("Actual Massage for sending Email a friend:" + actualMassageOnEmailAFriendPage);
        //checking actual massage from web page and expected condition is matching
        Assert.assertEquals(actualMassageOnEmailAFriendPage, expectedEmailMassageOnWebPage, "Email A friend Is Unsuccessful");
    }

    }


