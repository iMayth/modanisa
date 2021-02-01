Feature: ToDo list
@wip
  Scenario: Go to the main page of the website
    Given The user is on the main page with empty ToDo list
    When The user writes buy some milk to text box and click to add button
    Then The user should see buy some milk item in ToDo list