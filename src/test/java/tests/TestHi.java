package tests;

import allForTests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;

public class TestHi extends TestInit {
    @Test
    public void languageTestWiki() {
        HomePage homePage = new HomePage(driver);

        homePage.goHomePage();
        homePage.inTheSearchFieldGoogle().sendKeys("Wikipedia\n");
        homePage.inTheSearchPageWikiUa().click();
        assertTestUrlContainsString("uk.wikipedia");

        homePage.getWikipedia().inTheSearchFieldWikipedia().sendKeys("Selenium\n");
        homePage.getWikipedia().inFoundSearchGoSeleniumWiki().click();
        homePage.getWikiSelenium().changeToEnglishWiki().click();
        assertTestUrlContainsString("en.wikipedia");

        homePage.getWikiSelenium().openTheListBoxOfLanguagesWiki().click();
        homePage.getWikiSelenium().inTheListBoxOfLanguagesUkWiki().click();
        assertTestUrlContainsString("uk.wikipedia");
    }

    @Test
    public void eventUkTestWiki() {
        HomePage homePage = new HomePage(driver);

        homePage.goHomePage();
        homePage.inTheSearchFieldGoogle().sendKeys("Wikipedia\n");
        homePage.inTheSearchPageWikiUa().click();
        assertTestUrlContainsString("uk.wikipedia");

        homePage.getWikipedia().goMainWiki().click();
        Assert.assertTrue(homePage.getWikipedia().aLineAboutTheEventsInUkraine().isDisplayed());

        homePage.getWikipedia().goCurrentEventsWiki().click();
        Assert.assertTrue(homePage.getWikipedia().aLineAboutTheEventsInUkraine().isDisplayed());

        homePage.getWikipedia().goRecentChangesWiki().click();
        Assert.assertTrue(homePage.getWikipedia().aLineAboutTheEventsInUkraine().isDisplayed());

        homePage.getWikipedia().goNewPagesWiki().click();
        Assert.assertTrue(homePage.getWikipedia().aLineAboutTheEventsInUkraine().isDisplayed());

        homePage.getWikipedia().goRandomPageWiki().click();
        Assert.assertTrue(homePage.getWikipedia().aLineAboutTheEventsInUkraine().isDisplayed());
    }

    @Test
    public void filtersTestRozetka() {
        HomePage homePage = new HomePage(driver);

        homePage.goHomePage();
        homePage.inTheSearchFieldGoogle().sendKeys("Rozetka\n");
        homePage.inTheSearchPageRozetka().click();
        assertTestUrlContainsString("rozetka");

        homePage.getRozetkaHomePage().goLaptopsAndComputersRozetka().click();
        homePage.getRozetkaHomePage().goLaptopsRozetka().click();

        homePage.getRozetkaLaptopsPage().chooseSellerRozetka().click();
        getHelp().delay();
        assertTestUrlContainsString("seller=rozetka");

        homePage.getRozetkaLaptopsPage().chooseASUSRozetka().click();
        getHelp().delay();
        assertTestUrlContainsString("producer=asus;seller=rozetka");
    }

    @Test
    public void displayCharacteristicsTestRozetka() {
        HomePage homePage = new HomePage(driver);

        homePage.goHomePage();
        homePage.inTheSearchFieldGoogle().sendKeys("Rozetka\n");
        homePage.inTheSearchPageRozetka().click();
        assertTestUrlContainsString("rozetka");

        homePage.getRozetkaHomePage().goSmartphonesElectronicsRozetka().click();
        homePage.getRozetkaHomePage().goAppleRozetka().click();
        assertTestUrlContainsString("producer=apple");

        homePage.getRozetkaMobilePhonesPage().goToPhoneMPUR3RX().click();
        homePage.getRozetkaMobilePhonesPage().goPhoneCharacteristicsRozetka().click();

        Assert.assertEquals(homePage.getRozetkaMobilePhonesPage().listCharacteristicsRozetka().size(), 14);
    }

    @Test
    public void addingProductToTheComparisonTestRozetka() {
        HomePage homePage = new HomePage(driver);

        homePage.goHomePage();
        homePage.inTheSearchFieldGoogle().sendKeys("Rozetka\n");
        homePage.inTheSearchPageRozetka().click();
        assertTestUrlContainsString("rozetka");

        homePage.getRozetkaHomePage().goToGoodsForGamersRozetka().click();
        homePage.getRozetkaHomePage().goGamingMonitorsSamsungRozetka().click();

        homePage.getRozetkaGamingMonitorsPage().addToComparisonS28AG702().click();
        homePage.getRozetkaGamingMonitorsPage().addToComparisonC27F390F().click();

        homePage.getRozetkaGamingMonitorsPage().openTheSmallComparisonWindowRozetka().click();
        Assert.assertTrue(homePage.getRozetkaGamingMonitorsPage().twoMonitorsInComparisonRozetka().isDisplayed());
    }

