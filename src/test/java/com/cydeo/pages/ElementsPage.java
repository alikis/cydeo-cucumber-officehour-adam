package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;

public class ElementsPage {

    /*
    if you use @FindBy annotation in order to add one element we have yo use constructor
     */

    public void clickOption(String option) {
        String locator = "//li[.='" + option + "']";
        BrowserUtils.waitFor(1);
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }
}
