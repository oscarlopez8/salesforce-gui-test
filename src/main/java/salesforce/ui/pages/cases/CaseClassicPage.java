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
     * Returns an Case Form page after clicking on new button.
     *
     * @return an case form page.
     */
    @Override
    public CaseFormAbstract clickNewBtn() {
        newCaseBtn.click();
        return new CaseClassicForm();
    }

    /**
     * Return the Case page.
     *
     * @return an instance casePageAbstract.
     */
    @Override
    public CasePageAbstract getCasePage() {
        newCaseBtn.click();
        return new CaseClassicPage();
    }

    /**
     * Waits until a webElement is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(newCaseBtn));
    }
}
