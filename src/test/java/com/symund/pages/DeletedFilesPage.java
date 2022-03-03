package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class DeletedFilesPage extends BasePage {

    @FindBy(partialLinkText = "Deleted files")
    public WebElement DeletedFilesElm;

    @FindBy(css = "//span[@class='sort-indicator icon-triangle-n']")
    public WebElement newToOld;

    @FindBy(css = "//span[@class='modified live-relative-timestamp']")
    public List<WebElement> timeStamps;

    public List<String> isTimeStampsOldToNew() {
        List<String> timeStampList = new ArrayList<>();

        for (int i = 3; i < 6; i++) {
            timeStampList.add(timeStamps.get(i).getAttribute("data_timestamp"));
        }

     return timeStampList;

    }


}

