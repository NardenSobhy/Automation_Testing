package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload() {
        var uploadPage =homePage.clickFileUploadLink();
        uploadPage.uploadFile("E:\\testing\\AlartsTesting\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFile(), "chromedriver.exe","Upload file is incorrect" );
    }
}
