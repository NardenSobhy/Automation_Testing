package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By loadingText = By.id("finish");

    public DynamicLoadingExample1Page(WebDriver driver) {
        this.driver = driver;
    }
    public void clickStartButton() {
        driver.findElement(startButton).click();
        //Explicitly waiting
        //WebDriverWait wait = new WebDriverWait(driver, 5);

        //Fluent waiting
        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));

    }
    public String getLoadingText() {
        return driver.findElement(loadingText).getText();
    }
}
