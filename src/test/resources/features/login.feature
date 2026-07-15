Feature: Login functionality

  Scenario: Successful login
    Given User is on Login page
    When User enters username "standard_user"
    And User enters password "secret_sauce"
    And User clicks Login button
    Then User should be redirected to Inventory page

  Scenario: Login with invalid password
    Given User is on Login page
    When User enters username "standard_user"
    And User enters password "wrong_password"
    And User clicks Login button
    Then User should see error message "Epic sadface: Username and password do not match any user in this service"

  Scenario: Login with locked user
    Given User is on Login page
    When User enters username "locked_out_user"
    And User enters password "secret_sauce"
    And User clicks Login button
    Then User should see error message "Epic sadface: Sorry, this user has been locked out."