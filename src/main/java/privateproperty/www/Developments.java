package privateproperty.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import privateproperty.common.CommonMethods;

public class Developments extends CommonMethods {
    public Developments(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Western Cape']")
    private WebElement westerCapeTab;

    @FindBy(xpath = "//*[@id=\"developmentResults\"]/div/div/div[2]/div[2]/div[1]/ul/li[4]/a")
    private WebElement capeTownTab;

    public boolean clickWesternCapeDevelopmentsTab() {
        if (waitForElementToBeVisible(westerCapeTab)) {
            clickElement(westerCapeTab);
            return true;
        }
        return false;
    }

   }