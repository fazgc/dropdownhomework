package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendPage extends Utils {
    private By _friendsEmail = By.name("Enter friend's email."); // locators needs to be changed
    private By _urEmail = By.name("Enter your email address.");
    private By _personalMsg = By.name("Enter personal message (optional).");
    private By _sendButton = By.id("send-email");
    private By _errorResult = By.xpath("//div[contains(@class,'message-error validation')]/ul");

    public void emailAFriends(By by) {
        typeText(_friendsEmail, "xyz" + timestamp(by) + "@gmail.com");
        typeText(_urEmail, "abc" + timestamp(by) + "@gmail.com");
        typeText(_personalMsg, "hello frd");
        clickOnElement(_sendButton);
        String actualmessageAppearOnPage = getTextFromElement(By.className("Only registered customers can use email a friend feature"));
        System.out.println();
        Assert.assertEquals(actualmessageAppearOnPage,_errorResult);

    }
}
