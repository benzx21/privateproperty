package privateproperty.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import privateproperty.common.CommonMethods;

public class LetsFindRightMatchPage extends CommonMethods {
    public LetsFindRightMatchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[text()='Bond Calculator']")
    private WebElement bondCalculatorTab;
    @FindBy(xpath = "//a[text()='Affordability Calculator']")
    private WebElement affordabilityCalculatorTab;

    @FindBy(xpath = "//a[text()='Developments']")
    private WebElement developmentsTab;

    public boolean clickBondcalculatortab(){
        if(waitForElementToBeVisible(bondCalculatorTab)){
            clickElement(bondCalculatorTab);
            return true;
        }
        return false;
    }

    public boolean clickAffordabilityCalculatorTab(){
        if(waitForElementToBeVisible(affordabilityCalculatorTab)){
            clickElement(affordabilityCalculatorTab);
            return true;
        }
        return false;
    }
    public boolean clickDevelopmentTab(){
        if (waitForElementToBeVisible(developmentsTab)){
            clickElement(developmentsTab);
            return true;
        }
        return false;
    }
}
