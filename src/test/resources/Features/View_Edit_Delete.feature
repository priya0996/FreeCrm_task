Feature: Validate View, Edit and Delete  task functionality
Description: Testing the view, edit and delete operations from Task dashoard

Background: User is logged in
Given User navigates to login page
When User enters valid credentials
And User selects task section from sidebar menu
Then User should be redirected to task dashboard

Scenario: View an existing task
When User selects the task from dashboard by clicking on view icon
Then Existing task should be visible with all details

Scenario: Edit an existing task
When User selects the task from dashboard by clicking on edit icon
Then User should be able to edit the task

Scenario: Delete an existing task
When User selects the task from dashboard by clicking on delete icon
Then User should be able to see task in bin
