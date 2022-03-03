package com.symund.step_definitions;

import com.symund.pages.DeckPage;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class DeckStepDefs {

    DeckPage deckPage = new DeckPage();

    @When("user clicks on navigation toggle")
    public void user_clicks_on_navigation_toggle() {
        deckPage.navigationToggle.click();
    }

    @When("user clicks on Add board")
    public void user_clicks_on_Add_board() {
        deckPage.addBoardLink.click();
    }

    @When("user enters {string} into {string}")
    public void user_enters_into(String name, String inputBoxName) {
        deckPage.enterName(name,inputBoxName);
    }

    @When("user clicks add board arrow button")
    public void user_clicks_add_board_arrow_button() {
        deckPage.boardArrowButton.click();
        BrowserUtils.waitFor(1);
    }

    @Then("user should be able to see {string} under all boards")
    public void user_should_be_able_to_see_under_all_boards(String boardName) {
        List<String> boardNamesList = BrowserUtils.getElementsText(deckPage.boardNames);
        System.out.println(boardNamesList);
        Assert.assertTrue(boardNamesList.contains(boardName));
    }

    @When("user clicks on the board {string}")
    public void user_clicks_on_the_board(String boardName) {
        deckPage.navigateToBoard(boardName);
    }

    @When("user clicks on Add list button")
    public void user_clicks_on_Add_list_button() {
        deckPage.addListButton.click();
    }

    @When("user clicks add list arrow button")
    public void user_clicks_add_list_arrow_button() {
        deckPage.addListArrowButton.click();
    }

    @Then("user should be able to see {string} in {string}")
    public void user_should_be_able_to_see_in(String listName, String boardName) {
        Assert.assertEquals(deckPage.boardTitle.getText(), boardName);
        List<String> listNames = BrowserUtils.getElementsText(deckPage.listOfLists);
        Assert.assertTrue(listNames.contains(listName));
    }

}
