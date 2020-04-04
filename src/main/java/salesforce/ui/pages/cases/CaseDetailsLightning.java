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

/**
 * Case Details Lightning Page class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class CaseDetailsLightning extends CaseDetailsAbstract {

    /**
     * Edit Button.
     */
    @FindBy(xpath = "//div[@title='Edit']")
    private WebElement editButton;

    /**
     * Status Combo Box.
     */
    @FindBy(css = "div.slds-grid.slds-col.slds-is-editing.slds-has-flexi-truncate.full.forcePageBlockItem.forcePageBlockItemEdit ")
    private WebElement statusComboBox;

    /**
     * Select working.
     */
    @FindBy(xpath = "//span[@title='Working']")
    private WebElement workingOption;

    /**
     * Save Button.
     */
    @FindBy(xpath = "//button[@title='Save'] //span[contains(text(),'Save')]")
    private WebElement saveButton;

    /**
     * Save Button.
     */
    @FindBy(xpath = "//span[contains(text(),'Case status updated')]")
    private WebElement validationData;


    /**
     * Click On Details.
     */
    @Override
    public void clickOnDetails() {
        editButton.click();
        statusComboBox.click();
        workingOption.click();
        saveButton.click();
    }

    /**
     * Get Close message.
     *
     * @return Close message.
     */
    @Override
    public String getCaseClosed() {
        return validationData.getText();
    }

    @Override
    public void closeTheCase() {

    }

    /**
     * Waits until a webElement is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {

    }
}
