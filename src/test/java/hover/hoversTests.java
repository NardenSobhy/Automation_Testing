package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class hoversTests extends BaseTests {
    @Test
    public void testHoverUser1() {
        var hoverspage = homePage.clickHoversLink();
        var caption = hoverspage.hoverOverFigure(1);
        assertTrue( caption.isCaptionDisplayed(),
                " Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1"," Caption title is not correct" );
        assertEquals(caption.getLinkText(),"View profile"," Caption link text is not correct");
        assertTrue(caption.getLink().endsWith("/users/1"),"Link is not correct");
    }
}
