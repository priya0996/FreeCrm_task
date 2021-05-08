Feature: Validate View, Edit and Delete  task functionality
Description: Testing the view, edit and delete operations from Task dashoard


Scenario: View an existing task
When User select particular task and click on view
Then User should see that task with details

@invalid
Scenario: Adding documents while  viewing an existing task
When user try to add documents in the view
Then application should not add the documents.

#Scenario: Edit an existing task
#When User select particular task and click on Edit
#Then User should edit task and click on save
#Then User should  be able to see edited task

#Scenario: delete an existing task
#When User select particular task and click on delete
#Then User should see task in bin
#Then User select multiple cases and clicks on delete
#Then User should see cases in bin