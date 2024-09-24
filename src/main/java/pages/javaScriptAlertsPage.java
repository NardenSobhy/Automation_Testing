package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class javaScriptAlertsPage {

    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By tiggerPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");
    private By resultText = By.id("result");

    public javaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickTriggerAlertButton() {
        driver.findElement(triggerAlertButton).click();
    }
    public void clickTriggerConfirmButton() {
        driver.findElement(triggerConfirmButton).click();
    }
    public void clickTiggerPromptButton() {
        driver.findElement(tiggerPromptButton).click();
    }
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }
    public void alertSetInput(String text) {
        driver.switchTo().alert().sendKeys(text);
    }
    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }
    public String getResultText() {
        return driver.findElement(resultText).getText();
    }
}
