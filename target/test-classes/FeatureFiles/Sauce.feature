Feature: Ttest Sauce Demo Application

  Scenario Outline: 
    Given Open Sauce Demo Application
    When User enter "<username>" and "<password>"
    And Click on login button
    Then Valid user should be login

    Examples: 
      | username        | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
      | problem_user    | secret_sauce |
      | visual_user     | secret_sauce |
