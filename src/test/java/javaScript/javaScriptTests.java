package javaScript;

import base.BaseTests;
import org.testng.annotations.Test;

public class javaScriptTests extends BaseTests {
    @Test
    public void testScrollToTable() {
       homePage.clickLargeAndDeepDOMLink().scrollToTable();
    }
    @Test
    public void testScrollToFifthParagraph() {
        homePage.clickInfiniteScrollLink().scrollToParagraph(5);
    }
}
