package privateproperty.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import privateproperty.common.CommonMethods;

public class BondRepaymentCalculatorPage extends CommonMethods {
    public BondRepaymentCalculatorPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"PurchasePrice\"]")
    private WebElement txtPurchasePrice;
    @FindBy(xpath = "//*[@id=\"DepositAmount\"]")
    private WebElement txtDepositAmount;
    @FindBy(xpath = "//*[@id=\"InterestRate\"]")
    private WebElement txtInterestRate;
    @FindBy(xpath = "//*[@id=\"calculateButton\"] ")
    private WebElement btnCalculate;

    public boolean capturePurchasePrice(String price){
        if(waitForElementToBeVisible(txtPurchasePrice)){
            txtPurchasePrice.clear();
            captureText(txtPurchasePrice,price);
            return true;
        }
        return false;

    }
    public boolean captureDepositAmount(String depositAmount){
        if(waitForElementToBeVisible(txtDepositAmount)){
            txtDepositAmount.clear();
            captureText(txtDepositAmount,depositAmount);
            return true;
        }
        return false;
    }
    public boolean captureInterestRate(String Interestrate){
        txtInterestRate.clear();
        captureText(txtInterestRate,Interestrate);
        return true;
    }
    public boolean clickButtonCalculate(){
        if(waitForElementToBeVisible(btnCalculate)){
            clickElement(btnCalculate);
            return true;

        }
        return false;
    }
}

