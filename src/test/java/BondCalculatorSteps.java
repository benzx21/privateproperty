import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import privateproperty.www.BondRepaymentCalculatorPage;
import privateproperty.www.HomePage;
import privateproperty.www.LetsFindRightMatchPage;

public class BondCalculatorSteps extends BaseClass{
    @Given("^As a user I launch the private property web page$")
    public void asAUserILaunchThePrivatePropertyWebPage() {
    openBrowser(endPoint);

    }

    @When("^I enter the Suburb \"([^\"]*)\"$")
    public void iEnterTheSuburb(String suburb){
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue("Enter Suburb",homePage.captureSuburbField(suburb));

    }
    @And("^I click Seach Tab$")
    public void iClickSeachTab() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue("Click Search Tab",homePage.clickSearchTab());
    }

    @And("^I click bond calculator tab$")
    public void iClickBondCalculatorTab() {
        LetsFindRightMatchPage letsFindRightMatchPage = new LetsFindRightMatchPage(driver);
        Assert.assertTrue("Click bond calculator tab",letsFindRightMatchPage.clickbondcalculatortab());
    }

    @And("^I capture Purchae Price \"([^\"]*)\"$")
    public void iCapturePurchaePrice(String price) {
        BondRepaymentCalculatorPage bondRepaymentCalculatorPage = new BondRepaymentCalculatorPage(driver);
        Assert.assertTrue("Capture Purchase Price ",bondRepaymentCalculatorPage.capturePurchasePrice(price));

    }

    @And("^I capture Deposit Amount \"([^\"]*)\"$")
    public void iCaptureDepositAmount(String depositAmount){
        BondRepaymentCalculatorPage bondRepaymentCalculatorPage = new BondRepaymentCalculatorPage(driver);
        Assert.assertTrue("Capture Deposit amount",bondRepaymentCalculatorPage.captureDepositAmount(depositAmount));


    }

    @And("^I capture Interest Rate  \"([^\"]*)\"$")
    public void iCaptureInterestRate(String InterestRate) {
        BondRepaymentCalculatorPage bondRepaymentCalculatorPage = new BondRepaymentCalculatorPage(driver);
        Assert.assertTrue("Capture Interest Rate",bondRepaymentCalculatorPage.captureInterestRate(InterestRate));
    }

    @And("^I click Calculate button$")
    public void iClickCalculateButton() {
        BondRepaymentCalculatorPage bondRepaymentCalculatorPage = new BondRepaymentCalculatorPage(driver);
        Assert.assertTrue("Click the calculate button",bondRepaymentCalculatorPage.clickButtonCalculate());
    }
}
