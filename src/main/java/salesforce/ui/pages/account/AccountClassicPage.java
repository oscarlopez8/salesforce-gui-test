package salesforce.ui.pages.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import salesforce.ui.pages.BasePage;

public class AccountClassicPage extends BasePage {
    @FindBy(id = "userNavLabel")
    private WebElement userMenuButton;

    @FindBy(css = "a[title='My Settings']")
    private WebElement mySettingsButton;

    @FindBy(css = "tr.dataRow.even.first>th>a")
    private WebElement account;

    @FindBy(css = "div[class*=first]")
    private WebElement firstRelatedList;

    public void clickUserMenuButton() {
        userMenuButton.click();
    }

    public void clickMySettingsButton() {
        mySettingsButton.click();
    }

    public void clickAccount() {
        account.click();
    }

    public String containFirstRelatedList() {
        return firstRelatedList.findElement(By.cssSelector("td.pbTitle>h3")).getAttribute("innerText");
    }

    @Override
    protected void waitUntilPageObjectIsLoaded() {

    }
}
