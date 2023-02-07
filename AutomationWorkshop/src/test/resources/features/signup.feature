Feature: This feature is about creating new account in the system

  Scenario: Successful login
    Given I have opened landing page
    When I select Account menu
    And I select Login button
    And I enter valid Email in login form
    And I enter valid password in login form
    And I select Login button
    Then user account page is opened