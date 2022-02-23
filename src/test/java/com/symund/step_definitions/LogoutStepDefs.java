package com.symund.step_definitions;

import com.symund.pages.Login;
import com.symund.pages.StatusPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDefs {

    StatusPage statusPage = new StatusPage();

    @Given("user clicks on avatar button")
    public void user_clicks_on_avatar_button() {
        statusPage.avatar.click();
    }

    @When("user clicks on the logout option")
    public void user_clicks_on_the_logout_option() {
        statusPage.logoutBtn.click();
     }
    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expectedTitle) {
        BrowserUtils.waitFor(2);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @When("user clicks on navigate back")
    public void user_clicks_on_navigate_back() {
        BrowserUtils.waitFor(2);
        Driver.get().navigate().back();
    }


}
