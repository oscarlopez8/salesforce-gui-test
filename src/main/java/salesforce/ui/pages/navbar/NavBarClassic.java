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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.cases.CaseClassicPage;
import salesforce.ui.pages.cases.CasePageAbstract;
import salesforce.ui.pages.event.EventPageAbstract;
import salesforce.ui.pages.opportunity.OpportunityClassicPage;
import salesforce.ui.pages.opportunity.OpportunityPageAbstract;

/**
 * Nav Bar Classic class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class NavBarClassic extends NavBar {

    /**
     * Web element of tab-bar.
     */
    @FindBy(id = "tabBar")
    private WebElement tabBar;

    /**
     * Web element for the contact option.
     */
    @FindBy(id = "Case_Tab")
    private WebElement caseMenuBtn;

    /**
     * Web element of allMenusTab.
     */
    @FindBy(css = "li[id='AllTab_Tab']")
    private WebElement allMenusTab;

    /**
     * Web element of case Option.
     */
    @FindBy(css = "a[class='listRelatedObject caseBlock title']")
    private WebElement caseOption;

    /**
     * Web element of Opportunity Option.
     */
    @FindBy(id = "Opportunity_Tab")
    private WebElement opportunityMenu;

    /**
     * Clicks in Case menu button.
     */
    private void clickOpportunityTab() {
        opportunityMenu.click();
    }

    /**
     * Clicks in Case menu button.
     */
    private void clickAllMenuTab() {
        allMenusTab.click();
    }

    /**
     * Public method to call the click function.
     */
    public void clickAllTab() {
        clickAllMenuTab();
    }

    /**
     * Clicks in Case menu button.
     */
    private void clickCaseOption() {
        caseOption.click();
    }

    /**
     * Returns Case page after clicking on contact option.
     *
     * @return an Case page.
     */
    @Override
    public CasePageAbstract goToCasePage() {
        clickAllMenuTab();
        clickCaseOption();
        return new CaseClassicPage();
    }

    /**
     * Returns Opportinuty page after clicking on contact option.
     *
     * @return an Opportinuty page.
     */
    @Override
    public OpportunityPageAbstract goToOpportunityPage() {
        clickOpportunityTab();
        return new OpportunityClassicPage();
    }

    /**
     * Returns Event page after clicking the option.
     *
     * @return an Event page.
     */
    @Override
    public EventPageAbstract goToEventPage() {
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
