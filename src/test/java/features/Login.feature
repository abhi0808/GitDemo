Feature: Credit Card Payment

Scenario: To Test the minimum amount
Given User is on landing page
When User login with username "user1" and password "password1"
Then Home Page is displayed
And Cards are displayed

Scenario: To Test the zero amount
Given User is on landing page
When User login with username "user2" and password "password2"
Then Home Page is displayed
And Cards are not displayed