package allForTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.*;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class BasePage {
    int BASIC_TIME = 10;

    public WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public List<WebElement> waitVisibilityOfAllElementsLocatedBy(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
    }

    public List<WebElement> waitClickOfAllElementsLocatedBy(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
        return Collections.singletonList(wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator))));
    }

    public WebElement waitElementToBeClickable(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    public WebElement findElementByXpath(String locator) {
        return waitElementToBeClickable(locator);
    }

    public List<WebElement> findElementsByXpath(String locator) {
        return waitVisibilityOfAllElementsLocatedBy(locator);
    }

    public List<WebElement> findElementsByXpathClick(String locator) {
        return waitClickOfAllElementsLocatedBy(locator);
    }

    public WikipediaHomePage getWikipedia() {
        return new WikipediaHomePage(driver);
    }
    public WikipediaSeleniumPage getWikiSelenium() {
        return new WikipediaSeleniumPage(driver);
    }

    public WikipediaCurrentEventsWiki getWikiCurrentEvents() {
        return new WikipediaCurrentEventsWiki(driver);
    }

    public RozetkaHomePage getRozetkaHomePage() {
        return new RozetkaHomePage(driver);
    }

    public RozetkaLaptopsPage getRozetkaLaptopsPage() {
        return new RozetkaLaptopsPage(driver);
    }

    public RozetkaMobilePhonesPage getRozetkaMobilePhonesPage() { return new RozetkaMobilePhonesPage(driver);}

    public RozetkaGamingMonitorsPage getRozetkaGamingMonitorsPage(){
        return new RozetkaGamingMonitorsPage(driver);
    }
    public RozetkaLoginPage getRozetkaLoginPage(){
        return new RozetkaLoginPage(driver);
    }

    public RozetkaRegisterPage  getRozetkaRegisterPage(){
        return new RozetkaRegisterPage(driver);
    }

    public RozetkaSearchPage getRozetkaSearchPage(){
        return new RozetkaSearchPage(driver);
    }

    public RozetkaSpecificProductPage getRozetkaSpecificProductPage(){
        return new RozetkaSpecificProductPage(driver);
    }

    public AlloHomePage getAlloHomePage(){
        return new AlloHomePage(driver);
    }

    public AlloSpecificProductPage getAlloSpecificProductPage(){
        return new AlloSpecificProductPage(driver);
    }

    public AlloLaptopPage getAlloLaptopPage(){
        return new AlloLaptopPage(driver);
    }

    public AlloComparisonPage getAlloComparisonPage(){
        return new AlloComparisonPage(driver);
    }
}
