Feature: Naukri login page

  Scenario: naukri login
    Given User enter the naukri url
    When User enter the username and password
    And User Click on the login button
    Then User is on home page

  Scenario: Naukri Edit Page Update
    Given user Mouse over the mynaukri and clik on edit button
    When User Update the resume
    And User Edit the Resume Headlines
    Then User Successfully complete the update
