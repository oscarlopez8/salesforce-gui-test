package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import salesforce.ui.pages.ShowAllTabsPage;
import salesforce.ui.pages.account.AccountClassicPage;
import salesforce.ui.pages.account.MySettingsPage;
import salesforce.ui.pages.navbar.NavBarClassic;

public class AccountSteps {
    @When("I go to My Settings page")
    public void iGoToMySettingsPage() {
        AccountClassicPage accountClassicPage = new AccountClassicPage();
        accountClassicPage.clickUserMenuButton();
        accountClassicPage.clickMySettingsButton();
    }

    @And("I select the Account page to Customize it")
    public void iSelectTheAccountPageToCustomizeIt() {
        MySettingsPage mySettingsPage = new MySettingsPage();
        mySettingsPage.clickDisplayAndLayoutButton();
        mySettingsPage.clickCustomizeMyPage();
        mySettingsPage.clickOptionConfigurePageDropbox();
        mySettingsPage.clickCustomizePage();
    }

    @And("I move the last item to the top in the Selected List")
    public void iMoveTheLastItemToTheTopInTheSelectedList() {
        MySettingsPage mySettingsPage = new MySettingsPage();
        mySettingsPage.selectLastOptionRelatedList();
        mySettingsPage.moveItem();
        mySettingsPage.clickSaveButton();
    }

    @And("I go to the Account page")
    public void iGoToTheAccountPage() {
        NavBarClassic navBarClassic = new NavBarClassic();
        navBarClassic.clickAllTab();

        ShowAllTabsPage showAllTabsPage = new ShowAllTabsPage();
        showAllTabsPage.clickAccountsBlock();
    }

    @Then("Check the account page to make sure the item appears first")
    public void checkTheAccountPageToMakeSureTheItemAppearsFirst() {
        AccountClassicPage accountClassicPage = new AccountClassicPage();
        accountClassicPage.clickAccount();
        String actual = accountClassicPage.containFirstRelatedList();
        Assert.assertEquals(actual,"Case");
    }
}
