@RegisterPageTest
Feature: Register Page Activities

    Scenario Outline: If I click on the News link, I will be directed to the BBC News page
        Given I am on the Register Page
        When I click thirteen or over link
        When I enter the day "<day>" of user DOB
        And I enter the month "<month>" of user DOB
        And I enter the year "<year>" of user DOB
        And I click submit
        Then I enter email "<email>" of user
        And I enter password "<password>" of user
        And I enter postcode "<postcode>" of user
        And I select gender "<gender>" of user
        And I click submit
        When I click opt out radio button
        Then I click submit
    Examples:
        | day | month | year | email                | password | postcode | gender |
        | 10  | 12    | 1986 | debbie5762@gmail.com | Sam1234! | NW11 8AJ | Female |