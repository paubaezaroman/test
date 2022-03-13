package com.test.stepDefs;

import com.test.Pages.HomePage;
import com.test.Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginPage_StepDefs{

    @Given("I go to the main website application")
    public void iGoToTheMainWebsiteApplication() {
        LoginPage.goToMainHudlWebsite();
    }

    @When("I click on login and enter {string} and {string}")
    public void i_click_on_login_and_enter_user_and_password(String user, String password) {
        LoginPage.clickOnLogin();
        LoginPage.enterUserAndPassword(user,password);
    }

    @Then("I am logged in to Hudl Home Page")
    public void iAmLoggedInToHudlHomePage() {
        HomePage.iAmInHomePage();
    }

    @Then("I am prompted with an error")
    public void iAmPromptedWithAnError() {
        LoginPage.checkErrorLogin();
    }
}