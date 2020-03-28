/*
 * Copyright (c) 2020 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import salesforce.ui.pages.ShowAllTabsPage;
import salesforce.ui.pages.account.AccountClassicPage;
import salesforce.ui.pages.account.MySettingsPage;
import salesforce.ui.pages.navbar.NavBarClassic;

/**
 * Account Steps Class.
 *
 * @author Limbert Vargas.
 * @version 1.0
 */
public class AccountSteps {

    /**
     * Method to go to My Settings page
     */
    @When("I go to My Settings page")
    public void goToMySettingsPage() {
        AccountClassicPage accountClassicPage = new AccountClassicPage();
        accountClassicPage.clickUserMenuButton();
        accountClassicPage.clickMySettingsButton();
    }

    /**
     * Method to select the Account Page.
     */
    @When("I select the Account page to Customize it")
    public void selectTheAccountPage() {
        MySettingsPage mySettingsPage = new MySettingsPage();
        mySettingsPage.clickDisplayAndLayoutButton();
        mySettingsPage.clickCustomizeMyPage();
        mySettingsPage.clickOptionConfigurePageDropbox();
        mySettingsPage.clickCustomizePage();
    }

    /**
     * Method to move the last item to the top.
     */
    @When("I move the last item to the top in the Selected List")
    public void moveTheLastItemToTop() {
        MySettingsPage mySettingsPage = new MySettingsPage();
        mySettingsPage.selectLastOptionRelatedList();
        mySettingsPage.moveItem();
        mySettingsPage.clickSaveButton();
    }

    /**
     * Method to go an Account Page.
     */
    @When("I go to the Account page")
    public void goToAccountPage() {
        NavBarClassic navBarClassic = new NavBarClassic();
        navBarClassic.clickAllTab();

        ShowAllTabsPage showAllTabsPage = new ShowAllTabsPage();
        showAllTabsPage.clickAccountsBlock();
    }

    /**
     * Method to check if the Item appears.
     */
    @Then("Check the account page to make sure the item appears first")
    public void showsItemAppears() {
        AccountClassicPage accountClassicPage = new AccountClassicPage();
        accountClassicPage.clickAccount();
        String actual = accountClassicPage.containFirstRelatedList();
        Assert.assertEquals(actual, "Case");
    }
}
