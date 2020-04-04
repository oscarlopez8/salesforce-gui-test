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

/**
 * Case Details Classic Page class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class CaseDetailsClassic extends CaseDetailsAbstract {

    /**
     * Log Call Menu.
     */
    @FindBy(xpath = "//a[@id='efpPublishers_5003h000003Tclo_option1']")
    private WebElement logCallMenu;

    /**
     * Log Call Menu.
     */
    @FindBy(css = "a[id='efpPublishers_5003h000003TclZ_option2']")
    private WebElement changeStatusMenu;

    /**
     * Tab Details Menu.
     */
    @FindBy(xpath = "//span[contains(text(), 'Details')]")
    private WebElement tabDetails;

    /**
     * Close button.
     */
    @FindBy(xpath = "//td[@id='topButtonRow'] //input[@value='Close Case']")
    private WebElement closeButton;

    /**
     * Close button.
     */
    @FindBy(xpath = "//td[@id='topButtonRow'] //input[@value=' Save ']")
    private WebElement saveButton;

    /**
     * Close Message.
     */
    @FindBy(xpath = "//td[contains(text(), 'Closed.')]")
    private WebElement message;

    /**
     * Status ComboBox.
     */
    @FindBy(name = "cas7")
    private WebElement statusButton;

    /**
     * Origin ComboBox.
     */
    @FindBy(name = "cas6")
    private WebElement reasonComboBox;

    /**
     * Variable to manage comboBox.
     */
    Select dropdown;

    /**
     * Waits until a webElement is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {

    }

    /**
     * Click On Details.
     *
     */
    @Override
    public void clickOnDetails() {
        tabDetails.click();
    }

    /**
     * Get Close message.
     *
     * @return Close message.
     */
    @Override
    public String getCaseClosed() {
        System.out.println(message.getText());
        return  message.getText();

    }

    @Override
    public void closeTheCase() {
        closeButton.click();
        dropdown = new Select(statusButton);
        dropdown.selectByValue("Closed");
        dropdown = new Select(reasonComboBox);
        dropdown.selectByValue("Other");
        saveButton.click();
    }
}
