
Feature: FreeCRM create task Feature 

descripitio:This feature is for creating task

Background: User is Logged In 
	Given user is on  login page 
	When user enters valid  Email and password 
	
		|email					     | password|
		|priyankajawalkar09@gmail.com|Priya@123|
		
	Then user is in home page
	Then user clicks on Task link in left navbar
	And  user should redirected to Task page	
	
Scenario Outline: Creating new Task 
	Given User click on create button
	And   user is directed to create task page
	When  user fill the fields like  "<Title>","<Assigned To>","<Priority>","<Status>","<Description>","<Identifier>"
	And   user clicks on save button 
	Then  user should redirected to task detail page
	
Examples:
	|Title   |Assigned To   |Priority|Status   |Description |Identifier|
	|Miss/Mrs|Name of person|high    |Requiring|Task Product|local     |

Scenario: User fills  the required fields
When User enters title and click on save
Then User should see the title on dashboard

Scenario: User does not fills  the required fields 
When Users enters other field Assined to,Priotiy,Status and click on save
Then User should see a error message






























