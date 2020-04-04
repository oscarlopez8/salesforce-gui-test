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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static salesforce.ui.utils.Constants.NAME_ACCOUNT;


public abstract class AccountFormAbstract extends BasePage {

    /**
     * Waits until a webElement is loaded.
     */
    private Set<String> accountsField = new HashSet<>();

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
    public abstract void setNameAccount(String accountName);

    /**
     * Enters a name of account in the form.
     *
     * @param accountName to set the account name.
     */
    public abstract void setNameAccountOnTextBox(String accountName);

    /**
     * Sets the values of an Account sending a map with the information to set.
     *
     * @param accountMap to set the information.
     */
    public void setAccountInformationOnForm(final Map<String, String> accountMap) {
        HashMap<String, Runnable> strategyMap = composeStrategyMap(accountMap);
        accountMap.keySet().forEach(key -> strategyMap.get(key).run());
        accountsField.addAll(accountMap.keySet());
    }

    /**
     * Returns a map with the information the account.
     *
     * @param newAccount to set the information.
     * @return strategyMap with the information of account.
     */
    private HashMap<String, Runnable> composeStrategyMap(final Map<String, String> newAccount) {
        HashMap<String, Runnable> strategyMap = new HashMap<>();
        strategyMap.put(NAME_ACCOUNT, () -> setNameAccount(newAccount.get(NAME_ACCOUNT)));

        return strategyMap;
    }


}
