@HomePageTest
Feature: Home Page Activities

    Scenario: If I click on the News link, I will be directed to the BBC News page
        Given I am on the Home Page
        When I click the News link
        Then I will go to the BBC News page
