package com.symund.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TalkPage extends BasePage{

    @FindBy(css = ".toggle.has-tooltip")
    public WebElement plusButton;

    @FindBy(css = ".conversation-name")
    public WebElement conversationName;

    @FindBy(css = ".navigation__button.navigation__button-right.primary")
    public WebElement addParticipant;

    @FindBy(css = ".set-contacts__input")
    public WebElement searchParticipant;

    @FindBy(css = ".participant-row__user-name")
    public WebElement employeeName;

    @FindBy(css = ".navigation__button.navigation__button-right.primary")
    public WebElement createConv;

    @FindBy(xpath = "//*[@class='acli__content__line-one__title']")
    public WebElement verifyGroupName;

    @FindBy(xpath = "(//ul[@class='conversations']/li/div/div/div/button)[1]")
    public WebElement threeDot;

    @FindBy(xpath = "//span[text()='Delete conversation']/..")
    public WebElement deleteConv;

    @FindBy(xpath = "//button[text()='Yes']")
    public WebElement yesButton;

    @FindBy(xpath = "(//span[@class='participant-row__user-name'])[2]")
    public WebElement participant2;

    @FindBy(xpath = "(//span[@class='participant-row__user-name'])[3]")
    public WebElement participant3;

    @FindBy(css = ".participant-row__user-name")
    public List<WebElement> partNames;

    @FindBy(xpath = "//*[@id=\"tab-participants\"]/div/div/div/ul/li[3]/div[3]")
    public WebElement remPartButton;

    @FindBy(css = ".action-button__icon.icon-delete")
    public WebElement remPart;

    @FindBy(css = ".acli__content__line-one__title")
    public List<WebElement> groupNames;

    @FindBy(css = ".new-message-form__advancedinput")
    public WebElement messageBox;

    @FindBy(css = ".rich-text--wrapper")
    public List<WebElement> messageSent;



}
