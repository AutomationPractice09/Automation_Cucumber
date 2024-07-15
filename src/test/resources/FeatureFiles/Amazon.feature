Feature: Test Amazon Application

  Background: 
    Given Open Amazon application

  Scenario: Test Title of Homepage
    When User get the title of Homepage
    Then Title of home page should be matched

  Scenario: Test Title of BestSeller page
    When User Open the BestSellers page
    And User get the title of BestSeller page
    Then Title of BestSellers page should be matched

  Scenario: Test Title of Mobile page
    When User Open the Mobile page
    And User get the title of Mobile page
   Then Title of Mobile page should be matched

  Scenario: Test Title of Fashion page
    When User Open the Fashion page
    And User get the title of Fashion page
    Then Title of Fashion page should be matched
