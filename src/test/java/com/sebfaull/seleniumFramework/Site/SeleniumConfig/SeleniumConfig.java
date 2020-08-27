package com.sebfaull.seleniumFramework.Site.SeleniumConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumConfig {

    private WebDriver driver;
    private SeleniumPropertiesReader seleniumProperties = new SeleniumPropertiesReader();

    public SeleniumConfig(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", seleniumProperties.getChromeDriverPath);
            this.driver = new ChromeDriver();
        }

        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void quitDriver() {
        this.driver.quit();
    }

}
