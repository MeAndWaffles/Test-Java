package page;

import allForTests.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goHomePage() {
        driver.get("https://www.google.com/");
    }

    //поле пошуку в Google
    public WebElement inTheSearchFieldGoogle() {
        return findElementByXpath("//*[@name='q']");
    }

    public WebElement inTheSearchPageWikiUa() {
        return findElementByXpath("//h3[contains(@class,'xvfwl')]");
    }

    public WebElement inTheSearchPageRozetka() {
        return findElementByXpath("//a[contains(@href,'rozetka.com.ua')]/h3[contains(@class,'DKV0Md')]");
    }

    public List<WebElement> list() {
        return findElementsByXpath("//a[@href='https://allo.ua/'][contains(@data-ved,'oECA0QAQ')]");
    }

    public WebElement inTheSearchPageAllo() {
        return findElementByXpath("//h3[@class='LC20lb MBeuO DKV0Md']/parent::a[@href='https://allo.ua/']");
    }
}
