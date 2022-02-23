package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy (css = ".avatardiv.avatardiv-shown")
    public WebElement avatar;

    @FindBy(css = "li[data-id='logout']>a")
    public WebElement logoutBtn;
}
