package tests.page_object_models;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Urls;

public class Factory_Dropdown extends Factory__Index {

    // CONSTRUCTOR - only 1
    public Factory_Dropdown() {
        super(Urls.get("dropdown"));
    }

    // LOCATORS

    @FindBy(css = "section#dropdown1")
    private WebElement dropdownSelectViaIndex;
    public int dropdownOptionIndex = 1;

    @FindBy(css = "section#dropdown2")
    private WebElement dropdownSelectViaText;
    public String dropdownOptionString = "Selenium";

    @FindBy(css = "section#dropdown3")
    private WebElement dropdownSelectViaValue;
    public String dropdownOptionValue = "Selenium";

    @FindBy(css = "section#dropdown")
    private WebElement dropdownCountOptions;
    public int dropdownCountExpected = 5;

    @FindBy(css = "div.example:nth-child(13) > select")
    private WebElement dropdownSelectViaSendKeys;

    @FindBy(css = "div.example:nth-child(16) > select")
    private WebElement dropdownSelectMultiple;
    public int[] dropdownMultipleOptions = {1, 4};

    // GETTERS

    public WebElement getDropdownSelectViaIndex() { return dropdownSelectViaIndex; }

    public WebElement getDropdownSelectViaText() { return dropdownSelectViaText; }

    public WebElement getDropdownSelectViaValue() { return dropdownSelectViaValue; }

    public WebElement getDropdownCountOptions() { return dropdownCountOptions; }

    public WebElement getDropdownSelectViaSendKeys() { return dropdownSelectViaSendKeys; }

    public WebElement getDropdownSelectMultiple() { return dropdownSelectMultiple; }
}
