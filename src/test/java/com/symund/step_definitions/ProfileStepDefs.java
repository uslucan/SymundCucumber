package com.symund.step_definitions;

import com.symund.pages.ProfilePage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

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
        profilePage.fullName.sendKeys("James Bond");
        BrowserUtils.waitFor(2);
        Assert.assertTrue(profilePage.fullName.equals("James Bond"));
    }

    @When("the user clicks on {string}")
    public void the_user_clicks_on(String label) {
        BrowserUtils.waitFor(2);

        if(label.equals("full name box")){
            profilePage.fullName.click();
        }else if(label.equalsIgnoreCase("private")){
            profilePage.privatePhone.click();
        }else if(label.equalsIgnoreCase("local")){
            profilePage.localPhone.click();
        }else if(label.equalsIgnoreCase("federated")){
            profilePage.federatedPhone.click();
        }else if(label.equalsIgnoreCase("published")){
            profilePage.publishedPhone.click();
        }

    }
    @Then("user changes it to {string}")
    public void user_changes_it_to(String label2) {
        BrowserUtils.waitFor(2);

        if(label2.equalsIgnoreCase("private")){
            Assert.assertTrue(profilePage.privatePhone.isSelected());
        }else if(label2.equalsIgnoreCase("local")){
            Assert.assertTrue(profilePage.localPhone.isSelected());
        }else if(label2.equalsIgnoreCase("federated")){
            Assert.assertTrue(profilePage.federatedPhone.isSelected());
        }else if (label2.equalsIgnoreCase("published")){
            Assert.assertTrue(profilePage.publishedPhone.isSelected());
        }
    }

    @When("the user scrolls down")
    public void the_user_scrolls_down() {
        Driver.get().findElement((By) profilePage.localTime).sendKeys(Keys.CONTROL, Keys.END);
    }

    @Then("the user can see the local time")
    public void the_user_can_see_the_local_time() {
        Assert.assertTrue(profilePage.localTime.isDisplayed());
    }

}
