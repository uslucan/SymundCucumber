package com.symund.pages;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DeckPage extends BasePage{

    @FindBy(css = "a.app-navigation-toggle")
    public WebElement navigationToggle;

    @FindBy(css = "span[title='Add board']")
    public WebElement addBoardLink;

    @FindBy(css = "ul.app-navigation-entry__children>li>a[class='app-navigation-entry-link']")
    public List<WebElement> boardNames;

    @FindBy(xpath = "//input[@type='submit'][@class='icon-confirm']")
    public WebElement boardArrowButton;

    @FindBy(css = "div#stack-add>button")
    public WebElement addListButton;

    @FindBy(xpath = "//div[@id='stack-add']//input[@type='submit']")
    public WebElement addListArrowButton;

    @FindBy(css = "h3[class='stack__title has-tooltip']")
    public List<WebElement> listOfLists;

    @FindBy(css = "div.board-title>h2")
    public WebElement boardTitle;

    @FindBy(xpath = "//div[@class='stack__card-add']//input[@class='icon-confirm']")
    public WebElement addCardArrowButton;

    @FindBy(css = "div.card-upper>h3")
    public List<WebElement> listOfCards;

    @FindBy(xpath = "//button[contains(.,'Move card')]")
    public WebElement moveCardButton;


    public void enterName(String name, String inputBoxName){
        String inputBoxLocator = "//input[@placeholder='"+inputBoxName+"']";
        Driver.get().findElement(By.xpath(inputBoxLocator)).sendKeys(name);
    }

    public void navigateToBoard(String boardName){
        String locator = "//span[contains(.,'"+boardName+"')]";
        Driver.get().findElement(By.xpath(locator)).click();
    }

    public WebElement getAddCardButton(String listName){
        String locator  = "//h3[contains(.,'"+listName+"')]/following-sibling::button";
        return Driver.get().findElement(By.xpath(locator));
    }

    public WebElement getThreeDotsButton(String cardName){
        String locator = "//h3[.='"+cardName+"']/../following-sibling::*//button";
        return Driver.get().findElement(By.xpath(locator));
    }

    public WebElement getCardOptionsUnderThreeDots(String option){
        String locator = "//span[.='"+option+"']";
        return Driver.get().findElement(By.xpath(locator));
    }

    public WebElement getAvatarIcon(String cardName){
        String locator = "//h3[.='"+cardName+"']/../following-sibling::*//div[@class='avatardiv popovermenu-wrapper has-tooltip']";
        return Driver.get().findElement(By.xpath(locator));
    }

    public void moveCardOptions(String inputBox, String name){
        String inputLocator = "//input[@placeholder='"+inputBox+"']";
        Driver.get().findElement(By.xpath(inputLocator)).click();
        String nameLocator = "//div[@title='"+name+"']";
        BrowserUtils.waitForClickablility(By.xpath(nameLocator),3);
        Driver.get().findElement(By.xpath(nameLocator)).click();

    }

    public List<WebElement> getListOfCards(String listName){
        String locator = "//h3[contains(.,'"+listName+"')]/../following-sibling::*//div[@class='card-upper']/h3";
        return Driver.get().findElements(By.xpath(locator));
    }


}
