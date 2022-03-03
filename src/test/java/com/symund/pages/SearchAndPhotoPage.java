package com.symund.pages;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchAndPhotoPage extends BasePage {

    public WebElement loaderMask;

    @FindBy(css = "div.full-name")
    public WebElement contactResult;

    @FindBy(css = ".icon-contacts.menutoggle")
    public WebElement contactsMenu;

    @FindBy(id = "contactsmenu-search")
    public WebElement searchContact;

    @FindBy(xpath = "//*[@id=\"viewer\"]/div[1]/div[1]']")
    public WebElement uploadimage;

    public String getPageTitle() {
        return Driver.get().getTitle();
    }

    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        public void navigateToPage (String pageName){
            String pageLocator = "#appmenu>li[data-id='" + pageName.toLowerCase() + "']";

            try {
                BrowserUtils.waitForClickablility(By.cssSelector(pageLocator), 5);
                WebElement pageElement = Driver.get().findElement(By.cssSelector(pageLocator));
                new Actions(Driver.get()).moveToElement(pageElement).click().perform();
                waitUntilLoaderScreenDisappear();
                //new Actions(Driver.get()).moveToElement(pageElement).pause(200).doubleClick(pageElement).build().perform();
            } catch (Exception e) {
                BrowserUtils.clickWithWait(By.cssSelector(pageLocator), 5);
            }
        }
    }



