package com.test.Pages;

import com.test.BasePage;
import com.test.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    //Objects Definition//
    public static String LogInButtonXpath = "//a[contains(text(),'Log in')]";
    public static String EmailTxtFieldId = "email";
    public static String PassTxtFieldId = "password";
    public static String LogInButtonId = "logIn";
    public static String ErrorTxtFieldCss = ".login-error-container > p";
    public static String ErrorMessage = "We didn't recognize that email and/or password. Need help?";
    //End of Objects Definition//

    public static void goToMainHudlWebsite() {
        driver.get("https://www.hudl.com");
        SeleniumHelper.waitForPageLoad();
        SeleniumHelper.assertTrueDisplayingPage("Performance analysis tools for sports teams and athletes at every level.");
    }

    public static void clickOnLogin() {
        WebElement LogInButton = driver.findElement(By.xpath(LogInButtonXpath));
        LogInButton.click();
        SeleniumHelper.waitForPageLoad();
    }

    public static void enterUserAndPassword(String user, String password) {
        WebElement userTextInput = driver.findElement(By.id(EmailTxtFieldId));
        userTextInput.sendKeys(user);
        WebElement passwordTextInput = driver.findElement(By.id(PassTxtFieldId));
        passwordTextInput.sendKeys(password);
        WebElement LogInAcceptButton = driver.findElement(By.id(LogInButtonId));
        LogInAcceptButton.click();
        SeleniumHelper.waitForPageLoad();
    }

    public static void checkErrorLogin() {
        SeleniumHelper.waitForPageLoad();
        SeleniumHelper.waitForObjectToAppear(ErrorTxtFieldCss);
        SeleniumHelper.assertTrueObjectExistsWithText(ErrorTxtFieldCss,ErrorMessage);
    }
}
