package helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Help {

    public Actions aimElement(Actions actions, WebElement element) {
        actions.moveToElement(element).build().perform();
        return null;
    }
    public void delay() {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 3000) {
        }
    }
}
