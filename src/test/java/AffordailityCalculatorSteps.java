
import cucumber.api.java.en.And;
import org.junit.Assert;
import privateproperty.www.BondAffordabilityCalculatorPage;
import privateproperty.www.LetsFindRightMatchPage;

public class AffordailityCalculatorSteps extends BaseClass{
    @And("^I click affordability calculator tab$")
    public void iClickAffordabilityCalculatorTab() {
        LetsFindRightMatchPage letsFindRightMatchPage = new LetsFindRightMatchPage(driver);
        Assert.assertTrue("Click affordability tab",letsFindRightMatchPage.clickAffordabilityCalculatorTab());
    }

    @And("^I capture Gross Income \"([^\"]*)\"$")
    public void iCaptureGrossIncome(String grossIncome){
        BondAffordabilityCalculatorPage bondAffordabilityCalculatorPage = new BondAffordabilityCalculatorPage(driver);
        Assert.assertTrue("Enter Gross Income",bondAffordabilityCalculatorPage.enterGrossIncome(grossIncome));

    }

    @And("^I capture Net Income \"([^\"]*)\"$")
    public void iCaptureNetIncome(String netIncome){
    BondAffordabilityCalculatorPage bondAffordabilityCalculatorPage = new BondAffordabilityCalculatorPage(driver);
    Assert.assertTrue("Enter Net Income",bondAffordabilityCalculatorPage.enterNetIncome(netIncome));

    }

    @And("^I capture Total Expenses \"([^\"]*)\"$")
    public void iCaptureTotalExpenses(String totalexpenses) {
        BondAffordabilityCalculatorPage bondAffordabilityCalculatorPage = new BondAffordabilityCalculatorPage(driver);
        Assert.assertTrue("Enter Total Expenses",bondAffordabilityCalculatorPage.enterTotalExpenses(totalexpenses));
    }

    @And("^I capture Affordability Interest Rate  \"([^\"]*)\"$")
    public void iCaptureAffordabilityInterestRate(String affordabilityInterestRate){
        BondAffordabilityCalculatorPage bondAffordabilityCalculatorPage = new BondAffordabilityCalculatorPage(driver);
        Assert.assertTrue("Capture affordable Interest Rate",bondAffordabilityCalculatorPage.enterAffordabilityInterestRate(affordabilityInterestRate));
    }

    @And("^I click Calculate Tab$")
    public void iClickCalculateTab() {
        BondAffordabilityCalculatorPage bondAffordabilityCalculatorPage = new BondAffordabilityCalculatorPage(driver);
        Assert.assertTrue("Click Calculate button",bondAffordabilityCalculatorPage.clickBtnCalculate());
    }
}
