package com.symund.step_definitions;

import com.symund.pages.StatusPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class StatusStepDefs {
    StatusPage statusPage = new StatusPage();

    @Then("user clicks on status window on dashboard")
    public void user_clicks_on_status_window_on_dashboard() {
        statusPage.statusWindow.click();
        statusPage.clearStatus.click();
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

    @When("user chooses one of the status messages randomly")
    public void user_chooses_oen_of_the_status_messages_randomly() {
        statusPage.chooseStatusMsg();
    }

    @Then("verify chosen message is displayed on status window")
    public void verify_chosen_message_is_displayed_on_status_window() {
        String expected = Driver.get().findElement(By.cssSelector(".custom-input__form>input")).getAttribute("value");
        statusPage.setStatusMsgBtn.click();
        BrowserUtils.waitFor(2);
        String actual = Driver.get().findElement(By.cssSelector(".user-status-menu-item__toggle.user-status-menu-item__toggle--inline")).getText();
        Assert.assertTrue(actual.contains(expected));
    }

    @When("user types a message into custom message box {string}")
    public void user_types_a_message_into_custom_message_box(String msg) {
        Driver.get().findElement(By.cssSelector(".custom-input__form>input")).sendKeys(msg);
        Driver.get().findElement(By.xpath("//*[@class='custom-input__emoji-button']")).click();
       // String actual = Driver.get().findElement(By.cssSelector(".user-status-menu-item__toggle.user-status-menu-item__toggle--inline")).getText();
        //System.out.println("actual = " + actual);
        //Assert.assertTrue(actual.contains(msg));

    }
    @When("user chooses a random emoji")
    public void user_chooses_a_random_emoji() {
        statusPage.chooseRandomEmoji();
    }

    @When("user sets the custom status message")
    public void user_sets_the_custom_status_message() {
        statusPage.setStatusMsgBtn.click();
    }

}
