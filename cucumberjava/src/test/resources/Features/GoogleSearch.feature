Feature: feature to test google search functionality

@rahul
  Scenario: validate google search is working
    Given browsern is open
    And user is on google search page
    When user enters a text in search box
    And hit enters
    Then user is navigate to search result
