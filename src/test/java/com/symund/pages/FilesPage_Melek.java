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
