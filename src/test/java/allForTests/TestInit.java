package allForTests;

import helper.Help;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;

public class TestInit {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);

    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Actions actions() {
        Actions actions = new Actions(driver);
        return actions;
    }

    public Help getHelp() {
        return new Help();
    }

    public void assertTestUrlContainsString(String containsURL) {
        String url = driver.getCurrentUrl();
        String expected = containsURL;
        Assert.assertTrue(url.contains(expected));
    }
}
