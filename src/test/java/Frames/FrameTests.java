package Frames;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FrameTests extends BaseTests {
    @Test
    public void FrameTests() {
        var editorPage = homePage.clickWysiwygEditorLink();
        editorPage.clearTextArea();
        String text1 = "Hello ";
        String text2 = "World";
        editorPage.setTextArea(text1);
        editorPage.clickDecreaseIndentButton();
        editorPage.setTextArea(text2);
        assertEquals(editorPage.getTextFromEditor(), text1+text2,"Text from editor is incorrect");
    }
}
