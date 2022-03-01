package com.symund.step_definitions;

import com.symund.pages.Login;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LoginStepDefs {
    Login loginPage = new Login();


    @When("the user login with valid credentials")
    public void the_user_enters_valid_credentials() {
        loginPage.usernameInputBox.sendKeys(ConfigurationReader.get("username"));
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.get("password"));
        loginPage.loginBtn.click();

    }

    @When("the user enters valid credentials and hit the enter on keyboard")
    public void the_user_enters_valid_credentials_and_hit_the_enter_on_keyboard() {
        loginPage.usernameInputBox.sendKeys(ConfigurationReader.get("username"));
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.get("password") + Keys.ENTER);
    }


    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        String expectedTitle = "Dashboard - Symund - QA";
        String actualTitle = Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle);

    }


    @When("When the user enters invalid credentials {string} and {string}")
    public void when_the_user_enters_invalid_credentials_and(String username, String password) {
        loginPage.usernameInputBox.sendKeys(username);
        loginPage.passwordInputBox.sendKeys(password);
        loginPage.loginBtn.click();
    }

    @Then("An error message should be displayed")
    public void an_error_message_should_be_displayed() {
        String expectedMsg = "Wrong username or password.";
        String actualMsg = loginPage.warningMsg.getText();
        System.out.println("actualMsg = " + actualMsg);
        Assert.assertEquals(actualMsg, expectedMsg);
    }

    @Then("{string} message should be displayed")
    public void message_should_be_displayed(String msg) {
        Assert.assertTrue(msg.equals(loginPage.getMsg(loginPage.passwordInputBox)) || msg.equals(loginPage.getMsg(loginPage.usernameInputBox)));

    }

    @Then("user should see the palceholders {string} and {string}")
    public void user_should_see_the_palceholders_and(String username, String password) {
        Assert.assertEquals(username, loginPage.usernameInputBox.getAttribute("placeholder"));
        Assert.assertEquals(password, loginPage.passwordInputBox.getAttribute("placeholder"));


    }

    @When("user types something in password box and it should be seen in form of dots")
    public void user_types_something_in_password_box_it_should_be_seen_in_form_of_dots() {
        loginPage.passwordInputBox.sendKeys("123");
        Assert.assertEquals("password", loginPage.passwordInputBox.getAttribute("type"));
        loginPage.passwordInputBox.clear();

    }

    @When("user clicks the eye button on passwordbox")
    public void user_clicks_the_eye_button_on_passwordbox() {
        loginPage.eyeIcon.click();

    }

    @Then("password should be seen explicitly")
    public void password_should_be_seen_explicitly() {
        Assert.assertEquals(loginPage.usernameInputBox.getAttribute("type"), "text");
    }

    @Given("user should be able to see {string} link on login page")
    public void user_should_be_able_to_see_link_on_login_page(String expected) {
        String actual = loginPage.forgotPassword.getText();
        Assert.assertEquals(actual, expected);
    }

    @When("user clicks on forget password link")
    public void user_clicks_on_forget_password_link() {
        loginPage.forgotPassword.click();

    }

    @Then("user should be able to see {string} button")
    public void user_should_be_able_to_see_button(String expected) {
        String actual = loginPage.resetPassword.getAttribute("value");
        Assert.assertEquals(actual, expected);

    }

}
