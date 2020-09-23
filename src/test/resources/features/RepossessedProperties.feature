Feature: Searching for Repossesed Properties

 @RepossesedProperties
  Scenario Outline: Seaching for repossesed properties
    Given As a user I launch the private property web page
    When I enter the Suburb "<Suburb>"
    And I click Search Tab
    And I click bank repossessed tab
    And I click Gauteng tab
    And I unticked houses checkbox
    And I click land checkbox
    And I click farm and smallholding checkbox
    And I click security tab
    And I click alarm checkbox
    And I click access gate checkbox
    And I click electric fencing checkbox
    And I click intercom checkbox
    And I click security post checkbox
    And I click amenities tab
    And I click pool checkbox
    And I click pet friendly checkbox
    And I click staff quarters checkbox
    And I click sea view checkbox
    And I click flatlet or garden cottage checkbox
   Then I click apply filters tab


   Examples:
     | Suburb   |
     |Gauteng   |
