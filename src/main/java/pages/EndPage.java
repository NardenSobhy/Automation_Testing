package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EndPage {
    private WebDriver driver;
    private By statusAlert = By.cssSelector("h1");

    public EndPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getStatus() {
        return driver.findElement(statusAlert).getText();
    }
}
