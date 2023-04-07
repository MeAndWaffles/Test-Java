package page;

import allForTests.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikipediaSeleniumPage extends BasePage {

    public WikipediaSeleniumPage(WebDriver driver) {
        super(driver);
    }

    public WebElement changeToEnglishWiki() {
        return findElementByXpath("//a[@lang='en']");
    }

    public WebElement openTheListBoxOfLanguagesWiki() {
        return findElementByXpath("//input[contains(@id,'p-lang')]/parent::*");
    }

    public WebElement inTheListBoxOfLanguagesUkWiki() {
        return findElementByXpath("//div[contains(@class,'quicklist')]//a[@lang='uk']");
    }
}
