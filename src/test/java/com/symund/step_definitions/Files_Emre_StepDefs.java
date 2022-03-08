package com.symund.step_definitions;

import com.symund.pages.FilesPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Files_Emre_StepDefs {


    @Then("user click name button and user should see folder view changed")
    public void user_click_name_button_and_user_should_see_folder_view_changed() {
        List<String> beforeClick = BrowserUtils.getElementsText(new FilesPage().nameList);
        new FilesPage().NameBtn.click();
        List<String> afterClick = BrowserUtils.getElementsText(new FilesPage().nameList);
        Assert.assertNotEquals(beforeClick,afterClick);
    }

    @Then("user click size button and user should see folder view changed")
    public void user_click_size_button_and_user_should_see_folder_view_changed() {
        List<String> beforeClick = BrowserUtils.getElementsText(new FilesPage().sizeList);
        new FilesPage().sizeBtn.click();
        List<String> afterClick = BrowserUtils.getElementsText(new FilesPage().sizeList);
        Assert.assertNotEquals(beforeClick,afterClick);
    }
    @Then("user click modified button and user should see folder view changed")
    public void user_click_modified_button_and_user_should_see_folder_view_changed() {
        List<String> beforeClick = BrowserUtils.getElementsText(new FilesPage().modifiedList);
        new FilesPage().modifiedBtn.click();
        List<String> afterClick = BrowserUtils.getElementsText(new FilesPage().modifiedList);
        Assert.assertNotEquals(beforeClick,afterClick);
    }
    @Then("user click toggle-view button and user should see folder view changed")
    public void user_click_toggle_view_button_and_user_should_see_folder_view_changed() {

    String pictures = Driver.get().findElement(By.id("view-toggle")).getAttribute("className");
    new FilesPage().toggleBtn.click();
    String fileList = Driver.get().findElement(By.id("view-toggle")).getAttribute("className");
    Assert.assertNotEquals(pictures,fileList);
    }

    @When("user can select all files when clicked select all checkbox")
    public void user_can_select_all_files_when_clicked_select_all_checkbox() {
        new FilesPage().selectAllButton.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,1000)");
        BrowserUtils.waitFor(3);
        List<WebElement> all = new FilesPage().checkboxes;
        System.out.println(all.size());

        for (WebElement webElement : all) {
            Assert.assertTrue(webElement.isSelected());
        }
    }
    @Then("user can see the total values of all files")
    public void user_can_see_the_total_values_of_all_files() {

        Assert.assertTrue(new FilesPage().totalValue.isDisplayed());
    }
}
