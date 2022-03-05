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

    @FindBy(xpath = "//img[@alt='sprint4.jpg']")
    public WebElement uploadimage;

    @FindBy(css = ".button.new")
    public WebElement plusIcon;

    @FindBy(xpath = "//input[@type='file']")
    public  WebElement uploadFile;

    public String getPageTitle() {
        return Driver.get().getTitle();
    }

}


