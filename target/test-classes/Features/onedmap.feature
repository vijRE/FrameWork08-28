@tag
Feature: Add Customer
  I want to use this template for my feature file

  @tag1
  Scenario: Generate Customer ID
    
    And User click Add Customer link
    When User provides valid credentials5
      | fname   | Meena          |
      | lname   | Meen           |
      | email   | re@yahoo.com   |
      | Address | Andhra Pradesh |
      | Phoneno |     7894561230 |
    
