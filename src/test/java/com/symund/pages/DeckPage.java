package com.symund.pages;

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

    @FindBy(xpath = "//div[@id='stack-add']//input[@class='icon-confirm has-tooltip']")
    public WebElement addListArrowButton;

    @FindBy(css = "h3[class='stack__title has-tooltip']")
    public List<WebElement> listOfLists;

    @FindBy(css = "div.board-title>h2")
    public WebElement boardTitle;


    public void enterName(String name, String inputBoxName){
        String inputBoxLocator = "//input[@placeholder='"+inputBoxName+"']";
        Driver.get().findElement(By.xpath(inputBoxLocator)).sendKeys(name);
    }

    public void navigateToBoard(String boardName){
        String locator = "//span[contains(.,'"+boardName+"')]";
        Driver.get().findElement(By.xpath(locator)).click();
    }



}
