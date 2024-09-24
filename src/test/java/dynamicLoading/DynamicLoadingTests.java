package dynamicLoading;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DynamicLoadingTests extends BaseTests {
    @Test
    public void testDynamicLoading() {
        var dynamicLoadingPage = homePage.clickDynamicLoadingLink();
        var dynamicLoadingExample1Page = dynamicLoadingPage.clickExample1Link();
        dynamicLoadingExample1Page.clickStartButton();
        assertEquals(dynamicLoadingExample1Page.getLoadingText(),"Hello World!","Loaded Text is incorrect" );
    }

}
