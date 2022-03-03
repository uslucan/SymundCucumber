package com.symund.step_definitions;

import com.symund.pages.BasePage;
import com.symund.pages.DashboardPage;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchAndPhotosStepDefs {

    DashboardPage dashboardPage = new DashboardPage();


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


}
