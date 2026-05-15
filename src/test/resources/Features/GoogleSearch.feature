Feature: Google Search
  As a user
  I want to be able to search on Google
  So that I can find relevant information

  Scenario: Searching on Google
    Given I am on the Google search page
    When I search for a Keyword
    Then I should see search results for Keyword
