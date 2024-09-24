package forgetpass;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.*;
import pages.EndPage;
import static org.testng.Assert.*;

public class ForgetPasswordTests extends BaseTests {
    @Test
    public void testSuccessfulLogin() {
        ForgetPasswordPage forgetPasswordPage = homePage.clickForgetPasswordLink();
        forgetPasswordPage.enterEmail("tau@example.com");
        EndPage endPage = forgetPasswordPage.clickRetrievePasswordButton();

        assertTrue( endPage.getStatus().contains("Internal Server Error"),
                " Alert text is incorrect!");
    }
}



