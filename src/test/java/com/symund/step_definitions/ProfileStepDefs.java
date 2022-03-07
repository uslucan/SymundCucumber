package com.symund.step_definitions;

import com.symund.pages.ProfilePage;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProfileStepDefs {
    ProfilePage profilePage = new ProfilePage();

    @When("the user clicks on the Avatar")
    public void the_user_clicks_on_the_Avatar() {
        profilePage.avatarIcon.click();
    }

    @Then("clicks on Settings")
    public void clicks_on_Settings() {
        profilePage.navigateToSettings();
    }


    @When("user lands on settings page")
    public void user_lands_on_settings_page() {
        BrowserUtils.waitForPageToLoad(10);
    }

    @Then("the user is able to see the requested titles")
    public void the_user_is_able_to_see_the_requested_titles() {
        Assert.assertTrue(profilePage.fullName.isDisplayed());
        Assert.assertTrue(profilePage.email.isDisplayed());
        Assert.assertTrue(profilePage.phoneNum.isDisplayed());
    }

}
