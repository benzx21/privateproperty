Feature: Bond Calculator

  @BondCalculator
  Scenario Outline: Calculate the bond
    Given As a user I launch the private property web page
    When I enter the Suburb "<Suburb>"
    And I click Seach Tab
    And I click bond calculator tab
    And I capture Purchae Price "<PurchasePrice>"
    And I capture Deposit Amount "<DepositAmount>"
    And I capture Interest Rate  "<InterestRate>"
    And I click Calculate button


    Examples:
      |Suburb      |PurchasePrice|DepositAmount|InterestRate             |
      |Gauteng     |  1000000     |25000       |10                       |