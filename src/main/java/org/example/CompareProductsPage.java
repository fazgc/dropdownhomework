package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CompareProductsPage extends Utils{

    static String expectedCompareProducts = ("\"compare-products-table\"");
    private By _actualResult = By.xpath("//tr[@class=\"product-name\"]");
    private By _clearListButton = By.xpath("//a[@class='clear-list']");
    public void compareTheProductsAndClose (){
        clickOnElement(_clearListButton);
        // to check product comparison happening
        String actualMessage = getTextFromElement(_actualResult);
        System.out.println(actualMessage + "product in the compare list");
        Assert.assertEquals(expectedCompareProducts,
                actualMessage= "compare cart should be empty");
    };

}
