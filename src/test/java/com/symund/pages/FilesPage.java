package com.symund.pages;

import com.github.javafaker.Faker;
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

    @FindBy(xpath = "//span[contains(.,'Deleted')]")
    public WebElement sortedByDeleted;

    @FindBy(css = "span[class='dirinfo']")
    public WebElement countOfFolders;

    @FindBy(css = "span[class='fileinfo']")
    public WebElement countOfFiles;

    //tr[@data-file='SampleFile.txt']//span[@class='extension']
// Modified

    public String getFileName(String fileName) {  //  Sprint4_SampleFile.txt
        return Driver.get()
                .findElement(By.xpath("//tr[@data-file='"+fileName+"']"))
                .getAttribute("data-file");
    }

    public void creatNewFolder(){
        BrowserUtils.waitForPageToLoad(10);
        plusIcon.click();
        newFolder.click();
    }

    public String getFolderName(String folder) {
        return Driver.get()
                .findElement(By.xpath("//span[contains(text(),'"+folder+"')]"))
                .getText();
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

    public String createFakeFolderName(){
        Faker faker= new Faker();
        return faker.animal().name();
    }

    public void deleteFolderToReuse(String folder){
        clickThreeDot(folder);
        BrowserUtils.waitFor(2);
        actions("Delete folder");
    }





}
