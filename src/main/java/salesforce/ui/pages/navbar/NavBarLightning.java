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
import salesforce.ui.pages.cases.CaseLightningPage;
import salesforce.ui.pages.cases.CasePageAbstract;

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
    @FindBy(css = "li[id='AllTab_Tab']")
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

    /**
     * Clicks in Case menu button.
     */
    private void clickAllMenuTab() {
        allMenusTab.click();
    }

    /**
     * Clicks in menu more.
     */
    private void clickOnMoreMenu() {
        buttonMore.click();
    }

    /**
     * Clicks in Case menu button.
     */
    private void clickCaseOption() {
        caseOption.click();
    }

    /**
     * Returns case page after clicking on contact option.
     *
     * @return an case page.
     */
    @Override
    public CasePageAbstract goToCasePage() {
        clickOnMoreMenu();
        return new CaseLightningPage();
    }

    /**
     * Waits until a webElement is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
       wait.until(ExpectedConditions.visibilityOf(caseOption));
    }
}
