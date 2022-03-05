package com.symund.step_definitions;

import com.symund.pages.FilesPage_Melek;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.matcher.FilterableList;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import javax.swing.*;
import java.io.File;
import java.util.List;

public class Files_Emre_StepDefs {


    @Then("user click name button and user should see folder view changed")
    public void user_click_name_button_and_user_should_see_folder_view_changed() {
        List<String> beforeClick = BrowserUtils.getElementsText(new FilesPage_Melek().nameList);
        new FilesPage_Melek().NameBtn.click();
        List<String> afterClick = BrowserUtils.getElementsText(new FilesPage_Melek().nameList);
        Assert.assertNotEquals(beforeClick,afterClick);
    }

    @Then("user click size button and user should see folder view changed")
    public void user_click_size_button_and_user_should_see_folder_view_changed() {
        List<String> beforeClick = BrowserUtils.getElementsText(new FilesPage_Melek().sizeList);
        new FilesPage_Melek().sizeBtn.click();
        List<String> afterClick = BrowserUtils.getElementsText(new FilesPage_Melek().sizeList);
        Assert.assertNotEquals(beforeClick,afterClick);
    }
    @Then("user click modified button and user should see folder view changed")
    public void user_click_modified_button_and_user_should_see_folder_view_changed() {
        List<String> beforeClick = BrowserUtils.getElementsText(new FilesPage_Melek().modifiedList);
        new FilesPage_Melek().modifiedBtn.click();
        List<String> afterClick = BrowserUtils.getElementsText(new FilesPage_Melek().modifiedList);
        Assert.assertNotEquals(beforeClick,afterClick);
    }
    @Then("user click toggle-view button and user should see folder view changed")
    public void user_click_toggle_view_button_and_user_should_see_folder_view_changed() {

    String pictures = Driver.get().findElement(By.id("view-toggle")).getAttribute("className");
    new FilesPage_Melek().toggleBtn.click();
    String fileList = Driver.get().findElement(By.id("view-toggle")).getAttribute("className");
    Assert.assertNotEquals(pictures,fileList);
    }

    @When("user can select all files when clicked select all checkbox")
    public void user_can_select_all_files_when_clicked_select_all_checkbox() {
        new FilesPage_Melek().selectAllButton.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,1000)");
        BrowserUtils.waitFor(3);
        List<WebElement> all = new FilesPage_Melek().checkboxes;
        System.out.println(all.size());

        for (WebElement webElement : all) {
            Assert.assertTrue(webElement.isSelected());

        }
    }
    @Then("user can see the total values of all files")
    public void user_can_see_the_total_values_of_all_files() {

        Assert.assertTrue(new FilesPage_Melek().totalValue.isDisplayed());
    }

}
