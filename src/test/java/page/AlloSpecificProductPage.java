package page;

import allForTests.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AlloSpecificProductPage extends BasePage {
    public AlloSpecificProductPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> listBookmarksForAdditionalInformationAllo() {
        return findElementsByXpath("//li[@class='p-tabs__tab-item']");
    }

    public WebElement fildTheSpecificNameOfTheOpenedProduct() {
        return findElementByXpath("//h1[.='Xiaomi Redmi Note 12 Pro 8/256 Graphite Gray']");
    }

    public WebElement goToPurchaseOfSpecificProductAllo() {
        return findElementByXpath("//button[@id='product-buy-button']");
    }

    public WebElement productDisplayFieldInTheShoppingCartWindowAllo() {
        return findElementByXpath("//p/span[contains(.,'Xiaomi Redmi Note 12 Pro 8/256 Graphite Gray')]");
    }
}
