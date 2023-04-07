package page;

import allForTests.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaGamingMonitorsPage extends BasePage {
    public RozetkaGamingMonitorsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement addToComparisonS28AG702() {
        return findElementByXpath("//div[@data-goods-id='331937236']//rz-app-compare-button");
    }

    public WebElement addToComparisonC27F390F() {
        return findElementByXpath("//div[@data-goods-id='8520968']//rz-app-compare-button");
    }

    public WebElement openTheSmallComparisonWindowRozetka() {
        return findElementByXpath("//button[@_ngcontent-rz-client-c54]");
    }

    public WebElement twoMonitorsInComparisonRozetka() {
        return findElementByXpath("//span[@class='comparison-modal__quantity'][.='2']");
    }
}
