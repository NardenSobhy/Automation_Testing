package Keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class KeysTests extends BaseTests {
    @Test
    public void keysTest() {
        var keyPage = homePage.clickKeyPressesLink();
        keyPage.enterText("A"+ Keys.BACK_SPACE);
        assertEquals( keyPage.getResultText(), "You entered: BACK_SPACE");
    }
}
