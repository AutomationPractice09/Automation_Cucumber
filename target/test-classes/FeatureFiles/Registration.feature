Feature: Test OpenCart application

  Scenario: Test Registration process for new User
    Given Open Registration page
    When User enters all details
      | fname  | lname | email                 | telephone  | password   | cpassword  |
      | Madhav | Ray   | madhav12321@gmail.com | 8976121265 | madhav@876 | madhav@876 |
    And User click on newlatter as Yes
    And User check the privacy policy
    And Click on continue button
    Then User should register successfully

  Scenario: Login with Regostered user
    Given Open cartLogin page
    When User enter email "madhav12321@gmail.com" and password "madhav@876"
    And User enter login button
    Then User should successfully logged in.
