package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CartResultPage extends Utils {

    private By _confirmProduct = By.id("\"shopping-cart-form\"");
    //expected product in cart should have this product name
    static String expectedItemInCart = "Leica T Mirrorless Digital Camera";


    public void shoppingCartResult(){
        //to check right product is added to shopping cart
        String actualResult = getTextFromElement(_confirmProduct);
        System.out.println(actualResult+ "product in basket : ");
        //comparing both results after adding to cart product is same or not
        Assert.assertEquals(expectedItemInCart,actualResult="before adding to shopping cart and after adding to cart,both product is same");
    }
}
