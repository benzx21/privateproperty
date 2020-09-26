package privateproperty.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import privateproperty.common.CommonMethods;

public class WesternCapeDevelopmentsPage extends CommonMethods {
    public WesternCapeDevelopmentsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"developmentResults\"]/div/div/div[2]/div[2]/div[1]/ul/li[4]/a")
    private WebElement capetownTab;

    public boolean clickCapeTownTab(){
        if (waitForElementToBeVisible(capetownTab)){
            clickElement(capetownTab);
            return true;
        }
        return false;
    }

}
