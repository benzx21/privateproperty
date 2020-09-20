package privateproperty.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import privateproperty.common.CommonMethods;

public class HomePage extends CommonMethods {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = " //*[@id=\"homePageAutoComplete\"]/div/div/div/div[2]/form/div/input[1]")
    private WebElement txtSuburb;
    //*[@id="homePageAutoComplete"]/div/div/div/div[2]/form/div/div/div[1]/span[1]
    @FindBy(xpath = "//*[@id=\"homePageAutoComplete\"]/div/div/div/div[2]/form/div/button")
    private WebElement btnSearch;
    @FindBy(xpath = "//*[@id=\"desktop\"]/footer/div[1]/div[1]/ul/li[7]/a")
    private WebElement bankRepossesions;

    public boolean captureSuburbField(String suburb){
        if(waitForElementToBeVisible(txtSuburb)){
            captureText(txtSuburb,suburb);
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
}
