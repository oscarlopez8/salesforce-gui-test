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

/**
 * Account Classic Form class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class AccountClassicForm extends AccountFormAbstract {

    /**
     * Web element for the text-box of account name.
     */
    @FindBy(xpath = "//div[@class='requiredInput']//input")
    private WebElement accountNameTextBox;

    /**
     * Enters a name of account in the form.
     *
     * @param accountName to set the account name.
     */
    @Override
    public void setNameAccount(final String accountName) {
        accountNameTextBox.sendKeys (accountName);
    }

    /**
     * Enters the name for the account sending a string.
     *
     * @param accountName to set the account name.
     */
    @Override
    public void setNameAccountOnTextBox(final String accountName) {
        accountNameTextBox.sendKeys(accountName);
    }
}
