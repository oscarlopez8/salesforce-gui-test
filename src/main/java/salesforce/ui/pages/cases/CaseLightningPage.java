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

package salesforce.ui.pages.cases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import salesforce.ui.pages.navbar.NavBar;
import salesforce.ui.pages.navbar.NavBarLightning;

/**
 * Base Case Lightning Page class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class CaseLightningPage extends CasePageAbstract {

    /**
     * Button More.
     */
    @FindBy(css = "one-app-nav-bar-menu-button>a>span.slds-p-right_small")
    private WebElement btnMore;

    /**
     * Button New.
     */
    @FindBy(xpath = "//div[@title='New']")
    private WebElement newButton;


    /**
     * Returns an Case Form page after clicking on new button.
     *
     * @return an case form page.
     */
    @Override
    public CaseFormAbstract clickNewBtn() {
        newButton.click();
        return new CaseLightningForm();
    }

    /**
     * Return the Case page.
     *
     * @return an instance eventPageAbstract.
     */
    @Override
    public CasePageAbstract getCasePage() {
        btnMore.click();
        return new CaseLightningPage();
    }

    /**
     * Waits until a webElement is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {

    }
}
