Feature: New Develelopments

@NewDevelopments
Scenario Outline: Seaching for new developments projects in CapeTown
Given As a user I launch the private property web page
When I enter the Suburb "<Suburb>"
  And I click Search Tab
  And I click Development Tab
  And I click Western Cape Tab
  #And I click Capetown Tab

  Examples:
    | Suburb      |
    |Western Cape |