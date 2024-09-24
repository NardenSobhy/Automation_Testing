package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigation;
    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigation = driver.navigate();
    }
    public void goBack() {
        navigation.back();
    }
    public void goForward() {
        navigation.forward();
    }
    public void refreshPage() {
        navigation.refresh();
    }
    public void goTo(String url) {
        navigation.to(url);
    }
    public void switchToTab(String tabName) {
        var windows = driver.getWindowHandles();
        System.out.println("Number of tabs; " + windows.size());
        System.out.println("Window Handles; ");
        windows.forEach(System.out::println);
        for (String windowHandle : windows) {
            System.out.println("Switching to window ; "+windowHandle);
            driver.switchTo().window(windowHandle);
            System.out.println("Current window title ; "+driver.getTitle());
            if(tabName.equals(driver.getTitle())) {
                break;
            }
        }
    }
}
