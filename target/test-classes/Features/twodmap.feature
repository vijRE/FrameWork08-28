@tag
Feature: Add Customer
  I want to use this template for my feature file

  @tag2
  Scenario: Generate Customer ID
   
    And User click Add Customer link
    When User provides valid credentials6
      | fname   | lname | email          | Address | Phoneno    |
      | twoDMap | Mee   | vr@yahoo.com   | AP      | 1234567890 |
      | twoDMap | Loki  | mee@gmail.com  | TN      | 1234567890 |
      | twoDMap | Nae   | nare@yahoo.com | UP      | 1234567890 |
      | twoDMap | Nani  | kar@gmail.com  | JK      | 1234567890 |
    