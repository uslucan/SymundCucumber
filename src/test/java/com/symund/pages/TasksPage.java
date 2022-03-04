package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksPage extends BasePage{

    @FindBy(xpath = "//*[@id=appmenu]/li[12]/a")
    public WebElement tasksElement;

    @FindBy(linkText = "Add List…")
    public WebElement addListElementLink;

   @FindBy(id = "newListInput")
    public WebElement newlistInputBox;

   @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[7]/ul/div/form/input[3]")
    public WebElement checkMark;


}
