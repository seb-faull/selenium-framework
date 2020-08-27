package com.sebfaull.seleniumFramework.Site.SeleniumConfig;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SeleniumPropertiesReader {

    private String chromeDriverPath;
    private String firefoxDriverPath;
    private String propertiesFileLocation = "resources/selenium.properties";

    public SeleniumPropertiesReader() {

        Properties seleniumProperties = new Properties();

        try {
            seleniumProperties.load(new FileReader(propertiesFileLocation));
        } catch (IOException e) {
            e.printStackTrace();
        }

        chromeDriverPath = seleniumProperties.getProperty("chromedriverpath");

    }

    public String getChromeDriverPath() {
        return chromeDriverPath;
    }

}
