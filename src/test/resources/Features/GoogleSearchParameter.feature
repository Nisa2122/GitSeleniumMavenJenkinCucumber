Feature: Google Search
As a user
I want to be able to search on Google
So that i can find relevent information
Background:
    Given I am on the Google search page

  Scenario: Searching on Google with Parameterization
    When I search for "Selenium"
    Then I should see search results for "Selenium - Google Search"

  Scenario: Searching on Google with Parameterization
    When I search for "TestNg"
    Then I should see search results for "TestNg1 - Google Search"
