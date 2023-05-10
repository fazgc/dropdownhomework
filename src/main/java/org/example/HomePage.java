package org.example;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
//import java.util.List;

//create methods here of ue test cases/ user defined methods
public class HomePage extends Utils {

    // storing register button as global variable, so you can change whenever it has been updated or changed
     private By _registerButton = By.className("ico-register");
     private By _clickOnProduct = By.xpath("//a[@title='Show details for Apple MacBook Pro 13-inch']");
     private By _clickOnCompareButton1 =By.xpath("//button[contains(@fdprocessedid,'7m36z5')]");
     private By _clickOnButton2 = By.xpath("//button[contains(@fdprocessedid,'3890gh')]");
     private By _clickOnComparePopUp = By.xpath("//*[text()='product comparison']");
     private By _clickOnGoodButton = By.xpath("//input[@id='pollanswers-2']");
     private By _clickOnVote = By.xpath("//button[@id='vote-poll-1']");
     private By _actualVoteMsg = By.className("poll-vote-error");
     private By _clickElectronics =By.xpath(" //*[text()=' Electronics ']");
     private By _clickOnDollar = By.xpath("//select[@id=\"customerCurrency\"]");
     private By _clickOnEuro = By.name("\"customerCurrency\"");
     private By _typeProductNm = By.xpath("//input[@type=\"text\"]");
     private By _searchButton = By.cssSelector("button[type=\"submit\"]");

    // By _searchButton = By .className("button-1 search-box-button");

     //expected message on community poll for guest customer
     static String expectedMessageForCommunityPoll = "Only registered users can vote.";
     static String expectedCurrencyResultForDollars = "product price should show $ sign ";
     static String expectedCurrencyResultForEuro = "product price should show € sign";


    public void clickOnRegisterButton(){
        //click on register button
        clickOnElement(_registerButton);}
    public void clickOnAppleMac(){
        clickOnElement(_clickOnProduct);}

    public void compareProducts(){
        // click on product named HTC M8 compare product button
        clickOnElement(_clickOnCompareButton1);
        // click on compare button of product $25 gift card
        clickOnElement(_clickOnButton2);
        // click on green colour product compare pop up bar button
        clickOnElement(_clickOnComparePopUp);}

    public void communityVote(){
        //click on good button to give vote on community poll
        clickOnElement(_clickOnGoodButton);
        //click on vote button
        clickOnElement(_clickOnVote);
        //putting wit here for message received after clicking on vote button
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        String actualVoteMassage = wait.until(ExpectedConditions.visibilityOfElementLocated(_actualVoteMsg)).getText();
        System.out.println("Actual vote Massage::" + actualVoteMassage);
        Assert.assertEquals(actualVoteMassage, expectedMessageForCommunityPoll, "Unsuccessful to vote");}

    public void clickOnElectronics(){
        //click on electronics category
        clickOnElement(_clickElectronics);}

    public void clickOnDropDown(){
        //click on US dollar currency option
        selectOptionText(_clickOnDollar,"US Dollar");
        //verifying dollar sign coming in front of pricing of products
        String actualDollarResult = getTextFromElement(By.name("US Dollar"));
        Assert.assertEquals(actualDollarResult,expectedCurrencyResultForDollars,"pricing will show $ sign");
        //select euro currency option
        selectOptionText(_clickOnEuro,"Euro");
        //verifying euro sign on products
        String actualEuroResult = getTextFromElement(By.name("Euro"));
        Assert.assertEquals(actualEuroResult,expectedCurrencyResultForEuro,"pricing will show € sign ");}

    public void typeTheProductName(){
        //type the product name you want to search in the search bar
        typeText(_typeProductNm,"apple");
        //click on search button
        clickOnElement(_searchButton);}

    //click on product htc one m8 android comparison button
//        clickOnElement(By.xpath("//button[contains(@fdprocessedid,\"7m36z5\")]"));
//        //click on product £25 virtual gift card comparison button
//        clickOnElement(By.xpath("//button[contains(@fdprocessedid,\"3890gh\")]"));
//        // use implicity wait for pop up bar leading to product comparision page
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        //click on green pop up
//    // using list and css find out all product name on homepage(6-5-23 class task)
//    public void productList() {
//        List<WebElement> productList = driver.findElements(By.cssSelector("div.product-grid h2"));
//        for (WebElement f : productList) {
//            System.out.println(f.getText());
//        }
//        public void alertTask () {
//            clickOnElement(_searchButton);
//        }
//        String actualMassage = getTextFromElement(By.className("result"));
//        System.out.println("my actual result is:"+ actualMassage);
//        Assert.assertEquals(actualMassage,expectedEnterSearchKeywordMessage,"");
//
//    }
}
