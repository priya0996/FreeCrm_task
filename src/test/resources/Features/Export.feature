Feature: Validate Export functionality
Description: Testing export option from dashboard

Scenario: User is logged in
GivenUser goes to login page
When User enters valid credential
And User selects deals section from sidebar menu
Then User should be redirected to the Deals dashboard


@export
Scenario: Exporting Deals 
When User selects deals from dashboard and clicks on export option
Then Deals should be exported to documents section