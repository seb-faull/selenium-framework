package com.sebfaull.seleniumFramework.Site.SeleniumConfig;

import org.openqa.selenium.WebDriver;

public class SeleniumConfig {

    private WebDriver driver;
    private SeleniumPropertiesReader seleniumProperties = new SeleniumPropertiesReader();

    public SeleniumConfig(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver",
                    seleniumProperties.getChromeDriverPath);
        }
    }
}
