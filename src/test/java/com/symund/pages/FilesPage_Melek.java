package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage_Melek extends BasePage{
    @FindBy(xpath = "//a[@class='button new']")
    public WebElement plusIcon;

    @FindBy(xpath = "//label[@data-action='upload']")    //span[@class='displayname']
    public  WebElement uploadLink;
}
