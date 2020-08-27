package com.sebfaull.seleniumFramework.Site.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;
    private String homePageURL = "https://www.bbc.co.uk/";

    // Links
    private By newsLink = By.xpath("/html/body/div/div/header/nav/div[1]/div/div[1]/ul[2]/li[4]");
    private By signInLink = By.xpath("/html/body/div/div/header/nav/div[1]/div/div[1]/ul[2]/li[1]/div");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement findElement(By element) {
        return driver.findElement(element);
    }

    public HomePage goToHomePage() {
        driver.navigate().to(homePageURL);
        return this;
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public void clickNewsLink() {
        findElement(newsLink).click();
    }

    public void clickSignInLink() {
        findElement(signInLink).click();
    }
}
