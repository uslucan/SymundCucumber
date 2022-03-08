package com.symund.step_definitions;

import com.symund.pages.DashboardPage;
import com.symund.pages.FilesPage_Melek;
import com.symund.pages.TalkPage;
import com.symund.pages.TasksPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.cucumberexpressions.Group;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;

public class TalkStepDefs {

    TalkPage talkPage = new TalkPage();
    DashboardPage dashboardPage = new DashboardPage();

    @When("the user clicks the plus button")
    public void the_user_clicks_the_plus_button() {
        BrowserUtils.waitFor(2);
        talkPage.plusButton.click();
    }

    @When("the user enters the conversation name as Group1")
    public void the_user_enters_the_conversation_name_as_Group1() {
        BrowserUtils.waitFor(2);
        talkPage.conversationName.sendKeys("Group1");
    }

    @When("the user clicks Add Participants button")
    public void the_user_clicks_Add_Participants_button() {
        BrowserUtils.waitFor(2);
        talkPage.addParticipant.click();
    }

    @When("the user searches and selects {string} via the search box")
    public void the_user_searches_and_selects_via_the_search_box(String employeeName) {
        BrowserUtils.waitFor(2);
        talkPage.searchParticipant.sendKeys(employeeName);
        talkPage.employeeName.click();
        talkPage.searchParticipant.clear();
    }

    @When("the user clicks the Create Conversation button")
    public void the_user_clicks_the_Create_Conversation_button() {
        BrowserUtils.waitFor(2);
        talkPage.createConv.click();
    }

    @Then("the user verifies that conversation group is created")
    public void the_user_verifies_that_conversation_group_is_created() {

        BrowserUtils.waitFor(2);

        Assert.assertEquals("Group1", talkPage.verifyGroupName.getText());

    }

    @Then("the user verifies that participants can be seen on the right-hand menu")
    public void the_user_verifies_that_participants_can_be_seen_on_the_right_hand_menu() {
        BrowserUtils.waitFor(6);
        //Assert.assertEquals("Employee141", talkPage.participant2.getText());
        //Assert.assertEquals("Employee91", talkPage.participant3.getText());

        List<String> partList1 = BrowserUtils.getElementsText(new TalkPage().partNames);
        System.out.println(partList1);
        Assert.assertTrue(partList1.contains("Employee91"));



    }



    @When("the user removes a participant from the conversation and verifies it is removed")
    public void the_user_removes_a_participant_from_the_conversation_and_verifies_it_is_removed() {

        BrowserUtils.waitFor(2);
     /*  List<String> partList1 = BrowserUtils.getElementsText(new TalkPage().partNames);
        System.out.println(partList1);
        new TalkPage().remPartButton.click();
        BrowserUtils.waitFor(2);
        new TalkPage().remPart.click();
        BrowserUtils.waitFor(2);
        List<String> partList2 = BrowserUtils.getElementsText(new TalkPage().partNames);
        System.out.println(partList2);
        Assert.assertNotEquals(partList1,partList2);
     */

        talkPage.remPartButton.click();
        BrowserUtils.waitFor(2);
        talkPage.remPart.click();
        BrowserUtils.waitFor(2);
        List<String> partList = BrowserUtils.getElementsText(new TalkPage().partNames);
        System.out.println(partList);
        Assert.assertFalse(partList.contains("Employee91"));


    }

    @When("the user sends a message by typing in the inputbox and verifies it is sent")
    public void the_user_sends_a_message_by_typing_in_the_inputbox_and_verifies_it_is_sent() {

        BrowserUtils.waitFor(2);
        talkPage.messageBox.sendKeys("Hello" + Keys.ENTER);
        BrowserUtils.waitFor(2);
        List<String> messageList = BrowserUtils.getElementsText(new TalkPage().messageSent);
        System.out.println(messageList);
        Assert.assertTrue(messageList.contains("Hello"));



    }


    @Then("the user deletes the created group and verifies that the group is deleted")
    public void the_user_deletes_the_created_group_and_verifies_that_the_group_is_deleted() {
        BrowserUtils.waitFor(2);
        List<String> groupList1 = BrowserUtils.getElementsText(new TalkPage().groupNames);
        System.out.println(groupList1);
        new TalkPage().threeDot.click();
        BrowserUtils.waitFor(2);
        new TalkPage().deleteConv.click();
        BrowserUtils.waitFor(2);
        new TalkPage().yesButton.click();
        BrowserUtils.waitFor(2);
        List<String> groupList2 = BrowserUtils.getElementsText(new TalkPage().groupNames);
        System.out.println(groupList2);
        Assert.assertNotEquals(groupList1,groupList2);


    }

}
