package com.symund.pages;

import com.symund.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesPage_Melek extends BasePage{
    @FindBy(xpath = "//a[@class='button new']")
    public WebElement plusIcon;

    @FindBy(xpath = "//input[@type='file']")
    public  WebElement uploadFile;

    @FindBy(id = "fileList")
    public List<WebElement> listOfFiles;


    public String getFileName(String expectedFileName){
        List<String> textOfFiles= BrowserUtils.getElementsText(listOfFiles);
        for (String eachText : textOfFiles) {
            String[] text= eachText.split("\\.");
                for(int i=0; i<text.length;i++){
                    if(text[i].equals(expectedFileName)){
                        return text[i];
                    }
                }
            }
        return null;
    }



}
