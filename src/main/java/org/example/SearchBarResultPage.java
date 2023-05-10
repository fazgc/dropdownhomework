package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SearchBarResultPage extends Utils {

    static String expectedSearchProduct = "apple";

    public void searchBarResult() {
        //verify given name product appeared in search result
        List<WebElement> productList = driver.findElements(By.xpath("//a[starts-with(@href,\"/apple-macbook-pro-13-inch\")]"));
        for (WebElement f : productList)
            System.out.println(f.getText());
            String actualSearchProduct = getTextFromElement(By.xpath("apple"));
            Assert.assertEquals(actualSearchProduct, expectedSearchProduct);
        }

    }

