package page;

import allForTests.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RozetkaRegisterPage extends BasePage {
    public RozetkaRegisterPage(WebDriver driver) {
        super(driver);
    }

    public WebElement fildRegisterUserNameRozetka() {
        return findElementByXpath("//input[contains(@id,'Name')]");
    }

    public WebElement fildRegisterUserSurnameRozetka() {
        return findElementByXpath("//input[contains(@id,'Surname')]");
    }

    public WebElement fildRegisterUserPhoneRozetka() {
        return findElementByXpath("//input[contains(@id,'Phone')]");
    }

    public WebElement fildRegisterUserEmailRozetka() {
        return findElementByXpath("//input[contains(@id,'Email')]");
    }

    public WebElement fildRegisterUserPasswordRozetka() {
        return findElementByXpath("//input[contains(@id,'Password')]");
    }

    public WebElement buttonToSeeThePasswordRozetka() {
        return findElementByXpath("//button[contains(@class,'password')]");
    }

    public WebElement buttonRegisterUserInRozetka() {
        return findElementByXpath("//button[contains(@class,'button--large button--gre')]");
    }

    public List<WebElement> listCommentsBelowTheFieldsRozetka() {
        return findElementsByXpath("//p[@_ngcontent-rz-client-c111]");
    }
}
