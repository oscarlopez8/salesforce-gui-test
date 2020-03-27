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

package salesforce.ui.pages.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Home Page Lightning class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class HomePageLightning extends HomePage {

    /**
     * Web element "appLauncherBtn",by validate HomeLightningPage.
     */
    @FindBy(css = "button.slds-button div.slds-icon-waffle")
    private WebElement appLauncherBtn;

    /**
     * Web element "eventLnk",by open CalendarLightningPage.
     */
    @FindBy(id = "setup")
    private WebElement setupButton;

    /**
     * Waits until a webElement is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {

    }

    /**
     * Click on setup button.
     */
    public void setSetupButton() {
        this.setupButton.click();
    }

}
