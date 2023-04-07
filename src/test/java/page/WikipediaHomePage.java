package page;

import allForTests.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikipediaHomePage extends BasePage {

    public WikipediaHomePage(WebDriver driver) {
        super(driver);
    }

    public void goHomePageWiki() {
        driver.get("https://uk.wikipedia.org/wiki/");
    }

    public WebElement inTheSearchFieldWikipedia() {
        return findElementByXpath("//input[contains(@name,'search')]");
    }

    public WebElement buttonFindWiki() {
        return findElementByXpath("//button//span[@class='oo-ui-labelElement-label']");
    }

    public WebElement inFoundSearchGoSeleniumWiki() {
        return findElementByXpath("//a[@title='Selenium']/span[@class='searchmatch']");
    }

    public WebElement goMainWiki() {
        return findElementByXpath("//li[@id='n-mainpage-description']/a");
    }

    public WebElement goCurrentEventsWiki() {
        return findElementByXpath("//li[@id='n-currentevents']/a");
    }

    public WebElement goRecentChangesWiki() {
        return findElementByXpath("//li[@id='n-recentchanges']/a");
    }

    public WebElement goNewPagesWiki() {
        return findElementByXpath("//li[@id='n-newpages']/a");
    }

    public WebElement goRandomPageWiki() {
        return findElementByXpath("//li[@id='n-randompage']/a");
    }

    public WebElement aLineAboutTheEventsInUkraine() {
        return findElementByXpath("//div[@class='transparant']/center/b/a");
    }
}
