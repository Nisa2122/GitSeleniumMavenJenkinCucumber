Feature: Login Functionality

  Background:
    Given I navigate to the login page
    And I enter my username
    And I enter my password
    When I click on the login button

  Scenario: Successful Login
    Then I should be logged in

  Scenario: Logout
    Given I am logged in
    When I click on the logout button
    Then I should be logged out
