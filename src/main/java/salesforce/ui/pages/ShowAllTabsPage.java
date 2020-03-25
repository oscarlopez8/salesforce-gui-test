package salesforce.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShowAllTabsPage extends BasePage {

    @FindBy(css = "td.dataCol.accountBlock>a")
    private WebElement accountBlock;

    public void clickAccountBlock() {
        accountBlock.click();
    }

    @Override
    protected void waitUntilPageObjectIsLoaded() {

    }
}
