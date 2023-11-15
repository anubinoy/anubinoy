Feature: Feature to test Register functionality
  
  @sanity
  Scenario Outline: Check register with invalid credentials
    Given The user opens Register Page
    When The user enters <username> , <password> and <confirmpassword>
    And Clicks on register button
    Then User is navigated to the homepage

    Examples: 
      | username    | password     | confirmpassword |
      |             |              |                 |
      | NinjaCoders |              |                 |
      | NinjaCoders | SDET135batch |                 |
      |hgjhjh_(8)   |              |                 |
      | NinjaCoders | SDET135batch | SDET136batcc    |
      | NinjaCoders | SDET10       |                 |
      | NinjaCoders |      7860946 |                 |
      | NinjaCoders | SDET135batch | SDET135batch    |