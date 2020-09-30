Feature: Phonedeal

  Scenario: Phonedeal check
    Given user is on homepage
    When user navigate to mobiledeal
    And user find sim only deal
    Then user should select the deal and put it in basket
