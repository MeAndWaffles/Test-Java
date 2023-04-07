package page;

import allForTests.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaHomePage extends BasePage {
    public RozetkaHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement goLaptopsAndComputersRozetka() {
        return findElementByXpath("//li[contains(@class,'item ng-star-inserted')]/a[contains(@href,'computers-notebooks')]");
    }

    public WebElement goLaptopsRozetka() {
        return findElementByXpath("//a[contains(@href,'c80004/')][contains(@class,'ng-star-inserted')]");
    }

    public WebElement goSmartphonesElectronicsRozetka() {
        return findElementByXpath("//li[contains(@class,'item ng-star-inserted')]/a[contains(@href,'ony-tv-i-ehlektronika')][@class='menu-categories__link']");
    }

    public WebElement goAppleRozetka() {
        return findElementByXpath("//a[@_ngcontent-rz-client-c176][contains(@href,'c80003/producer=apple')]");
    }

    public WebElement goToGoodsForGamersRozetka() {
        return findElementByXpath("//a[contains(@href,'game-zone/c80261/')][@class='menu-categories__link']");
    }

    public WebElement goGamingMonitorsSamsungRozetka() {
        return findElementByXpath("//a[@_ngcontent-rz-client-c176][contains(@href,'c80089/preset=game')]");
    }

    public WebElement goLoginPageRozetka() {
        return findElementByXpath("//rz-user/button[@class='header__button ng-star-inserted']");
    }

    public WebElement inFildSearchRozetka() {
        return findElementByXpath("//input[@name='search']");
    }
}
