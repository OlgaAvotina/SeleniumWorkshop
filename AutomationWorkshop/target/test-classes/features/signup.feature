Feature: This feature is about creating new account in the system

  Scenario: Successful sign-up
    Given I have opened homepage
    When I select My account menu
    And I select Sign up button
    And sign up page is opened
    And I enter First name
    And I enter Last name
    And I enter Mobile number
    And I enter Email address
    And I enter Password
    Then user account page is opened