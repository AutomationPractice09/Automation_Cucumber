Feature: Test Google Application.

  Scenario: Test Google title name.
    Given Open Google Application
    When User get Actual title
    Then Title should match with Google

