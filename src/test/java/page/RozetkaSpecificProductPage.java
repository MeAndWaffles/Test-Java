package page;

import allForTests.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaSpecificProductPage extends BasePage {
    public RozetkaSpecificProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement addProductToTheCartRozetka() {
        return findElementByXpath("//button[contains(@class,'tile ng-star-inserted')]");
    }

    public WebElement displayingTheProductInTheShoppingCartRozetka() {
        return findElementByXpath("//div[@_ngcontent-rz-client-c325]/a[contains(@title,'5908217670762')]");
    }
}
