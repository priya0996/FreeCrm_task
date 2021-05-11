Feature: Invalid Testcase 
Description testing invalid  Functionality

Scenario: check login is successful with valid credentials

Given browser is open
When user enters username and password
And  user click's on login 
Then user is navigated to the home page
Then user click on create button

Scenario: user fills invalid data in title field
When user enters invalid data in title abd click on save
Then user shrould see error message and task should not create