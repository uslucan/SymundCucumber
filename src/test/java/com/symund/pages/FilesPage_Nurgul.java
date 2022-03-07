package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage_Nurgul extends BasePage {

        @FindBy(partialLinkText = "Favorites")
        public WebElement favoritesFeature;


        public WebElement featureName(String folderName) {
              return  Driver.get().findElement(By.xpath("//tr[@data-file='" + folderName + "']"));
        }

        public void clickThreeDot(String folderName) {
                Driver.get().findElement(By.xpath("//tr[@data-file='" + folderName + "']//span[@class='icon icon-more']")).click();
        }

        public void actions(String actionName) {
                switch (actionName){
                        case"Add to favorites":
                        Driver.get().findElement(By.xpath("//*[text()='"+actionName+"']")).click();
                        break;
                }

        }

        public String getFileName(String expectedFileName) {
                return Driver.get()
                        .findElement(By.xpath("//tr[@data-file='"+expectedFileName+"']"))
                        .getAttribute("data-file");
                System.out.println();
        }

}
