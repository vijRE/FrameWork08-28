@tag
Feature: Add Customer
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Generate a Customer ID
    
    And User click Add Customer link
    When User provides valid credentials2 "<fname>","<lname>","<email>","<Address>","<Phoneno>"
    

    Examples: 
      | fname | lname | email        | Address | Phoneno    |
      | Va    | Mee   | vj@gmail.com | AndhraP | 1234567890 |
      | V     | M     | VR@gmail.com | Khammam | 1234567890 |
