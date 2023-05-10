package org.example;

import org.openqa.selenium.By;

public class AppleMacBookPage extends Utils {

    private By _emailAFriend = By.xpath("//button[@class='button-2 email-a-friend-button']");

    public void emailAFriend(){
        //click on email a friend button on product named apple macbook pro.
        clickOnElement(_emailAFriend);
    }
}
