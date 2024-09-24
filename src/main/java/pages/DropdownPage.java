package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }
    public void selectFromDropdown(String option) {
        getDropdownElement().selectByVisibleText(option);
    }
    public List<String> getSelectedOptions() {
        List<WebElement> selectedElements = getDropdownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    private Select getDropdownElement() {
        return new Select(driver.findElement(dropdown));
    }
}
