package com.symund.pages;

import com.symund.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{

    @FindBy(xpath = "//label[@*='displayname']")
    public WebElement fullName;

    @FindBy(xpath = "//label[@*='email']")
    public WebElement email;
    
    @FindBy(xpath = "//label[@*='phone']")
    public WebElement phoneNum;

    @FindBy(xpath = "//span[@class='icon icon-phone']")
    public WebElement privatePhone;

    @FindBy(xpath = "//span[@class='icon icon-password']")
    public WebElement localPhone;

    @FindBy(xpath = "//span[@class='icon icon-contacts-dark']")
    public WebElement federatedPhone;

    @FindBy(xpath = "//span[@class='icon icon-link']")
    public WebElement publishedPhone;

//    @FindBy(xpath = "//span[@class='menuitem-text-detail'][1]")
//    public WebElement privatePhone;

    @FindBy(xpath = "//div[@style='display: none;']")
    public WebElement checkPrivate;

    @FindBy(xpath = "//span[@id='localeexample-time']")
    public WebElement localTime;

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement avatarIcon;

    @FindBy(xpath = "//input[@id='oc-dialog-0-content-input']")
    public WebElement authentication;

    public void navigateToSettings(){
        BrowserUtils.waitForClickablility(By.xpath("//li[@*='settings']"),10).click();
    }

}
