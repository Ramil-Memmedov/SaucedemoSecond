Feature: Cart functionality


  Scenario: Verify user can open Cart page

    Given User is logged in
    When User opens Cart page
    Then Cart page should be displayed


  Scenario: Verify cart contains product

    Given User is logged in
    When User opens Cart page
    Then Cart should contain product