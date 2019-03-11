Feature: Login
  Perform login on email and password are inputted

  Scenario: Input email and password in correct format
    Given I have a LoginActivity
    And I input email "abdelraouf@gmail.com"
    Then I get loggedIn true
