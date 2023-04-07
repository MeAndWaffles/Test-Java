package page;

import allForTests.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaLaptopsPage extends BasePage {
    public RozetkaLaptopsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement chooseSellerRozetka() {
        return findElementByXpath("//li[@_ngcontent-rz-client-c96]//a[contains(@href,'seller=rozetka')]");
    }

    public WebElement chooseASUSRozetka() {
        return findElementByXpath("//li[@_ngcontent-rz-client-c92]//a[contains(.,'ASUS')]");
    }
}
