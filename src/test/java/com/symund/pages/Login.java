package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;

public class Login {
    public Login() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "#user")
    public WebElement usernameInputBox;

    @FindBy(css = "#password")
    public WebElement passwordInputBox;

    @FindBy(css = "#submit-form")
    public WebElement loginBtn;

    @FindBy(css = ".warning.wrongPasswordMsg")
    public WebElement warningMsg;

    @FindBy(css = ".toggle-password")
    public WebElement eyeIcon;

    @FindBy(css = "#lost-password")
    public WebElement forgotPassword;

    @FindBy(css = "#reset-password-submit")
    public WebElement resetPassword;


    public String getMsg(WebElement box) {
        return box.getAttribute("validationMessage");
    }

}
