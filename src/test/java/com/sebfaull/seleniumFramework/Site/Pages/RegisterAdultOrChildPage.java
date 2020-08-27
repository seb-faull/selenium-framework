package com.sebfaull.seleniumFramework.Site.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterAdultOrChildPage {

    private WebDriver driver;
    private String registerAdultOrChildPageURL = "https://account.bbc.com/register?action=sign-in&isCasso=false&lang=en-GB&nonce=JrmMyKjF-85DqszVGvVblzI8JUM3HHzXDLbU&ptrt=https%3A%2F%2Fwww.bbc.co.uk%2F&redirectUri=https%3A%2F%2Fsession.bbc.co.uk%2Fsession%2Fcallback&service=IdSignInService";

    private By thirteenOrOverLink = By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/div/div[3]/fieldset/div[1]/a[2]");
    private By underThirteen = By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/div/div[3]/fieldset/div[1]/a[1]");
    private By dayTextField = By.id("day-input");
    private By monthTextField = By.id("month-input");
    private By yearTextField = By.id("year-input");
    private By emailTextField = By.id("user-identifier-input");
    private By passwordTextField = By.id("password-input");
    private By postcodeTextField = By.id("postcode-input");
    private By genderDropdown = By.id("gender-input");
    private By optOutRadioButton = By.id("optOut");
    private By submitButton = By.id("submit-button");

    public RegisterAdultOrChildPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement findElement(By element) {
        return driver.findElement(element);
    }

    public RegisterAdultOrChildPage goToRegisterPage() {
        driver.navigate().to(registerAdultOrChildPageURL);
        return this;
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public void clickUnderThirteenLink() {
        findElement(underThirteen).click();
    }

    public void clickThirteenOrOverLink() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        findElement(thirteenOrOverLink).click();
    }

    public void inputDayTextField(String day) {
        findElement(dayTextField).sendKeys(day);
    }

    public void clickMonthTextField() {
        findElement(monthTextField).click();
    }

    public void clickYearTextField() {
        findElement(yearTextField).click();
    }

    public void clickEmailTextField() {
        findElement(emailTextField).click();
    }

    public void clickPasswordTextField() {
        findElement(passwordTextField).click();
    }

    public void clickPostcodeTextField() {
        findElement(postcodeTextField).click();
    }

    public void clickGenderDropdown() {
        findElement(genderDropdown).click();
    }

    public void clickSubmitButton() {
        findElement(submitButton).click();
    }
}
