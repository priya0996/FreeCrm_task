Feature: Test Login Functionality


Scenario: check login is successful valid credentials


Given browser is open
When user enters username and password
And  user click's on login 
Then user is navigated to the home page
Then user click on create button
Then user fills the data 
Then user clicks on save button

