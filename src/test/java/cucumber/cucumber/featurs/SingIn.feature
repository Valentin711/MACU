Feature: Sign In

  Scenario: Using valid ID and Password
    Given SingIn page is opened
    And  User ID and Password are set
    When  Click on sign in button
    Then  Account page for the user used should be displayed
