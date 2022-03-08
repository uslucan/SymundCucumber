package com.symund.pages;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesPage_Melek extends BasePage{
    @FindBy(xpath = "//a[@class='button new']")
    public WebElement plusIcon;

    @FindBy(xpath = "//span[@class='displayname']")
    public  WebElement uploadLink;

    @FindBy(partialLinkText = "Name")
    public WebElement NameBtn;

    @FindBy(css = ".innernametext")
    public List<WebElement> nameList;

    @FindBy(partialLinkText = "Size")
    public WebElement sizeBtn;

    @FindBy(css = ".filesize")
    public List<WebElement> sizeList;

    @FindBy(partialLinkText = "Modified")
    public WebElement modifiedBtn;

    @FindBy(css = ".modified.live-relative-timestamp")
    public List<WebElement> modifiedList;

    @FindBy(xpath = "//*[@id='view-toggle']")
    public WebElement toggleBtn;

    @FindBy(partialLinkText = "Select all")
    public WebElement selectAllBtn;

    @FindBy (xpath = "(//*[@id=\"headerSelection\"]/label)[1]")
    public WebElement selectAllButton;

    @FindBy(xpath = "//td//input[@type='checkbox']")
    public List<WebElement> checkboxes;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/thead/tr/th[3]/a/span[1]")
    public WebElement totalValue;

    @FindBy(xpath = "//input[@type='file']")
    public  WebElement uploadFile;

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> listOfFiles;


    public String getFileName(String expectedFileName) {  //  Sprint4_SampleFile.txt
        return Driver.get()
                .findElement(By.xpath("//tr[@data-file='"+expectedFileName+"']"))
                .getAttribute("data-file");
    }



}
