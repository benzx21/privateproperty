package privateproperty.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import privateproperty.common.CommonMethods;

public class BankPropertiesForSalePage extends CommonMethods {
    public BankPropertiesForSalePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"provinceSelectorContainer\"]/a[2]/div[1]/span")
    private WebElement gautengtab;
    @FindBy(xpath = "//*[@id=\"sidePanelResultsFiltersContainer\"]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[1]/div")
    private WebElement houseschekbox;
    @FindBy(xpath = "//*[@id=\"sidePanelResultsFiltersContainer\"]/div/div/div[1]/div[2]/div[3]/div/div[4]/div[1]/div")
    private WebElement landchekbox;
    @FindBy(xpath = "//*[@id=\"sidePanelResultsFiltersContainer\"]/div/div/div[1]/div[2]/div[3]/div/div[5]/div[1]/div")
    private WebElement farmAndSmallholdinsCheckbox;
    @FindBy(xpath = "//*[@id=\"sidePanelResultsFiltersContainer\"]/div/div/div[1]/div[7]/div[1]/div[2]")
    private WebElement securityTab;
    @FindBy(xpath = "//*[@id=\"sidePanelResultsFiltersContainer\"]/div/div/div[1]/div[7]/div[3]/div/div[1]/div[2]")
    private WebElement alarmCheckbox;
    @FindBy(xpath = "//*[@id=\"sidePanelResultsFiltersContainer\"]/div/div/div[1]/div[7]/div[3]/div/div[2]/div[2]")
    private WebElement accessGateCheckbox;
    @FindBy(xpath = "//*[@id=\"sidePanelResultsFiltersContainer\"]/div/div/div[1]/div[7]/div[3]/div/div[3]/div[2]")
    private WebElement electricFencingCheckbox;
    @FindBy(xpath = "//*[@id=\"sidePanelResultsFiltersContainer\"]/div/div/div[1]/div[7]/div[3]/div/div[4]/div[2]")
    private WebElement intercomCheckbox;
    @FindBy(xpath = "//*[@id=\"sidePanelResultsFiltersContainer\"]/div/div/div[1]/div[7]/div[3]/div/div[5]/div[2]")
    private WebElement securityPostCheckbox;
    @FindBy(xpath = "//*[@id=\"sidePanelResultsFiltersContainer\"]/div/div/div[1]/div[8]/div[1]/div[2]")
    private WebElement ammenitiesTab;
    @FindBy(xpath = "//*[@id=\"sidePanelResultsFiltersContainer\"]/div/div/div[1]/div[8]/div[3]/div/div[1]/div[2]")
    private WebElement poolCheckbox;
    @FindBy(xpath = "//*[@id=\"sidePanelResultsFiltersContainer\"]/div/div/div[1]/div[8]/div[3]/div/div[2]/div[2]")
    private WebElement petFriendlyCheckbox;
    @FindBy(xpath = "//*[@id=\"sidePanelResultsFiltersContainer\"]/div/div/div[1]/div[8]/div[3]/div/div[3]/div[2]")
    private WebElement staffQuartersCheckbox;
    @FindBy(xpath = "//*[@id=\"sidePanelResultsFiltersContainer\"]/div/div/div[1]/div[8]/div[3]/div/div[4]/div[2]")
    private WebElement seaViewCheckbox;
    @FindBy(xpath = "//*[@id=\"sidePanelResultsFiltersContainer\"]/div/div/div[1]/div[8]/div[3]/div/div[5]/div[2]")
    private WebElement flatletGardenCottageCheckbox;
    @FindBy(xpath = "//*[@id=\"sidePanelResultsFiltersContainer\"]/div/div/div[2]/button")
    private WebElement applyFiltersTab;

    public boolean clickGautengTab() {
        if (waitForElementToBeVisible(gautengtab)) {
            clickElement(gautengtab);
            return true;
        }
        return false;
    }

    public boolean clickHousesCheckBox() {
        if (waitForElementToBeVisible(houseschekbox)) {
            clickElement(houseschekbox);
            return true;
        }
        return false;
    }

    public boolean clickLandCheckBox() {
        if (waitForElementToBeVisible(landchekbox)) {
            clickElement(landchekbox);
            return true;
        }
        return false;
    }

    public boolean clickFarmAndSmallholdings() {
        if (waitForElementToBeVisible(farmAndSmallholdinsCheckbox)) {
            clickElement(farmAndSmallholdinsCheckbox);
            return true;
        }
        return false;
    }

    public boolean clickSecurityTab() {
        if (waitForElementToBeVisible(securityTab)) {
            clickElement(securityTab);
            return true;
        }
        return false;
    }

    public boolean clickAlarmCheckbox() {
           if (waitForElementToBeVisible(alarmCheckbox)) {
            clickElement(alarmCheckbox);
            return true;
        }
        return false;
    }

    public boolean clickAccessGateCheckbox() {
        if (waitForElementToBeVisible(accessGateCheckbox)) {
            clickElement(accessGateCheckbox);
            return true;
        }
        return false;
    }

    public boolean clickElectricFencingCheckbox() {
        if (waitForElementToBeVisible(electricFencingCheckbox)) {
            clickElement(electricFencingCheckbox);
            return true;
        }
        return false;
    }

    public boolean clickIntercomCheckbox() {
        if (waitForElementToBeVisible(intercomCheckbox)) {
            clickElement(intercomCheckbox);
            return true;
        }
        return false;
    }

    public boolean clickSecurityPostCheckbox() {
        if (waitForElementToBeVisible(securityPostCheckbox)) {
            clickElement(securityPostCheckbox);
            return true;
        }
        return false;
    }

    public boolean clickAmmenitiesTab() {
        if (waitForElementToBeVisible(ammenitiesTab)) {
            clickElement(ammenitiesTab);
            return true;
        }
        return false;

    }

    public boolean clickPoolCheckbox() {
        if (waitForElementToBeVisible(poolCheckbox)) {
            clickElement(poolCheckbox);
            return true;
        }
        return false;
    }

    public boolean clickPetFreindlyCheckbox() {
        if (waitForElementToBeVisible(petFriendlyCheckbox)) {
            clickElement(petFriendlyCheckbox);
            return true;
        }
        return false;
    }

    public boolean clickStaffQurtersCheckbox() {
        if (waitForElementToBeVisible(staffQuartersCheckbox)) {
            clickElement(staffQuartersCheckbox);
            return true;
        }
        return false;
    }
    public boolean clickSeaViewCheckbox() {
        if (waitForElementToBeVisible(seaViewCheckbox)) {
            clickElement(seaViewCheckbox);
            return true;
        }
        return false;
    }
    public boolean clickFlatletandGardenCottageCheckbox() {
        if (waitForElementToBeVisible(flatletGardenCottageCheckbox)) {
            clickElement(flatletGardenCottageCheckbox);
            return true;
        }
        return false;
    }
    public boolean clickApplyFiltersbutton() {
        if (waitForElementToBeVisible(applyFiltersTab)) {
            clickElement(applyFiltersTab);
            return true;
        }
        return false;
    }
}