    @Test
    public void loginCheckTestRozetka() {
        HomePage homePage = new HomePage(driver);

        homePage.goHomePage();
        homePage.inTheSearchFieldGoogle().sendKeys("Rozetka\n");
        homePage.inTheSearchPageRozetka().click();
        assertTestUrlContainsString("rozetka");

        homePage.getRozetkaHomePage().goLoginPageRozetka().click();

        homePage.getRozetkaLoginPage().fieldEmailMailOrPhoneRozetka().sendKeys("not human");
        homePage.getRozetkaLoginPage().fieldPasswordRozetka().sendKeys("not a real user");
        homePage.getRozetkaLoginPage().boxRememberMeRozetka().click();
        homePage.getRozetkaLoginPage().buttonLogInUserRozetka().click();

        Assert.assertTrue(homePage.getRozetkaLoginPage().errorMessageInLoginPageRozetka().isDisplayed());
        //може добавлю потім
    }

    @Test
    public void checkingRegistrationForCommentsRozetka() {
        HomePage homePage = new HomePage(driver);

        homePage.goHomePage();
        homePage.inTheSearchFieldGoogle().sendKeys("Rozetka\n");
        homePage.inTheSearchPageRozetka().click();
        assertTestUrlContainsString("rozetka");

        homePage.getRozetkaHomePage().goLoginPageRozetka().click();

        homePage.getRozetkaLoginPage().buttonToRegisterInRozetka().click();

        homePage.getRozetkaRegisterPage().fildRegisterUserNameRozetka().sendKeys("!!!");
        homePage.getRozetkaRegisterPage().fildRegisterUserSurnameRozetka().sendKeys("###");
        homePage.getRozetkaRegisterPage().fildRegisterUserEmailRozetka().sendKeys("@@@");
        homePage.getRozetkaRegisterPage().fildRegisterUserPhoneRozetka().sendKeys("*");
        homePage.getRozetkaRegisterPage().fildRegisterUserPasswordRozetka().sendKeys("%%%");
        homePage.getRozetkaRegisterPage().buttonToSeeThePasswordRozetka().click();
        homePage.getRozetkaRegisterPage().buttonRegisterUserInRozetka().click();

        Assert.assertEquals(homePage.getRozetkaRegisterPage().listCommentsBelowTheFieldsRozetka().size(), 9);
    }

    @Test
    public void displayingTheProductInTheBasketRozetka() {
        HomePage homePage = new HomePage(driver);

        homePage.goHomePage();
        homePage.inTheSearchFieldGoogle().sendKeys("Rozetka\n");
        homePage.inTheSearchPageRozetka().click();
        assertTestUrlContainsString("rozetka");

        homePage.getRozetkaHomePage().inFildSearchRozetka().sendKeys("5908217670762\n");
        assertTestUrlContainsString("search");

        homePage.getRozetkaSearchPage().goAquaSpeedSpectraRozetka().click();
        homePage.getRozetkaSpecificProductPage().addProductToTheCartRozetka().click();

        Assert.assertTrue(homePage.getRozetkaSpecificProductPage().displayingTheProductInTheShoppingCartRozetka().isDisplayed());
    }

    @Test
    public void searchAndDisplayOfSpecificProductShoppingInformationTestAllo() {
        HomePage homePage = new HomePage(driver);

        homePage.goHomePage();
        homePage.inTheSearchFieldGoogle().sendKeys("allo.ua\n");
        homePage.inTheSearchPageAllo().click();
        assertTestUrlContainsString("allo.ua");

        homePage.getAlloHomePage().inTheSearchPageAllo().sendKeys("Xiaomi Redmi Note 12 Pro 8/256 Graphite Gray\n");
        Assert.assertTrue(homePage.getAlloSpecificProductPage().fildTheSpecificNameOfTheOpenedProduct().isDisplayed());
        Assert.assertEquals(homePage.getAlloSpecificProductPage().listBookmarksForAdditionalInformationAllo().size(), 6);

        homePage.getAlloSpecificProductPage().goToPurchaseOfSpecificProductAllo().click();
        Assert.assertTrue(homePage.getAlloSpecificProductPage().productDisplayFieldInTheShoppingCartWindowAllo().isDisplayed());
    }

    @Test
    public void productDisplayInComparisonTestAllo() {
        HomePage homePage = new HomePage(driver);

        homePage.goHomePage();
        homePage.inTheSearchFieldGoogle().sendKeys("allo.ua\n");
        homePage.inTheSearchPageAllo().click();
        assertTestUrlContainsString("allo.ua");

        homePage.getAlloHomePage().inTheSearchPageAllo().sendKeys("laptop\n");
        getHelp().delay();
        assertTestUrlContainsString("laptop");

        homePage.getAlloLaptopPage().addToComparisonAsusK55VAllo().click();
        homePage.getAlloLaptopPage().addToComparisonEVOOEVLaptop141Allo().click();
        homePage.getAlloLaptopPage().goToComparisonAllo().click();

        Assert.assertEquals(homePage.getAlloComparisonPage().listProductInComparisonAllo().size(), 2);
    }
}
