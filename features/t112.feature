Feature: Testing the orange HRM application



@TC_001
Scenario: Validate if user is able to login1
Given when user hits the url in the browser
When user enters username and password
Then user should be successfully able to login

@smoke
@TC_002
Scenario: Validate if user is able to login2
Given when user hits the url in the browser
When user enters username and password
Then user should be successfully able to login