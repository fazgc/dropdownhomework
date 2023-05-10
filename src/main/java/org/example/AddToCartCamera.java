package org.example;

import org.openqa.selenium.By;

public class AddToCartCamera extends Utils{

    private By _addToCart = By.id("'add-to-cart-button-16'");
    private By _shoppingCart = By.xpath("//*[text()='shopping cart']");

    public void addToCartLeicaCamera(){
        //click on add to cart leica camera
        clickOnElement(_addToCart);}

    public void clickOnShoppingCart(){
        //clicking bon shopping cart
        clickOnElement(_shoppingCart);
    }
}
