package com.symund.step_definitions;

import com.symund.pages.ProfilePage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

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

    @When("the clicks on {string}")
    public void the_clicks_on(String fullName) {
        BrowserUtils.waitFor(2);
        profilePage.fullName.click();

    }

    @Then("the user is able to change the name")
    public void the_user_is_able_to_change_the_name() {
        profilePage.fullName.sendKeys(Keys.CONTROL + "A");
        profilePage.fullName.sendKeys("James Bond");
        BrowserUtils.waitFor(2);
        String actual = profilePage.fullName.getAttribute("value");
        Assert.assertEquals("James Bond", actual);
    }

    @When("the user clicks on {string}")
    public void the_user_clicks_on(String label) {

        if (label.equalsIgnoreCase("private")) {

            BrowserUtils.waitFor(2);
            profilePage.phoneprivacy.click();
            profilePage.privatePhone.click();

        } else if (label.equalsIgnoreCase("local")) {
            BrowserUtils.waitFor(2);
            profilePage.phoneprivacy.click();
            profilePage.localPhone.click();
        } else if (label.equalsIgnoreCase("federated")) {
            BrowserUtils.waitFor(2);
            profilePage.phoneprivacy.click();
            profilePage.federatedPhone.click();
        } else if (label.equalsIgnoreCase("published")) {
            BrowserUtils.waitFor(2);
            profilePage.phoneprivacy.click();
            profilePage.publishedPhone.click();
        }

    }

    @Then("user changes it to {string}")
    public void user_changes_it_to(String label2) {

        BrowserUtils.waitFor(2);

        if (label2.equals("private")) {
            BrowserUtils.waitFor(2);
            String actual = profilePage.privatePhone.getAttribute("class");
            Assert.assertTrue(actual.contains("icon icon-phone"));
        } else if (label2.equals("local")) {
            BrowserUtils.waitFor(2);
            String actual = profilePage.localPhone.getAttribute("class");
            Assert.assertTrue(actual.contains("icon-password"));
        } else if (label2.equals("federated")) {
            BrowserUtils.waitFor(2);
            String actual = profilePage.federatedPhone.getAttribute("class");
            Assert.assertTrue(actual.contains("icon-contacts-dark"));
        } else if (label2.equals("published")) {
            BrowserUtils.waitFor(2);
            String actual = profilePage.publishedPhone.getAttribute("class");
            Assert.assertTrue(actual.contains("icon-link"));
        }
    }

    @Then("the user can see the local time")
    public void the_user_can_see_the_local_time() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(profilePage.localTime.isDisplayed());
    }

}
