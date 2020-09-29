Feature: broadband deal

  Scenario: broadband
    Given user is on homepage
    When user navigate the broadband section
    And user find a broadband deal
    Then user select the appropriate deal for him
