Feature: Test login functionality

  Scenario Outline: Check login successfully completed?
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user navigated to home page

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Admin123 | hello    |
