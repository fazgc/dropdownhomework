package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    static String expectedRegisterCompleteMessage = "Registration completed";
    HomePage homePage = new HomePage(); //we want to use functionality of homepage that's why we're creating object of that class.
    RegistrationPage registrationPage = new RegistrationPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    AppleMacBookPage appleMacBookPage = new AppleMacBookPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    CompareProductsPage compareProductsPage = new CompareProductsPage();
    ElectronicsCategoryPage electronicsCategoryPage = new ElectronicsCategoryPage();
    AddToCartCamera addToCartCamera = new AddToCartCamera();
    CartResultPage cartResultPage = new CartResultPage();
    LogInPage logInPage = new LogInPage();
    SearchBarResultPage searchBarResultPage = new SearchBarResultPage();


    @Test                                                 //registration testcase
    public void verifyUserAbleToRegisteredSuccessfully(){
        //Write first step: click on register button.
         homePage.clickOnRegisterButton();
         //next step is to fill registration details.
         registrationPage.registerDetails();
        //next step is to verify user able to register.
         registerResultPage.verifyUserRegisteredSuccessfully();}


    @Test                                           //email a friend without register
    public void verifyUserAbleToEmailAFriend(){
        //click on a product named apple macbook pro
        homePage.clickOnAppleMac();
        //click on email a friend button on product
        appleMacBookPage.emailAFriend();
        //type in required details to email product to a friend
        emailAFriendPage.emailAFriends();}

    @Test                                            // compare products
    public void verifyUserAbleToCompareProducts(){
        //compare prices of products given
        homePage.compareProducts();
        // after comparing products clear the list
        compareProductsPage.compareTheProductsAndClose();}

    @Test                                            //community poll
    public void verifyUserAbleToUseCommunityPoll(){
        homePage.communityVote();}

    @Test                                                    //add to cart
    public void verifyUserCanAddProductInCartSuccessfully(){
        homePage.clickOnElectronics();
        electronicsCategoryPage.clickOnElectronicCategory();
        addToCartCamera.addToCartLeicaCamera();
        cartResultPage.shoppingCartResult();}

    @Test                                                               // email a friend with register
    public void verifyRegisteredUserAbleToReferAProductToFriendSuccessfully(){
        //click on register button on home page
        homePage.clickOnRegisterButton();
        //enter your details to register yourself
        registrationPage.registerDetails();
        //after registration click on continue button
        registerResultPage.continueButtonAfterRegistration();
        //click on log in
        logInPage.clickOnLogInButton();
        //click on apple macbook pro
        homePage.clickOnAppleMac();
        //click on email a friend option
        appleMacBookPage.emailAFriend();
        //enter your friends n yours details
        emailAFriendPage.emailAFriends();}

    @Test                                    // vote with register
    public void verifyRegisterUserAbleToVote(){
        //click on register button
        homePage.clickOnRegisterButton();
        //enter your details for registration
        registrationPage.registerDetails();
        //click on continue button
        registerResultPage.continueButtonAfterRegistration();
        //select on good button n click on vote button
        homePage.communityVote();}

    @Test          //drop down test homework   //currency
    public void verifyUserAbleToSelectCurrency(){
         //click on dropdown of currency selector on homepage
         homePage.clickOnDropDown();}

    @Test                                    //search for given product
    public void verifyUserAbleToSearchForProducts(){
        //type product name you want to search in search bar
        homePage.typeTheProductName();
        //verify given product name appeared in search page
        searchBarResultPage.searchBarResult();}



             //2,user able to search for given products successfully
        //3,new realease comment on homepage
        //4,guest user able to checkout successfully :build your own computer 2.2 giga ram 8gb hdd select 320gb os vista primium ,
        // select all software add to cart click,verify on cart asser that,checkout succesfully as guest,next day air for shipping,continue
        //credit card payment method,continue confirm n checkout,order has been successfully orders assert point
        //5,clciking on fb n confirm fb url assert that,clicking close button,email password login button present,come back to original page
        //verifyhomepage of nopcommerce
        //6,clcick on vote button withour selecting anything n verify alert.




    }







    //public void productList(){
         //homePage.productList(); // check with someone is this right or wrong for list product list of homepage all together


