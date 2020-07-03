Feature: Login to account at webdriveruniversity.com using login portal

  Scenario:
    Given I access webdriveruniversity
    When I click on the login portal button
    And I enter a username from data
    |first|second|
    |third|four|
    And I enter a password
    When I click on the login button
    Then I should be presented with a unsuccesfful validation alert
