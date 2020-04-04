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

package salesforce.ui.pages.navbar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.account.AccountLightningPage;
import salesforce.ui.pages.account.AccountsPageAbstract;
import salesforce.ui.pages.cases.CaseDetailsAbstract;
import salesforce.ui.pages.cases.CaseLightningPage;
import salesforce.ui.pages.cases.CasePageAbstract;
import salesforce.ui.pages.opportunity.OpportunityLightningPage;
import salesforce.ui.pages.opportunity.OpportunityPageAbstract;

/**
 * Nav Bar Lightning class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class NavBarLightning extends NavBar {

    /**
     * Web element of allMenusTab.
     */
    @FindBy(css = "#oneHeader>div.bBottom>one-appnav>div>div>div>nav>one-app-launcher-header>button>div")
    private WebElement allMenusTab;

    /**
     * Web element of case Option.
     */
    @FindBy(css = "a[class='listRelatedObject caseBlock title']")
    private WebElement caseOption;

    /**
     * Web element of button More.
     *
     */
    @FindBy(css = ".slds-p-right_small")
    private WebElement buttonMore;

    @FindBy(xpath = "//span[text()='Cases' and @one-appnavbarmenuitem_appnavbarmenuitem=''] ")
    private WebElement menuCase;

    @FindBy(xpath = "//div[@class='slds-context-bar'] //span[text()='More']")
    WebElement btnMore;

    /**
     * Web element of tab-bar.
     */
    @FindBy(xpath = "//div[@class='slds-context-bar']")
    private WebElement tabBar;

    /**
     * Web element for the account option.
     */
    @FindBy(xpath = "//one-app-nav-bar-item-root[@data-id='Account']")
    private WebElement accountsOption;

    /**
     * Web element for the contact option.
     */
    @FindBy(css = "[data-id='Contact']")
    private WebElement contactTab;

    /**
     * Clicks in Case menu button.
     */
    private void clickAllMenuTab() {
        accountsOption.click();
    }

    /**
     * Clicks in contact menu button.
     */
    public void clickMenuMore() {
        btnMore.click();
        Actions action = new Actions(driver);
        action.moveToElement(menuCase).click().perform();
    }

    /**
     * Returns case page after clicking on contact option.
     *
     * @return an case page.
     */
    @Override
    public CasePageAbstract goToCasePage() {
        clickMenuMore();
        return new CaseLightningPage();
    }

    /**
     * Returns Opportinuty page after clicking on contact option.
     *
     * @return an Opportinuty page.
     */
    @Override
    public OpportunityPageAbstract goToOpportunityPage() {
        return new OpportunityLightningPage();
    }

    /**
     * Returns Account page after clicking on account option.
     *
     * @return an Account page.
     */
    @Override
    public AccountsPageAbstract clickAccountsOption() {
        accountsOption.click();
        return new AccountLightningPage();
    }

    /**
     * Returns Case details page.
     *
     * @return an Case page.
     */
    @Override
    public CaseDetailsAbstract goToCaseDetailsPage() {
        return null;
    }

    /**
     * Waits until a webElement is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
       wait.until(ExpectedConditions.visibilityOf(tabBar));
    }
}
