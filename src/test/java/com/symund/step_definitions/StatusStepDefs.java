package com.symund.step_definitions;

import com.symund.pages.StatusPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StatusStepDefs {
    StatusPage statusPage = new StatusPage();

    @Then("user clicks on status window on dashboard")
    public void user_clicks_on_status_window_on_dashboard() {
        statusPage.statusWindow.click();
        statusPage.clearStatus.click();
        //BrowserUtils.waitForClickablility(statusPage.statusWindow,5);
        BrowserUtils.waitFor(2);
        statusPage.statusWindow.click();
    }

    @Then("verify selected status is displayed in frame\\(selected)")
    public void verify_selected_status_is_displayed_in_frame_selected() {

        Assert.assertTrue(statusPage.findSelected());
        Driver.get().navigate().back();
    }

    @Then("verify selected status on avatar menu matches with actual status")
    public void verify_selected_status_on_avatar_menu_is_same() {
        String expected = statusPage.statusOnAvatar.getText().toLowerCase();
        String actual = statusPage.statusWindow.getText().toLowerCase();
        Assert.assertEquals(expected, actual);
    }

    @When("user change online status {string}")
    public void user_change_online_status(String status) {
        statusPage.selectStatus(status);
    }

    @Then("verify selected status is displayed in frame\\(selected) {string}")
    public void verify_selected_status_is_displayed_in_frame_selected(String status) {
        Assert.assertTrue(statusPage.isSelected(status));
        Driver.get().navigate().back();
    }
}
