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
import org.openqa.selenium.support.ui.Select;
import salesforce.ui.utils.UrlId;

import java.util.Map;

/**
 * Case Classic Form Page class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class CaseClassicForm extends CaseFormAbstract {

    /**
     * Button Save.
     */
    @FindBy(css = "#topButtonRow input[name='save']")
    private WebElement saveButton;

    /**
     * Status ComboBox.
     */
    @FindBy(name = "cas7")
    private WebElement statusButton;

    /**
     * Origin ComboBox.
     */
    @FindBy(name = "cas11")
    private WebElement originComboBox;

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
        return null;
    }

    /**
     * Enters a status in the form.
     *
     * //@param status to set the status.
     */
    @Override
    public void setStatus(final String status) {
        dropdown = new Select(statusButton);
        dropdown.selectByValue(status);
    }

    /**
     * Enters a priority in the form.
     *
     * @param priority to set the priority.
     */
    @Override
    public void setPriority(final String priority) {

    }

    /**
     * Enters a origin in the form.
     *
     * @param origin to set the origin.
     */
    @Override
    public void setOrigin(final String origin) {
        dropdown = new Select(originComboBox);
        dropdown.selectByValue(origin);
    }

    /**
     * Enters a contactName in the form.
     *
     * @param contactName to set the contactName.
     */
    @Override
    public void setContactName(final String contactName) {

    }

    /**
     * Enters a accountName in the form.
     *
     * @param accountName to set the accountName.
     */
    @Override
    public void setAccountName(final String accountName) {

    }

    /**
     * Enters a reason in the form.
     *
     */
    @Override
    public final String getIdCase() {
        String currentUrl = driver.getCurrentUrl();
        String id = UrlId.splitUrlToId(currentUrl);
        return id;
    }

    /**
     * Click on Save Button.
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
        wait.until(ExpectedConditions.visibilityOf(saveButton));
    }
}
