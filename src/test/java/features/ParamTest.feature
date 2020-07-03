Feature: Login to account

  Scenario Outline: Login to account with credentials
    Given user navigates to "<url>"
    When user clicks on the login portal button
    And user enters the "<username>" username
    And user enters the "<password>" password
    When user clicks on the login button
    Then the user should be presented with the following prompt alert "<message>"
    Examples:
      | url                             | username  | password     | message              |
      | http://webdriveruniversity.com/ | user1     | pass1        | validation failed    |
      | http://webdriveruniversity.com/ | webdriver | webdriver123 | validation succeeded |
