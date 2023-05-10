package org.example;

import org.openqa.selenium.By;

public class ElectronicsCategoryPage extends Utils{
    private By _clickOnCameras = By.linkText("https://demo.nopcommerce.com/images/thumbs/0000006_camera-photo_450.jpeg");
    private By _clickOnLeica =By.xpath("//*[text()='Leica T Mirrorless Digital Camera']");

    public void clickOnElectronicCategory(){
        //click on cameras & photo
        clickOnElement(_clickOnCameras);
        //click on leica t digital camera
        clickOnElement(_clickOnLeica);
        //
    }
}
