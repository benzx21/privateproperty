import cucumber.api.java.en.And;
import org.junit.Assert;
import privateproperty.www.Developments;
import privateproperty.www.LetsFindRightMatchPage;
import privateproperty.www.WesternCapeDevelopmentsPage;

public class NewDevelopmentsSteps extends BaseClass{
    @And("^I click Development Tab$")
    public void iClickDevelopmentTab() {
        LetsFindRightMatchPage letsFindRightMatchPage = new LetsFindRightMatchPage(driver);
        Assert.assertTrue("Click Development Tab",letsFindRightMatchPage.clickDevelopmentTab());
    }

    @And("^I click Western Cape Tab$")
    public void iClickWesternCapeTab() {
        Developments developments = new Developments(driver);
        Assert.assertTrue("Click Western Cape tab", developments.clickWesternCapeDevelopmentsTab());
    }

    @And("^I click Capetown Tab$")
    public void iClickCapetownTab() {
        WesternCapeDevelopmentsPage westernCapeDevelopmentsPage = new WesternCapeDevelopmentsPage(driver);
        Assert.assertTrue("Click Capetown Tab",westernCapeDevelopmentsPage.clickCapeTownTab());
    }
}
