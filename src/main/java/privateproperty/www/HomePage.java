package privateproperty.www;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import privateproperty.common.CommonMethods;

public class HomePage extends CommonMethods {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@name='locationPhrase']")
    private WebElement txtSuburb;
    @FindBy(xpath = "//input[@name='locationPhrase']")
    private WebElement txtProvince;
    @FindBy(xpath = "//button[@name='search']")
    private WebElement btnSearch;
    @FindBy(xpath = "//a[text()='Bank Repossessions']")
    private WebElement bankRepossesions;
    @FindBy(xpath = "//a[text()='Developments']")
    private WebElement btnDevelopment;

    public boolean captureSuburbField(String suburb){
        if(waitForElementToBeVisible(txtSuburb)){
            captureText(txtSuburb,suburb);
            return true;
        }
        return false;
    }
    public boolean captureProvinceField(String province) {
        if (waitForElementToBeVisible(txtProvince)){
            captureText(txtProvince, province);
            txtSuburb.sendKeys(Keys.ARROW_DOWN);
            txtSuburb.sendKeys(Keys.ENTER);
            return true;
        }
        return false;
    }
  public boolean clickSearchTab(){
        if(waitForElementToBeVisible(btnSearch)){
            clickElement(btnSearch);
            return true;
        }
        return false;
  }
    public boolean clickBankRepossessionsTab(){
        if(waitForElementToBeVisible(bankRepossesions)){
            clickElement(bankRepossesions);
            return true;

        }
        return false;
    }
    public boolean clickDevelopmentTab(){
        if(waitForElementToBeVisible(btnDevelopment)){
            clickElement(btnDevelopment);
            return true;

        }
        return false;
    }
}
