package salesforce.ui.pages.account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import salesforce.ui.pages.BasePage;

import java.util.List;

public class AccountLightningPage extends AccountsPageAbstract {

    /**
     * Web element for the button new of accounts page.
     */
    @FindBy(xpath = "//a[@title='New']")
    private WebElement newAccoutnButton;


    @Override
    protected void waitUntilPageObjectIsLoaded() {

    }

    /**
     * Returns an Account Form page after clicking on new button.
     *
     * @return an account form page.
     */
    @Override
    public AccountFormAbstract clickNewBtn() {
        newAccoutnButton.click();
        return new AccountLightningForm();
    }

    /**
     * Returns a list with name accounts from the accounts page.
     *
     * @return a list of names account as string.
     */
    @Override
    public List<String> getListOfAccountsName() {
        return null;
    }


}
