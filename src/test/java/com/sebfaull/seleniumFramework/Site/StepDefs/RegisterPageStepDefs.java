package com.sebfaull.seleniumFramework.Site.StepDefs;

import com.sebfaull.seleniumFramework.Site.Pages.HomePage;
import com.sebfaull.seleniumFramework.Site.Pages.RegisterAdultOrChildPage;
import com.sebfaull.seleniumFramework.Site.SeleniumConfig.SeleniumConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.rules.Timeout;
import org.openqa.selenium.support.ui.Wait;

public class RegisterPageStepDefs {

    private static RegisterAdultOrChildPage registerPage;
    private static SeleniumConfig driver;

    @Before("@RegisterPageTest")
    public void setUp() {
        driver = new SeleniumConfig("chrome");
        registerPage = new RegisterAdultOrChildPage(driver.getDriver());
        registerPage.goToRegisterPage();
    }

    @Given("^I am on the Register Page$")
    public void iAmOnTheRegisterPage() {
        Assert.assertEquals(registerPage.getCurrentURL(), "https://account.bbc.com/register?action=sign-in&isCasso=false&lang=en-GB&nonce=JrmMyKjF-85DqszVGvVblzI8JUM3HHzXDLbU&ptrt=https%3A%2F%2Fwww.bbc.co.uk%2F&redirectUri=https%3A%2F%2Fsession.bbc.co.uk%2Fsession%2Fcallback&service=IdSignInService");
    }

    @When("^I click thirteen or over link$")
    public void iClickThirteenOrOverLink() {
        registerPage.clickThirteenOrOverLink();
    }

    @When("^I enter the day \"(.*)\" of user DOB$")
    public void iEnterTheDayOfUserDOB(String day) {
        registerPage.inputDayTextField(day);
    }

    @And("^I enter the month \"(.*)\" of user DOB$")
    public void iEnterTheMonthOfUserDOB(String month) {
        registerPage.inputMonthTextField(month);
    }

    @And("^I enter the year \"(.*)\" of user DOB$")
    public void iEnterTheYearOfUserDOB(String year) {
        registerPage.inputYearTextField(year);
    }

    @And("^I click submit")
    public void iClickSubmit() {
        registerPage.clickSubmitButton();
    }

    @And("^I enter email \"(.*)\" of user$")
    public void iEnterEmailOfUser(String email) {
        registerPage.inputEmailTextField(email);
    }

    @And("^I enter password \"(.*)\" of user$")
    public void iEnterPasswordOfUser(String password) {
        registerPage.inputPasswordTextField(password);
    }

    @And("^I enter postcode \"(.*)\" of user$")
    public void iEnterPostcodeOfUser(String postcode) {
        registerPage.inputPostcodeTextField(postcode);
    }

    @And("^I select gender \"(.*)\" of user$")
    public void iSelectGenderOfUser(String gender) {
        registerPage.selectGenderDropdown(gender);
    }

    @When("^I click opt out radio button$")
    public void iClickOptOutRadioButton() {
        registerPage.clickOptOutRadioButton();
    }

    @After("@RegisterPageTest")
    public void quitDriver() {
        driver.quitDriver();
    }
}
