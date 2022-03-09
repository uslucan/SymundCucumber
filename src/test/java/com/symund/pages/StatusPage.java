package com.symund.pages;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class StatusPage extends BasePage {

    @FindBy(css = "div>li>.user-status-menu-item")
    public WebElement statusWindow;

    @FindBy(xpath = "//*[@id='expanddiv']/ul/li[1]/div/a")
    public WebElement statusOnAvatar;

    @FindBy(css = ".status-buttons__select")
    public WebElement clearStatus;

    @FindBy(css = ".status-buttons__primary.primary")
    public WebElement setStatusMsgBtn;
    /*   @FindBy ( xpath = "//*[@id='user-status-online-status-away']")
       public WebElement awayStatus;

       @FindBy (xpath = "//*[@id='user-status-online-status-online']")
       public WebElement onlineStatus;

       @FindBy(xpath = "//*[@id='user-status-online-status-dnd']")
       public WebElement doNoDisturb;

       @FindBy(xpath = "//*[@id='user-status-online-status-invisible']")
       public WebElement invisible;*/


    public boolean findSelected() {
        String selectedStatus = statusWindow.getText().toLowerCase();
        if (selectedStatus.equals("do not disturb")) {
            selectedStatus = "dnd";
        }
        BrowserUtils.waitFor(2);
        boolean isSelected = Driver.get().findElement(By.xpath("//*[@id='user-status-online-status-" + selectedStatus + "']")).isSelected();
        return isSelected;
    }

    public void selectStatus(String status) {
        status = status.toLowerCase();
        Driver.get().findElement(By.cssSelector(".user-status-online-select__label.icon-user-status-" + status)).click();
    }

    public boolean isSelected(String status) {
        status = status.toLowerCase();
        return Driver.get().findElement(By.xpath("//*[@id='user-status-online-status-" + status + "']")).isSelected();
    }

    public void chooseStatusMsg() {
        Random rn = new Random();
        int num = rn.nextInt(5) + 1;
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.xpath("//*[@class='predefined-status'][" + num + "]")).click();

    }

    public void chooseRandomEmoji(){
        Random rn = new Random();
        int num = rn.nextInt(14) + 2;
        Driver.get().findElement(By.xpath("(//span[@class='emoji-mart-emoji'])["+num+"]")).click();
    }


}
