package com.symund.step_definitions;

import com.symund.pages.BasePage;
import com.symund.pages.DashboardPage;
import com.symund.pages.SearchAndPhotoPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.awt.*;

public class SearchAndPhotosStepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    SearchAndPhotoPage searchAndPhotoPage = new SearchAndPhotoPage();


    @When("the user click on the magnifying icon")
    public void the_user_click_on_the_magnifying_icon() {
        dashboardPage.magnifyIcon.click();
    }

    @And("the user enter a file name")
    public void the_user_enter_a_file_name() {
        dashboardPage.searchFile.sendKeys("HK-Test");
        BrowserUtils.waitFor(3);
    }

    @And("the user should be able to find and click on the file")
    public void the_user_should_be_able_to_find_and_click_on_the_file() {

        String actualResult = dashboardPage.FileSearchResult.getAttribute("title");
        Assert.assertEquals("HK-Test", actualResult);
        dashboardPage.FileSearchResult.click();
        BrowserUtils.waitFor(20);
    }

    @Then("the user should be able to see the details side page of the file")
    public void the_user_should_be_able_to_see_the_details_side_page_of_the_file() {

        String actualResult = dashboardPage.fileInfo.getText();
        Assert.assertTrue(actualResult.contains("HK-Test"));
    }

    @When("the user click on the contacts search icon")
    public void the_user_click_on_the_contacts_search_icon() {
        BrowserUtils.waitFor(3);
        dashboardPage.contacts.click();
    }

    @When("the user navigates to {string} page")
    public void the_user_navigates_to_page(String photos) {
        dashboardPage.navigateTo(photos);
        BrowserUtils.waitForPageToLoad(2);

    }

    @When("the user click on the Symund icon")
    public void the_user_click_on_the_Symund_icon() {
        dashboardPage.symundLogo.click();
    }

    @Then("the user should be able to navigate to {string} page")
    public void the_user_should_be_able_to_navigate_to_page(String page) {
        Assert.assertTrue(searchAndPhotoPage.getPageTitle().contains(page));

    }

    @When("the user enter a contact name")
    public void the_user_enter_a_contact_name() {
        BrowserUtils.waitFor(3);
        searchAndPhotoPage.searchContact.sendKeys("Employee1");
    }

    @Then("the user should be able to see the contact name in search result")
    public void the_user_should_be_able_to_see_the_contact_name_in_search_result() {
        BrowserUtils.waitFor(10);
        String actualResult = searchAndPhotoPage.contactResult.getText();
        System.out.println(searchAndPhotoPage.contactResult.getText());
        Assert.assertEquals("Employee1", actualResult);
    }

    @When("the user click on the plus icon")
    public void the_user_click_on_the_plus_icon() {
        searchAndPhotoPage.plusIcon.click();
        BrowserUtils.waitFor(2);
    }

    @When("the user click on upload file and upload the an {string} file")
    public void the_user_click_on_upload_file_and_upload_the_an_image_file(String image) {
        //filesPage.uploadFile.click();
        BrowserUtils.waitFor(10);

        String projectPath = System.getProperty("user.dir");
        System.out.println("projectPath = " + projectPath);
        String filePath = "src\\test\\resources\\Sprint4.jpg";
        String fullPath = projectPath + "/" + filePath;
        searchAndPhotoPage.uploadFile.sendKeys(fullPath);
        BrowserUtils.waitFor(10);
    }
    @Then("user should be able to see uploaded {string} file on Photos page")
    public void user_should_be_able_to_see_uploaded_image_file_on_Photos_page(String expectedfiles) {

        BrowserUtils.waitFor(20);
        String actualfiles = searchAndPhotoPage.uploadimage.getAttribute("Alt");

        BrowserUtils.waitFor(5);
        Assert.assertEquals(expectedfiles, actualfiles);
    }
}
