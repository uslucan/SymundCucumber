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

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement confirmArrow;

    @FindBy(css = "button[class='primary']")
    public WebElement moveToButton; // files are under Choose target folder

    @FindBy(linkText = "Deleted files")
    public WebElement deletedFiles;




    public String getFileName(String fileName) {  //  Sprint4_SampleFile.txt
        return Driver.get()
                .findElement(By.xpath("//tr[@data-file='"+fileName+"']"))
                .getAttribute("data-file");
    }

    public void clickThreeDot(String folderName){
        Driver.get().findElement(By.xpath("//tr[@data-file='"+folderName+"']//span[@class='icon icon-more']")).click();
    }

    public void actions(String actionName) {
        switch (actionName){
            case"Add to favorites":
                Driver.get().findElement(By.xpath("//*[@data-action='Favorite']")).click();
                break;
            case"Move or copy":
                Driver.get().findElement(By.xpath("//*[@data-action='MoveCopy']")).click();
                break;
            case"Delete folder":
                Driver.get().findElement(By.xpath("//*[@data-action='Delete']")).click();
                break;
        }
    }


    public void clickTargetFolder(String folderName){  //*[@data-entryname='MSTargetFolder']
        Driver.get().findElement(By.xpath("//*[@data-entryname='"+folderName+"']")).click();
    }

    public void folderInFileList(String folderName){
        Driver.get().findElement(By.xpath("//tr[@data-file='"+folderName+"']")).click();
    }





}
