import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;
import privateproperty.www.HomePage;

public class SearchProvinceSteps extends BaseClass {
    @When("^I enter the Province \"([^\"]*)\"$")
    public void iEnterTheProvince(String province)  {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue("Capture the province",homePage.captureProvinceField(province));
    }

}
