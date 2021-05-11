Feature: Validate View  task functionality
Description: Testing the view, edit and delete operations from Task dashoard

Scenario: verify login and view task page of FreeCRM

Given browser is open
When user enters username and password
And  user click's on login 
Then user is navigated to the home page
Then user click on view button
Then user select particular task and click on view
Then user should see that task

Scenario: Adding due date and close date to the task
When user try to add privious date in the  close date
Then application should not add the old date than due date it must be same  date or next date.

