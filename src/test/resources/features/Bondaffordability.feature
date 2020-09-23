Feature: Bond Calculator

@AffordabilityCalculator
Scenario Outline: Calculate the bond
Given As a user I launch the private property web page
When I enter the Suburb "<Suburb>"
And I click Search Tab
And I click affordability calculator tab
And I capture Gross Income "<GrossIncome>"
And I capture Net Income "<NetIncome>"
And I capture Total Expenses "<TotalExpenses>"
And I capture Affordability Interest Rate  "<AffordabilityInterestRate>"
And I click Calculate Tab


Examples:
|Suburb      |GrossIncome|NetIncome|TotalExpenses|AffordabilityInterestRate|
|Gauteng     |  100000  |75000    | 23600        | 10                      |