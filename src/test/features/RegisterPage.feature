@RegisterPageTest
Feature: Register Page Activities

    Scenario Outline: If I click on the News link, I will be directed to the BBC News page
        Given I am on the Register Page
        When I click thirteen or over link
        When I enter the "<day>" of user DOB
#        And I enter the month of user DOB
#        And I enter the year of user DOB
#        And I click continue
    Examples:
        | day |
        | 10  |