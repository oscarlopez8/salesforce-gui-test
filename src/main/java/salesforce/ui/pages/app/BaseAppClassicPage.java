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
import salesforce.ui.pages.navbar.NavBarClassic;

/**
 * Base App Classic Page class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class BaseAppClassicPage extends BaseAppPageAbstract {

    /**
     * Locator for switch Page link.
     */
    @FindBy(id = "a[class='switch-to-lightning']")
    private WebElement switchPage;

    /**
     * Locator for header of base page.
     */
    @FindBy(id = "AppBodyHeader")
    private WebElement basePageHeader;

    /**
     * Gets NavBar.
     *
     * @return NavBar.
     */
    @Override
    public NavBar getNavBar() {
        return new NavBarClassic();
    }

    /**
     * Clicks on the link to change of layout.
     */
    @Override
    public void clickSwitchLayout() {
        switchPage.click();
    }

    /**
     * Waits until a webElement is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(basePageHeader));
    }
}
