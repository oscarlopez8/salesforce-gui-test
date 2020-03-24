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
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Case Classic Page class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class CaseClassicPage extends CasePageAbstract {

    /**
     * Web element for the button new.
     */
    @FindBy(css = "input[class='btn'][name='new']")
    private WebElement newCaseBtn;

    /**
     * Returns a web element for verify the detail event is open.
     *
     * @return an instance web element.
     */
    @Override
    public WebElement buttonNew() {
        return null;
    }

    /**
     * Return the Case page.
     *
     * @return an instance eventPageAbstract.
     */
    @Override
    public CasePageAbstract getCasePage() {
        return null;
    }

    /**
     * Waits until a webElement is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(newCaseBtn));
    }
}
