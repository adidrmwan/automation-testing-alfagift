package test.automation.stepdefinitions.android;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import test.automation.pages.android.LoginScreen;
import test.automation.pages.android.WelcomeScreen;

public class LoginSteps {
    @Autowired
    LoginScreen login;

    @Autowired
    WelcomeScreen welcome;

    @Given("user on login screen")
    public void userOnLoginScreen() {
        welcome.isOnWelcomeScreen();
        welcome.tapLoginButton();
        login.isOnLoginScreen();
    }

    @When("user input {string} on phone number field")
    public void userInputNumberOnPhoneNumberField(String number) {
        login.inputPhoneNumber(number);
    }

    @And("user input {string} on password field")
    public void userInputOnPasswordField(String password) {
        login.inputPassword(password);
    }

    @And("user click next button")
    public void userClickNextButton() {
        login.tapNextButton();
    }

    @Then("user see error message {string} at the bottom of phone number field")
    public void userSeeErrorMessageOnLoginScreen(String message) {
        login.isErrorMessagePhoneNumberEqualWith(message);
    }

    @Then("user see error message {string} at the bottom of password field")
    public void userSeeErrorMessageAtTheBottomOfPasswordField(String message) {
        login.isErrorMessagePasswordEqualWith(message);
    }
}
