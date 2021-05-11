Feature: Validate View, Edit and Delete functionality
Description: Testing the view, edit and delete operations from Tasks dashoard

Scenario: User is logged in
Given User navigates to Login page
When User Enters valid credentials
And User selects Tasks section from sidebar menu
Then User should be redirected to Tasks dashboard


@View
Scenario: View an existing Tasks
When User selects the tasks from dashboard by clicking on view icon
Then Existing Tasks should be visible with all details


@Edit
Scenario: Edit an existing Tasks
When User selects the Tasks from dashboard by clicking on edit icon
Then User should be able to edit the Tasks


@Delete
Scenario: Delete an existing Tasks
When User selects the Tasks from dashboard by clicking on delete icon
Then User should be able to see Tasks in bin