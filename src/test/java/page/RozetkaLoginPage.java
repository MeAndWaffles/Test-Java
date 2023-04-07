package page;

import allForTests.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaLoginPage extends BasePage {
    public RozetkaLoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement fieldEmailMailOrPhoneRozetka() {
        return findElementByXpath("//input[@type='email']");
    }

    public WebElement fieldPasswordRozetka() {
        return findElementByXpath("//input[@type='password']");
    }

    public WebElement boxRememberMeRozetka() {
        return findElementByXpath("//label[@for='remember_me']");
    }

    public WebElement buttonLogInUserRozetka() {
        return findElementByXpath("//button[contains(@class,'button--large button--gre')]");
    }

    public WebElement errorMessageInLoginPageRozetka() {
        return findElementByXpath("//p[@class='error-message ng-star-inserted']");
    }

    public WebElement buttonToRegisterInRozetka() {
        return findElementByXpath("//button[@class='auth-modal__register-link button button--link ng-star-inserted']");
    }
}
