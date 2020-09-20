package privateproperty.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import privateproperty.common.CommonMethods;

public class BondAffordabilityCalculatorPage extends CommonMethods {
    public BondAffordabilityCalculatorPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "GrossIncome")
    private WebElement txtGrossIncome;
    @FindBy(how = How.ID, using = "NetIncome")
    private WebElement txtNetIncome;
    @FindBy(how = How.ID, using = "TotalExpenses")
    private WebElement txtTotalExpenses;
    @FindBy(how = How.ID, using = "AffordabilityInterestRate")
    private WebElement txtAffordabilityInterestRate;
    @FindBy(how = How.ID, using = "affordCalculateButton")
    private WebElement btnCalculate;

    public boolean enterGrossIncome(String grossIncome) {
        if (waitForElementToBeVisible(txtGrossIncome)) {
            captureText(txtGrossIncome, grossIncome);
            return true;
        }
        return false;
    }

    public boolean enterNetIncome(String netIncome) {
        if (waitForElementToBeVisible(txtNetIncome)) {
            captureText(txtNetIncome, netIncome);
            return true;
        }
        return false;
    }

    public boolean enterTotalExpenses(String totalexpenses) {
        if (waitForElementToBeVisible(txtTotalExpenses)) {
            captureText(txtTotalExpenses, totalexpenses);
            return true;
        }
        return false;
    }

    public boolean enterAffordabilityInterestRate(String affordabilityInterestRate) {
        txtAffordabilityInterestRate.clear();
        if (waitForElementToBeVisible(txtAffordabilityInterestRate)) {
            captureText(txtAffordabilityInterestRate, affordabilityInterestRate);
            return true;
        }
        return false;
    }
    public boolean clickBtnCalculate(){
        if (waitForElementToBeVisible(btnCalculate)){
            clickElement(btnCalculate);
            return true;
        }
        return false;

    }
}
