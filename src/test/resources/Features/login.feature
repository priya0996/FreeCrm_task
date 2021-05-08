Feature: Test Login Functionality


Scenario: check login is successful valid credentials


Given browser is open
When user enters username and password
And  user click's on login 
Then user is navigated to the home page
Then user click on create button
Then user fills the data 
Then user clicks on save button

Scenario: View an existing task
When User select particular task and click on view
Then User should see that task with details

@invalid
Scenario: Adding documents while  viewing an existing task
When user try to add documents in the view
Then application should not add the documents.

