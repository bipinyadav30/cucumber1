Feature: feature to test login functionality

  Scenario: check login is successful with valid credentials
    Given the browser is open
    And the user is on login page
    When the user enters  username and password
    And the click on login  button
    Then the user is navigated to the home page

   