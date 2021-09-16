Feature: login functionality
Scenario: user is logged in

Given browser is launched
And url is hit
When user signin with "7507190724" and "ilovecs1.6"
Then user is logged in
Then browser closed