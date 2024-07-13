Feature: Test OpenCart application

  Scenario: Test Registration process for new User
    Given Open Registration page
    When User enters all details
      | fname  | lname | email                 | telephone  | password   | cpassword  |
      | Satish | Yadav | satish12321@gmail.com | 8976128756 | satish@876 | satish@876 |
    And User click on newlatter as Yes
    And User check the privacy policy
    And Click on continue button
    Then User should register successfully
