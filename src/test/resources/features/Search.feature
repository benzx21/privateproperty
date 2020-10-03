Feature:Search Province

  @SearchProvince
  Scenario Outline: Search for the Province
    Given As a user I launch the private property web page
    When I enter the Province "<Province>"
    #And I click Search Tab
    Examples:
      | Province |
      |NorthWest   |