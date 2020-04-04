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

package salesforce.ui.pages.account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountLightningForm extends AccountFormAbstract {

    /**
     * Web element for the text-box the account name.
     */
    @FindBy(xpath = "//input[@id=//label[contains(.,'Account') and starts-with(.,'Account Name')]/@for]")
    private WebElement accountNameTextBox;

    /**
     * Enters a name of account in the form.
     *
     * @param accountName to set the account name.
     */
    @Override
    public void setNameAccountOnTextBox(String accountName) {
        accountNameTextBox.sendKeys(accountName);
    }

    /**
     * Waits until a webElement is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {

    }

    /**
     * Enters a name of account in the form.
     *
     * @param accountName to set the account name.
     */
    @Override
    public void setNameAccount(String accountName) {
        accountNameTextBox.sendKeys (accountName);
    }
}
