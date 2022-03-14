package com.symund.pages;

import com.symund.utilities.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksPage extends BasePage {

    @FindBy(id = "collection_current")
    public WebElement tabName;

    @FindBy(linkText = "Add List…")
    public WebElement addListElementLink;

    @FindBy(id = "newListInput")
    public WebElement newlistInputBox;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[7]/ul/div/form/input[3]")
    public WebElement checkMark;

    @FindBy(xpath = "//input[@id='target']")
    public WebElement addTaskElm;

    @FindBy(xpath = "//input[@id='target']")
    public WebElement newTaskElement;

    @FindBy(linkText = "Book Lists")
    public WebElement bookListElem;

    @FindBy(xpath = "//span[@class='heading__title icon-triangle-s']")
    public WebElement completedTask;

    @FindBy(xpath = "//label[@class='reactive no-nav']")
    public WebElement checkBox;

    @FindBy(xpath = "//span[@class='icon icon-sprt-bw sprt-task-star']")
    public WebElement starIcon;

    @FindBy(xpath = "//span[contains(text(),'Important')]")
    public WebElement importantTaskElem;

    @FindBy(xpath = "//span[contains(text(),'Current')]")
    public WebElement currentTabElem;

    @FindBy(xpath = "//body/div[@id='content-vue']/div[@id='app-navigation-vue']/ul[1]/li[5]/div[1]/div[1]")
    public WebElement unCompletedTask;


//    @FindBy(xpath = "//span[contains(text(),'Tester')]")
//    public WebElement taskTitle;

//   @FindBy(xpath = "//div[3]/main//label")
//    public WebElement taskItem;
    //*[@id="app-content-vue"]//h2/span

    public void addNewList(String newListTask) {
        newListTask = "Book Lists";
        Driver.get().findElement(By.id("newListInput")).sendKeys(newListTask);

    }

}