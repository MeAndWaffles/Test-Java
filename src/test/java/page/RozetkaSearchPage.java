package page;

import allForTests.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaSearchPage extends BasePage {
    public RozetkaSearchPage(WebDriver driver) {
        super(driver);
    }

    public WebElement goAquaSpeedSpectraRozetka() {
        return findElementByXpath("//a[contains(@title,'Aqua Speed Spectra 2.0 7076')]");
    }
}
