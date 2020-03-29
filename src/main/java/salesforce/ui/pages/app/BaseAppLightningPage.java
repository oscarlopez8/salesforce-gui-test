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

package salesforce.ui.pages.app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.navbar.NavBar;
import salesforce.ui.pages.navbar.NavBarLightning;

/**
 * Base App Lightning Page class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class BaseAppLightningPage extends BaseAppPageAbstract {

    @FindBy(css = "div.slds-icon-waffle")
    WebElement menuWaffle;

    /**
     * Locator for switch Page link.
     */
    @FindBy(css = "[data-aura-class='oneUserProfileCardTrigger'] [data-aura-class='uiTooltip']")
    private WebElement viewProfileBtn;

    /**
     * Locator for switchPage link.
     */
    @FindBy(id = "a[class='profile-link-label switch-to-aloha uiOutputURL']")
    private WebElement switchPage;

    /**
     * Locator for header of base page.
     */
    @FindBy(css = "[class='slds-global-header slds-grid slds-grid--align-spread']")
    private WebElement basePageHeader;

    /**
     * Gets NavBar.
     *
     * @return NavBar.
     */
    @Override
    public NavBar getNavBar() {
        return new NavBarLightning();
    }

    /**
     * Clicks on the link to change of layout.
     */
    @Override
    public void clickSwitchLayout() {
        viewProfileBtn.click();
    }

    /**
     * Waits until a webElement is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        //wait.until(ExpectedConditions.visibilityOf(menuWaffle));
    }
}
