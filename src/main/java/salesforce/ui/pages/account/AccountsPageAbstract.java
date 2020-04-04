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

import salesforce.ui.pages.BasePage;

import java.util.List;

/**
 * Account Abstract Page Class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public abstract class AccountsPageAbstract extends BasePage {

    /**
     * Returns an Account Form page after clicking on new button.
     *
     * @return an account form page.
     */
    public abstract AccountFormAbstract clickNewBtn();

    /**
     * Returns a list with name accounts from the accounts page.
     *
     * @return a list of names account as string.
     */
    public abstract List<String> getListOfAccountsName();

}
