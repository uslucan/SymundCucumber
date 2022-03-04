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

    @When("user clicks on Add card button under list {string}")
    public void user_clicks_on_Add_card_button_under_list(String listName) {
        deckPage.getAddCardButton(listName).click();
    }

    @When("user clicks add card arrow button")
    public void user_clicks_add_card_arrow_button() {
        deckPage.addCardArrowButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("user should be able to see new card {string} on the list")
    public void user_should_be_able_to_see_new_card_on_the_list(String cardName) {
        List<String> nameOfCards = BrowserUtils.getElementsText(deckPage.listOfCards);
        Assert.assertTrue(nameOfCards.contains(cardName));
    }

    @When("user clicks on three dots under card {string}")
    public void user_clicks_on_three_dots_under_card(String cardName) {
        deckPage.getThreeDotsButton(cardName).click();
    }

    @When("user clicks on {string} under three dot options")
    public void user_clicks_on_under_three_dot_options(String optionName) {
        deckPage.getCardOptionsUnderThreeDots(optionName).click();
        BrowserUtils.waitFor(2);
    }

    @Then("user should be able to see avatar icon on the task {string}")
    public void user_should_be_able_to_see_avatar_icon_on_the_task(String cardName) {
        Assert.assertTrue(deckPage.getAvatarIcon(cardName).isDisplayed());
    }

    @When("user clicks on {string} and chooses {string}")
    public void user_clicks_on_and_chooses(String inputBoard, String boardName) {
        deckPage.moveCardOptions(inputBoard, boardName);
    }

    @When("user clicks on move card button")
    public void user_clicks_on_move_card_button() {
        deckPage.moveCardButton.click();
    }
    @Then("user should be able to see {string} on {string} list under {string} board")
    public void user_should_be_able_to_see_on_list_under_board(String string, String string2, String string3) {
        System.out.println("So far ok");
    }

}
