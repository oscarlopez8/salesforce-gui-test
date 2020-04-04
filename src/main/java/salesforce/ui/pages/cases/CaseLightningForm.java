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
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class CaseLightningForm extends CaseFormAbstract {


    /**
     * Origin Combo Box.
     */
    @FindBy(xpath = "//a[@data-interactive-lib-uid='7']")
    private WebElement originComboBox;

    /**
     * Status Combo Box.
     */
    @FindBy(xpath = "//input[@id='input-190']")
    private WebElement statusComboBox;

    /**
     * Phone option.
     */
    @FindBy(xpath = "//a[@title='Phone']")
    private WebElement phone;

    /**
     * Save Button.
     */
    @FindBy(xpath = "//button[@title='Save'] //span[contains(text(),'Save')]")
    private WebElement saveButton;


    /**
     * Variable to manage comboBox.
     */
    Select dropdown;

    /**
     * Return the Case page.
     *
     * @return an instance getCaseFormPage.
     */
    @Override
    public CaseFormAbstract getCaseFormPage() {
        return new CaseLightningForm();
    }

    /**
     * Enters a status in the form.
     *
     * @param status to set the status.
     */
    @Override
    public void setStatus(String status) {
        statusComboBox.sendKeys(status);
        statusComboBox.click();
    }

    /**
     * Enters a priority in the form.
     *
     * @param priority to set the priority.
     */
    @Override
    public void setPriority(String priority) {

    }

    /**
     * Enters a origin in the form.
     *
     * @param origin to set the origin.
     */
    @Override
    public void setOrigin(String origin) {
        originComboBox.sendKeys(origin);
        phone.click();
    }

    /**
     * Enters a contactName in the form.
     *
     * @param contactName to set the contactName.
     */
    @Override
    public void setContactName(String contactName) {

    }

    /**
     * Enters a accountName in the form.
     *
     * @param accountName to set the accountName.
     */
    @Override
    public void setAccountName(String accountName) {

    }

    /**
     * Get Id Case.
     */
    @Override
    public String getIdCase() {
        return null;
    }

    /**
     * Click on Save Button.
     *
     * @param caseMap to set the require data.
     */
    @Override
    public void clickOnSaveButton(Map<String, String> caseMap) {
        setStatus(caseMap.get("Status"));
        setOrigin(caseMap.get("Origin"));
        saveButton.click();
    }

    /**
     * Waits until a webElement is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {

    }
}
