package com.symund.pages;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesPage extends BasePage{
    @FindBy(xpath = "//a[@class='button new']")
    public WebElement plusIcon;

    @FindBy(partialLinkText = "New folder")
    public  WebElement newFolder;

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

    @FindBy(xpath = "//input[@type='file']")
    public  WebElement uploadFile;

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> listOfFiles;

    @FindBy(xpath = "//form[@class='filenameform']/input[@type='text']")
    public  WebElement newFolderInputBox;

    @FindBy(xpath = "//input[@class='icon-confirm']") //form[@class='filenameform']/input[@type='submit']
    public WebElement confirmArrow;


    public String getFileName(String expectedFileName) {  //  Sprint4_SampleFile.txt
        return Driver.get()
                .findElement(By.xpath("//tr[@data-file='"+expectedFileName+"']"))
                .getAttribute("data-file");
    }



}
