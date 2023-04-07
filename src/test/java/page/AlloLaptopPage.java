package page;

import allForTests.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlloLaptopPage extends BasePage {
    public AlloLaptopPage(WebDriver driver) {
        super(driver);
    }

    public WebElement addToComparisonAsusK55VAllo() {
        return findElementByXpath("//div[@data-product-id='3332296']//div[@class='compare']");
    }

    public WebElement addToComparisonEVOOEVLaptop141Allo() {
        return findElementByXpath("//div[@data-product-id='5488884']//div[@class='compare']");
    }

    public WebElement goToComparisonAllo() {
        return findElementByXpath("//a[@class='mh-button mh-compare']");
    }
}
