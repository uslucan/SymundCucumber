package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class DeletedFilesPage extends BasePage {

    @FindBy(partialLinkText = "Deleted files")
    public WebElement DeletedFilesElm;

    @FindBy(css = "//span[@class='sort-indicator icon-triangle-n']")
    public WebElement newToOld;

    @FindBy(xpath = "(//tbody[@id='fileList'])[12]//td[@class='date']/span")
    public List<WebElement> timeStamps;

    @FindBy(xpath="(//span[@class='sort-indicator icon-triangle-s'])[2]")
    public WebElement triangleOldToNew;

    @FindBy(xpath ="//span[@class='sort-indicator icon-triangle-n']")
    public WebElement triangleNewtoOld;

    @FindBy(xpath = "(//*[text()='Name'])[12]")
    public WebElement nameElement;

    @FindBy(xpath = "//*[text()='All files']")
    public WebElement allFilesElement;

    public WebElement threeDot(String Path){
        return Driver.get().findElement(By.xpath("//tr[@data-path='"+Path+"']//span[@class='icon icon-more']"));
    }

    public WebElement deleteIcon(String Path){
        return Driver.get().findElement(By.xpath("//tr[@data-path='"+Path+"']//span[@class='icon icon-delete']"));

    }

    public WebElement restoreIcon(String Path){
        return Driver.get().findElement(By.xpath("//tr[@data-path='"+Path+"']//a[@class='action action-restore permanent']"));

    }

    public WebElement restoredFile(String Path){
        return Driver.get().findElement(By.xpath("//tr[@data-file='"+Path+"']"));

    }

}

