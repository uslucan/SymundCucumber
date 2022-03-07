package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{

    @FindBy(xpath = "//label[@*='displayname']")
    public WebElement fullName;

    @FindBy(xpath = "//label[@*='email']")
    public WebElement email;
    
    @FindBy(xpath = "//label[@*='phone']")
    public WebElement phoneNum;

    @FindBy(xpath = "//span[@class='icon-federation-menu icon-link']")
    public WebElement phoneNumPrivacy;

    @FindBy(xpath = "//span[@class='menuitem-text-detail'][1]")
    public WebElement privatePhone;

    @FindBy(xpath = "//div[@style='display: none;']")
    public WebElement checkPrivate;

    @FindBy(xpath = "//span[@id='localeexample-time']")
    public WebElement localTime;

}
