Feature: Guru99 login

  Scenario: Guru99 Registeration
    Given User given the Url and user is on home page
    When User Click on the Register button to Register
    And User give the valide credentials and username and password
    Then User successfully Registered in guru99

  Scenario Outline: Login with different credentials.
    Given User is on Guru99 demo application
    When User enter the "<un>" and "<pwd>"
    And User clicks on the login button..
    Then User is on the home page

    Examples: 
      | un    | pwd   |
      | amit1 | amit1 |
      | amit2 | amit2 |
     #When USer enter the "<un>" and "<pwd>"
