package tests.page_object_models;
// SELENIUM
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// CUSTOM
import utils.Urls;

public class Factory_Hyperlinks extends Factory__Index {

    // CONSTRUCTOR - only one
    public Factory_Hyperlinks() {
        // SUPER
        super(Urls.get("hyperlink"));
    }

    // LOCATORS

    @FindBy(css = "section:nth-child(1) > div:nth-child(1) >div>div> a")
    private WebElement linkHome;

    @FindBy(css = "section:nth-child(1) > div:nth-child(4) >div>div> a")
    private WebElement linkFindWhereItGoes;

    @FindBy(css = "section:nth-child(1) > div:nth-child(7) >div>div> a")
    private WebElement linkIsItBroken;

    @FindBy(css = "section:nth-child(1) > div:nth-child(10) >div>div> a")
    private WebElement linkHomeDuplicate;

    @FindBy(css = "section:nth-child(1) > div:nth-child(13) >div>div> a")
    private WebElement linkCountTheNumberOfLinks;

    // GETTERS

    public WebElement getLinkHome() { return linkHome; }

    public WebElement getLinkFindWhereItGoes() {
        return linkFindWhereItGoes;
    }

    public WebElement getLinkIsItBroken() {
        return linkIsItBroken;
    }

    public WebElement getLinkHomeDuplicate() {
        return linkHomeDuplicate;
    }

    public WebElement getLinkCountTheNumberOfLinks() {
        return linkCountTheNumberOfLinks;
    }
}
