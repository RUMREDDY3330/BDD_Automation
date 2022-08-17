Feature: Guru99 Registaration

  Scenario: Guru99 Registeration
    Given User given the Url and user is on home page
    When User Click on the Register button to Register
    And User give the valide credentials and "<un>" and "<pwd>"
    Then User successfully Registered in guru99
  

    #Examples:
    #|  un    |  pwd  |
    #| amit1  | amit1 |
    #| amit2  | amit2 |
    #| amit3  | amit3 |
   