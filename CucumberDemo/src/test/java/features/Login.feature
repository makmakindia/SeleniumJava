Feature: Test Application Login

Scenario: Home Page Default Login
Given User is on landing page 
When User login into application with input "TestUser1" and password "Test*123"
Then Home page is displayed
And Cards are displayed "true"

Scenario: Home Page Default Login
Given User is on landing page 
When User login into application with input "Arun" and password "Test*123"
Then Home page is displayed
And Cards are displayed "false"