package page;

import allForTests.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlloHomePage extends BasePage {
    public AlloHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement inTheSearchPageAllo() {
        return findElementByXpath("//input[@id='search-form__input']");
    }
}
