Feature: Login

  Scenario: Login with valid credential

    Given Goto FB1 Login Page
    When  user enters username
    And user enters password
    Then user checks username is present
    And user checks password is present
    #But Login button not clicked

