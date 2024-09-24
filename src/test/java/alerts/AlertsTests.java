package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AlertsTests extends BaseTests {
    @Test
    public void alertsTest() {
        var alertsPage = homePage.clickjavaScriptAlertsLink();
        alertsPage.clickTriggerAlertButton();
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResultText(), "You successfully clicked an alert");
    }

    @Test
    public void testGetTextFromAlert() {
        var alertsPage = homePage.clickjavaScriptAlertsLink();
        alertsPage.clickTriggerConfirmButton();
        assertEquals(alertsPage.getAlertText(), "I am a JS Confirm");
        alertsPage.dismissAlert();
        assertEquals(alertsPage.getResultText(), "You clicked: Cancel");
    }

    @Test
    public void testSetInputAlert() {
        var alertsPage = homePage.clickjavaScriptAlertsLink();
        alertsPage.clickTiggerPromptButton();
        String text = "Hello World";
        alertsPage.alertSetInput(text);
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResultText(), "You entered: "+text);

    }
}
