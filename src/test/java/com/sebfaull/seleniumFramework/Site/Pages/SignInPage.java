package com.sebfaull.seleniumFramework.Site.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

    private WebDriver driver;
    private String signInPageURL = "https://account.bbc.com/signin?lang=en-GB&ptrt=https%3A%2F%2Fwww.bbc.co.uk%2F&realm=&isCasso=false&action=sign-in&redirectUri=https%3A%2F%2Fsession.bbc.co.uk%2Fsession%2Fcallback&service=IdSignInService&nonce=JrmMyKjF-85DqszVGvVblzI8JUM3HHzXDLbU";

    // Links and buttons
    private By emailOrUsernameTextField = By.id("user-identifier-input");
    private By passwordTextField = By.id("password-input");
    private By signInButton = By.id("submit-button");
    private By registerNowLink = By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/div[2]/a");

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement findElement(By element) {
        return driver.findElement(element);
    }

    public SignInPage goToSignInPage() {
        driver.navigate().to(signInPageURL);
        return this;
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public void clickEmailUsernameTextField() {
        findElement(emailOrUsernameTextField).click();
    }

    public void clickPasswordTextField() {
        findElement(passwordTextField).click();
    }

    public void clickSignInButton() {
        findElement(signInButton).click();
    }

    public void clickRegisterNowLink() {
        findElement(registerNowLink).click();
    }
}
