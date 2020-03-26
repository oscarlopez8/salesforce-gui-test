package salesforce.ui.pages.account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import salesforce.ui.pages.BasePage;

import java.util.List;

public class MySettingsPage extends BasePage {

    @FindBy(id = "DisplayAndLayout_font")
    private WebElement displayAndLayoutButton;

    @FindBy(id = "CustomizeDisplay_font")
    private WebElement customizeMyPageButton;

    @FindBy(id = "pageid")
    private WebElement configurePageDropbox;

    @FindBy(css = "#pageid>option")
    private List<WebElement> optionsConfigurePageDropbox;

    @FindBy(name = "customizePageSubmit")
    private WebElement customizePageButton;

    @FindBy(id = "duel_select_1")
    private WebElement optionReleatedList;

    @FindBy(id = "duel_select_1_up")
    private WebElement upButton;

    @FindBy(css = "input.btn.primary")
    private WebElement saveButton;

    public void clickDisplayAndLayoutButton() {
        displayAndLayoutButton.click();
    }

    public void clickCustomizeMyPage() {
        customizeMyPageButton.click();
    }

    public void clickConfigurePageDropbox() {
        configurePageDropbox.click();
    }

    public void clickOptionConfigurePageDropbox() {
        optionsConfigurePageDropbox.get(1).click();
    }

    public void clickCustomizePage() {
        customizePageButton.click();
    }

    public void selectLastOptionRelatedList() {
        Select optionItem = new Select(optionReleatedList);
        optionItem.selectByIndex(6);
    }

    public void clickUpButton() {
        upButton.click();
    }

    public void moveItem() {
        for (int cont = 0; cont <= 6; cont++) {
            clickUpButton();
        }
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    @Override
    protected void waitUntilPageObjectIsLoaded() {

    }
}
