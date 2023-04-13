package test.automation.pages.android;

import io.appium.java_client.MobileBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
import test.automation.pageobject.AndroidPageObject;

@Component("test.automation.pages.android.LoginScreen")
public class LoginScreen extends AndroidPageObject {

    private By title() {
        return MobileBy.xpath("//android.widget.TextView[contains(@text, 'MASUK')]");
    }

    private By phoneField() {return MobileBy.id("etPhonePontaNumber"); }

    private By passwordField() {return MobileBy.id("etPassword"); }

    private By nextButton() {
        return MobileBy.id("btnNext");
    }

    private By resetPasswordButton() {
        return MobileBy.id("btnForgotPassword");
    }

    private By errorMessagePhoneNumber() {
        return MobileBy.id("tvPhoneNumberError");
    }

    private By errorMessagePassword() {
        return MobileBy.id("tvPasswordError");
    }

    public void isOnLoginScreen(){
        Assert.assertTrue(waitUntilVisible(title()).isDisplayed());
    }

    public void inputPhoneNumber(String phoneNumber) {
        onType(phoneField(), phoneNumber);
    }

    public void inputPassword(String password) {
        onType(passwordField(), password);
    }

    public void tapNextButton(){
        onClick(nextButton());
    }

    public void tapResetPasswordButton() {
        onClick(resetPasswordButton());
    }

    public String isErrorMessagePhoneNumberEqualWith(String message) {
        return waitUntilVisible(errorMessagePhoneNumber()).getText();
    }

    public String isErrorMessagePasswordEqualWith(String message) {
        return waitUntilVisible(errorMessagePassword()).getText();
    }
}
