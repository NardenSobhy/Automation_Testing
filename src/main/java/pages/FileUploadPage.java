package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By UploadedFile = By.id("uploaded-files");
    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }
    public void uploadFile(String filePath) {
        driver.findElement(inputField).sendKeys(filePath);
        clickUploadButton();
    }
    public String getUploadedFile() {
        return driver.findElement(UploadedFile).getText();
    }
}
