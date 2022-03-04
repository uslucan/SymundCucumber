package com.symund.pages;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchAndPhotoPage extends BasePage {


    @FindBy(css = "div.full-name")
    public WebElement contactResult;

    @FindBy(id = "contactsmenu-search")
    public WebElement searchContact;

    @FindBy(xpath = "//*[@id=\"viewer\"]/div[1]/div[1]']")
    public WebElement uploadimage;

    public String getPageTitle() {
        return Driver.get().getTitle();
    }

}


