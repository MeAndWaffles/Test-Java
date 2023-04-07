package page;

import allForTests.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AlloComparisonPage extends BasePage {
    public AlloComparisonPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> listProductInComparisonAllo() {
        return findElementsByXpath("//div[@class='products-layout__item']");
    }

}
