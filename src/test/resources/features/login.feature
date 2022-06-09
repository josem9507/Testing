#language: en

Feature: : register form
  I a new client
  I want to register my data
  to have my updated information
  Scenario: : realizar Login
    Given That the DEMOQALOGIN website is available
    When I complete the fields
    And I click on login
    Then my login is successful