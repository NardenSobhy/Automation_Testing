package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dynamicLoadingPage {
    private WebDriver driver;
    private By example1Link = By.linkText("Example 1: Element on page that is hidden");
    public dynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }
    public DynamicLoadingExample1Page clickExample1Link() {
        driver.findElement(example1Link).click();
        return new DynamicLoadingExample1Page(driver);
    }

}
