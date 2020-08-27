package com.sebfaull.seleniumFramework.Site.StepDefs;

import com.sebfaull.seleniumFramework.Site.Pages.*;
import com.sebfaull.seleniumFramework.Site.SeleniumConfig.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageStepDefs {

    private static HomePage homePage;
    private static NewsPage newsPage;
    private static SeleniumConfig driver;

    @Before("@HomePageTest")
    public void setUp() {
        driver = new SeleniumConfig("chrome");
        homePage = new HomePage(driver.getDriver());
        homePage.goToHomePage();
    }

    @Given("^I am on the Home Page$")
    public void i_am_on_the_homepage() {
        Assert.assertEquals(homePage.getCurrentURL(), "https://www.bbc.co.uk/");
    }

    @When("^I click the News link$")
    public void i_click_the_news_link() {
        homePage.clickNewsLink();
    }

    @Then("^I will go to the BBC News page$")
    public void i_will_go_to_the_bbc_news_page() {
        newsPage = new NewsPage(driver.getDriver());
        Assert.assertEquals(newsPage.getCurrentURL(), "https://www.bbc.co.uk/news");
    }

    @When("^I click the Sign In link$")
    public void i_click_the_sign_in_link() {
        homePage.clickSignInLink();
    }

    @After("@HomePageTest")
    public void quitDriver() {
        driver.quitDriver();
    }
}
