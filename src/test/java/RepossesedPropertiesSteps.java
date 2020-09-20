import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import privateproperty.www.BankPropertiesForSalePage;
import privateproperty.www.BondAffordabilityCalculatorPage;
import privateproperty.www.HomePage;

public class RepossesedPropertiesSteps extends BaseClass{
    @And("^I click bank repossessed tab$")
    public void iClickBankRepossessedTab()  {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue("Click Bank Repossesed Propert tab", homePage.clickBankRepossessionsTab());

    }

    @And("^I click Gauteng tab$")
    public void iClickGautengTab() {
        BankPropertiesForSalePage bankPropertiesForSalePage = new BankPropertiesForSalePage(driver);
        Assert.assertTrue("Click Gauteng Province", bankPropertiesForSalePage.clickGautengTab());
    }

    @And("^I unticked houses checkbox$")
    public void iUntickedHousesCheckboxTab() {
        BankPropertiesForSalePage bankPropertiesForSalePage = new BankPropertiesForSalePage(driver);
        Assert.assertTrue("Untick house checkbox", bankPropertiesForSalePage.clickHousesCheckBox());
    }

    @And("^I click land checkbox$")
    public void iClickLandCheckboxTab() {
        BankPropertiesForSalePage bankPropertiesForSalePage = new BankPropertiesForSalePage(driver);
        Assert.assertTrue("Untick Land Checkbox",bankPropertiesForSalePage.clickLandCheckBox());
    }

    @And("^I click farm and smallholding checkbox$")
    public void iClickFarmAndSmallholdingTab() {
        BankPropertiesForSalePage bankPropertiesForSalePage = new BankPropertiesForSalePage(driver);
        Assert.assertTrue("Untick farm and small holdings checkbox",bankPropertiesForSalePage.clickFarmAndSmallholdings());
    }

    @And("^I click security tab$")
    public void iClickSecurityTab() {
        BankPropertiesForSalePage bankPropertiesForSalePage = new BankPropertiesForSalePage(driver);
        Assert.assertTrue("Click Security tab",bankPropertiesForSalePage.clickSecurityTab());
    }


    @And("^I click alarm checkbox$")
    public void iClickAlarmCheckbox() {
        BankPropertiesForSalePage bankPropertiesForSalePage = new BankPropertiesForSalePage(driver);
        Assert.assertTrue("click alarm checkbox ",bankPropertiesForSalePage.clickAlarmCheckbox());
    }

    @And("^I click access gate checkbox$")
    public void iClickAccessGateCheckbox() {
        BankPropertiesForSalePage bankPropertiesForSalePage = new BankPropertiesForSalePage(driver);
        Assert.assertTrue("click access gate checkbox", bankPropertiesForSalePage.clickAccessGateCheckbox());

    }

    @And("^I click electric fencing checkbox$")
    public void iClickElectricFencingCheckbox() {
        BankPropertiesForSalePage bankPropertiesForSalePage = new BankPropertiesForSalePage(driver);
        Assert.assertTrue("click electric fencing", bankPropertiesForSalePage.clickElectricFencingCheckbox());
    }

    @And("^I click intercom checkbox$")
    public void iClickIntercomCheckbox() {
        BankPropertiesForSalePage bankPropertiesForSalePage = new BankPropertiesForSalePage(driver);
        Assert.assertTrue("click intercom checkbox", bankPropertiesForSalePage.clickIntercomCheckbox());
    }

    @And("^I click security post checkbox$")
    public void iClickSecurityPostCheckbox() {
        BankPropertiesForSalePage bankPropertiesForSalePage = new BankPropertiesForSalePage(driver);
        Assert.assertTrue("click security post", bankPropertiesForSalePage.clickSecurityPostCheckbox());
    }

    @And("^I click amenities tab$")
    public void iClickAmenitiesTab() {
        BankPropertiesForSalePage bankPropertiesForSalePage = new BankPropertiesForSalePage(driver);
        Assert.assertTrue("click amenities checkbox", bankPropertiesForSalePage.clickAmmenitiesTab());
    }

    @And("^I click pool checkbox$")
    public void iClickPoolCheckbox() {
        BankPropertiesForSalePage bankPropertiesForSalePage = new BankPropertiesForSalePage(driver);
        Assert.assertTrue("click pool checkbox", bankPropertiesForSalePage.clickPoolCheckbox());
    }

    @And("^I click pet friendly checkbox$")
    public void iClickPetFriendlyCheckbox() {
        BankPropertiesForSalePage bankPropertiesForSalePage = new BankPropertiesForSalePage(driver);
        Assert.assertTrue("click pet friendly", bankPropertiesForSalePage.clickPetFreindlyCheckbox());
    }

    @And("^I click staff quarters checkbox$")
    public void iClickStaffQuartersCheckbox() {
        BankPropertiesForSalePage bankPropertiesForSalePage = new BankPropertiesForSalePage(driver);
        Assert.assertTrue("click staff quarters checkbox", bankPropertiesForSalePage.clickStaffQurtersCheckbox());
    }

    @And("^I click sea view checkbox$")
    public void iClickSeaViewCheckbox() {
        BankPropertiesForSalePage bankPropertiesForSalePage = new BankPropertiesForSalePage(driver);
        Assert.assertTrue("click sea view ",bankPropertiesForSalePage.clickSeaViewCheckbox());
    }

    @And("^I click flatlet or garden cottage checkbox$")
    public void iClickFlatletOrGardenCottageCheckbox() {
        BankPropertiesForSalePage bankPropertiesForSalePage = new BankPropertiesForSalePage(driver);
        Assert.assertTrue("click flatlet or garden cottage checkbox", bankPropertiesForSalePage.clickFlatletandGardenCottageCheckbox());

    }

    @Then("^I click apply filters tab$")
    public void iClickApplyFiltersTab() {
        BankPropertiesForSalePage bankPropertiesForSalePage = new BankPropertiesForSalePage(driver);
        Assert.assertTrue("click aooly filters tab", bankPropertiesForSalePage.clickApplyFiltersbutton());
    }
}
