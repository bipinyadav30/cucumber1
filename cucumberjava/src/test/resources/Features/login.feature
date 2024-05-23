Feature: check login functionality

@rahul
Scenario: check the valid login using valid credential
Given chromebrowser is open
When user should be on login page
And enter valid credential
Then verify the  login page