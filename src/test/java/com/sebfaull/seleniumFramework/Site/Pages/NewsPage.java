package com.sebfaull.seleniumFramework.Site.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsPage {

    private WebDriver driver;
    private String newsPageURL = "https://www.bbc.co.uk/news";
    private By bbcNewsLogoCSS = By.cssSelector("nw-o-news-branding__logo");
    private By ukNewsTabLink = By.xpath("/html/body/div[7]/header/div[2]/div[1]/div[1]/nav/ul/li[4]/a");

    public NewsPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement findElement(By element) {
        return driver.findElement(element);
    }

    public NewsPage goToNewsPage() {
        driver.navigate().to(newsPageURL);
        return this;
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public void clickUkNewsTabLink() {
        findElement(ukNewsTabLink).click();
    }
}
