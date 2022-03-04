package com.symund.step_definitions;

import com.symund.pages.StatusPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class StatusStepDefs {
    StatusPage statusPage = new StatusPage();
    @Then("user clicks on status window on dashboard")
    public void user_clicks_on_status_window_on_dashboard() {
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
        String actual = statusPage.selectedStatus.toLowerCase();
        Assert.assertEquals(expected,actual);
    }
}
