import cucumber.api.java.en.And;
import org.junit.Assert;
import privateproperty.www.HomePage;

public class CapeTownDevelopmentsSteps extends BaseClass{
    @And("^I click Developments button$")
    public void iClickDevelopmentsButton() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue("Click Developments", homePage.clickDevelopmentTab());
    }
}
