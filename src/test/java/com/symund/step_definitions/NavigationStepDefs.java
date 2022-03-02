package com.symund.step_definitions;

import com.symund.pages.DashboardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class NavigationStepDefs {

    @Then("user navigates to {string} module")
    public void user_navigates_to_module(String module) {
        new DashboardPage().navigateTo(module.toLowerCase());
    }


}
