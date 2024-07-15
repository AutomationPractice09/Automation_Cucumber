@All
Feature: Test Amazon Application

  Background: 
    Given Open ThemeForest application

@Firstpage
  Scenario: Test Title of Firstpage
    When User get the title of Fomepage
    Then Title of Fome page should be matched

@Code
  Scenario: Test Title of Code page
    When User Open the Code page
    And User get the title of Code page
    Then Title of Code page should be matched

@Video
  Scenario: Test Title of Video page
    When User Open the Video page
    And User get the title of Video page
   Then Title of Mobile page Video be matched

@ignore
  Scenario: Test Title of Audio page
    When User Open the Audio page
    And User get the title of Audio page
    Then Title of Audio page should be matched
