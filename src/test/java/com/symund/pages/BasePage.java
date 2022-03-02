package com.symund.pages;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = ".logo.logo-icon")
    public WebElement symundLogo;

    @FindBy(css = ".avatardiv.avatardiv-shown")
    public WebElement avatar;

    @FindBy(css = "li[data-id='logout']>a")
    public WebElement logoutBtn;

    @FindBy(css = ".unified-search>a>span>svg")
    public WebElement searchBtn;

    @FindBy(xpath = "//*[@id='header']/div[2]/div[2]/div[1]/img")
    public WebElement notifications;

    @FindBy(css = ".icon-contacts.menutoggle")
    public WebElement contacts;


    //---------------After the framework------------------

    @FindBy (xpath = "//h2[contains(text(),'HK-Test')]")
    public WebElement fileInfo;
    @FindBy(css = ".button.new")
    public WebElement uploadbtn;
    @FindBy (xpath = "//label[@for='file_upload_start']")
    public WebElement uploadfile;
    @FindBy(css = "input.unified-search__form-input")
    public WebElement searchFile;
    @FindBy(xpath = "//ul[@*='Files']//a//h3")
    public WebElement FileSearchResult;
    @FindBy(id = "unified-search")
    public WebElement magnifyIcon;


    //---------------------------------------------------




    public void navigateTo(String module) {
        if (module.equals("talk")) {
            module = "spreed";
        }
        BrowserUtils.waitForPageToLoad(5);
        WebElement moduleLocator = Driver.get().findElement(By.xpath("//li[@data-id ='" + module + "']"));
        try {
            BrowserUtils.waitForClickablility(moduleLocator, 5);
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath("//li[@data-id ='" + module + "']"), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath("//li[@data-id ='" + module + "']"), 5);
            BrowserUtils.waitForVisibility(By.xpath("//li[@data-id ='" + module + "']"), 5);
            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath("//li[@data-id ='" + module + "']")));
            Driver.get().findElement(By.xpath("//li[@data-id ='" + module + "']")).click();
        } catch (Exception e) {
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath("//li[@data-id ='" + module + "']")), 5);

        }
    }
}
