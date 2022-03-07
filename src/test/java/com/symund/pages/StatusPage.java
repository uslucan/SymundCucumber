package com.symund.pages;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StatusPage extends BasePage {

    @FindBy(css = "div>li>.user-status-menu-item")
    public WebElement statusWindow;

    @FindBy(xpath = "//*[@id='expanddiv']/ul/li[1]/div/a")
    public WebElement statusOnAvatar;

    @FindBy(css = ".status-buttons__select")
    public WebElement clearStatus;

    /*   @FindBy ( xpath = "//*[@id='user-status-online-status-away']")
       public WebElement awayStatus;

       @FindBy (xpath = "//*[@id='user-status-online-status-online']")
       public WebElement onlineStatus;

       @FindBy(xpath = "//*[@id='user-status-online-status-dnd']")
       public WebElement doNoDisturb;

       @FindBy(xpath = "//*[@id='user-status-online-status-invisible']")
       public WebElement invisible;*/
    public String selectedStatus = statusWindow.getText().toLowerCase();

    public boolean findSelected() {
        if (selectedStatus.equals("do not disturb")) {
            selectedStatus = "dnd";
        }
        boolean isSelected = Driver.get().findElement(By.xpath("//*[@id='user-status-online-status-" + selectedStatus + "']")).isSelected();
        return isSelected;
    }


}
