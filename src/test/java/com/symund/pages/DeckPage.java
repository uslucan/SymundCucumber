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


    public void enterName(String name, String inputBoxName){
        String inputBoxLocator = "//input[@placeholder='"+inputBoxName+"']";
        Driver.get().findElement(By.xpath(inputBoxLocator)).sendKeys(name);
    }


}
