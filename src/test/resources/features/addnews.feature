@wip
Feature:add news

  Background:
    Given  the user is logged in
    When  the user navigates to Company on the main page and clicks Add News


@ZULL743
  Scenario: select the type of information under preview text
    Then  user can select the type of information


@ZULL744
  Scenario: add tags under details
    When the user types the world in the Title inputbox
    And the user clicks on Details
    And the user types picture in the tags inputbox
    And the user clicks on Save
    Then user is able to add tags under details

@ZULL745
  Scenario: select Text, HTML, and Visual Editor
    When the user clicks on Text, HTML, and Visual Editor
    Then User is able to select Text, HTML, and Visual Editor

@ZULL746
  Scenario: send news
    When the user types Expert Roundup: How Technology is Shaping the Future of Life Sciences in the Title inputbox
    And the user typeS Industry leaders share perspectives on moving the life sciences industry forward under the text.
    And the user clicks on Save and add
    Then the page title contains "Company"






