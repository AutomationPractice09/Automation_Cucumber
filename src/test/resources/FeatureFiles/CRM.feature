Feature: Test CRM Application

  Background: 
    Given Open CRM Application

  Scenario: Test Sign In Link
    When User Click on Sign In link
    Then User should navigate to Sign In page

  Scenario: Test Login Functionality
    Given User navigate to SignIn page
    When User enter emailID and Password
    And Click on Submit button
    Then User should navigate to Customer Page
