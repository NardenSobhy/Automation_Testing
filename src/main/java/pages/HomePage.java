package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.javaScriptAlertsPage;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public javaScriptAlertsPage clickjavaScriptAlertsLink() {
        clickLink("JavaScript Alerts");
        return new javaScriptAlertsPage(driver);
    }
    public FileUploadPage clickFileUploadLink() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
   public WysiwygEditorPage clickWysiwygEditorLink() {
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }
    public dynamicLoadingPage clickDynamicLoadingLink() {
        clickLink("Dynamic Loading");
        return new dynamicLoadingPage(driver);
    }
    public LargeAndDeepDOMPage clickLargeAndDeepDOMLink() {
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDOMPage(driver);
    }
    public infiniteScrollPage clickInfiniteScrollLink() {
        clickLink("Infinite Scroll");
        return new infiniteScrollPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindowsLink() {
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
    public KeyPressesPage clickKeyPressesLink() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public LoginPage clickFormAuthenticationLink() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public ForgetPasswordPage clickForgetPasswordLink() {
        clickLink("Forgot Password");
        return new ForgetPasswordPage(driver);
    }
    public HoversPage clickHoversLink() {
        clickLink("Hovers");
        return new HoversPage (driver);
    }
    public DropdownPage clickDropdownLink() {
        clickLink("Dropdown");
        return new DropdownPage  (driver);
    }



}