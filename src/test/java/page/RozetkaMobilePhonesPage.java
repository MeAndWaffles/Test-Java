package page;

import allForTests.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RozetkaMobilePhonesPage extends BasePage {
    public RozetkaMobilePhonesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement goToPhoneMPUR3RX() {
        return findElementByXpath("//a[contains(@title,'MPUR3RX/A')]");
    }

    public WebElement changeTheColorToEedPhoneRozetka() {
        return findElementByXpath("//a[contains(@href,'product-red')]/parent::*/parent::*");
    }

    public WebElement goPhoneCharacteristicsRozetka() {
        return findElementByXpath("//li/a[contains(@href,'characteristics')]");
    }

    public List<WebElement> listCharacteristicsRozetka() {
        return findElementsByXpath("//section/h3[@class='characteristics-full__sub-heading ng-star-inserted']");
    }
}
