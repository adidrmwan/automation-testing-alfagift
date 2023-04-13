package test.automation.pages.android;

import io.appium.java_client.MobileBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
import test.automation.pageobject.BasePageObject;

@Component("test.automation.pages.android.WelcomeScreen")
public class WelcomeScreen extends BasePageObject {
    private By title() {
        return MobileBy.id("txt_title");
    }

    private By loginButton() {
        return MobileBy.id("btn_login");
    }

    private By registerButton() { return MobileBy.id("btn_register"); }

    public void isOnWelcomeScreen() {
        Assert.assertTrue(waitUntilVisible(title()).isDisplayed());
    }

    public void tapLoginButton(){
        onClick(loginButton());
    }

    public void tapRegisterButton(){
        onClick(registerButton());
    }
}
