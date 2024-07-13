Feature: Test Google Application.

  Background: 
    Given Open Google Application

  Scenario: Test Google title name.
    #Given Open Google Application
    When User get Actual title
    Then Title should match with Google

  Scenario: Test Google search feature
    #Given Open Google Application
    When User search with valid keyword "Cucumber"
    Then User should get valid search results
