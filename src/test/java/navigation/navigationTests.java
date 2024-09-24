package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class navigationTests extends BaseTests {
    @Test
    public void testNavigation() {
        homePage.clickDynamicLoadingLink().clickExample1Link();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }
    @Test
    public void testSwitchTab() {
        homePage.clickMultipleWindowsLink().clickHere();
        getWindowManager().switchToTab("New Window");

    }
}
