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

package hook;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import salesforce.api.AccountAPI;
import salesforce.entities.Account;
import salesforce.entities.Context;

import java.util.HashMap;
import java.util.Map;

/**
 * Account hook class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class AccountHook {

    /**
     * Variable for the context.
     */
    private Context context;

    /**
     * Variable for account.
     */
    private Account account;

    /**
     * Account hooks constructor sending the context.
     *
     * @param context init the context.
     */
    public AccountHook(final Context context) {
        this.context = context;
        account = context.getAccount();
    }

    /**
     * Deletes an account by id.
     */
    @After("@delete-account")
    public void afterScenario() {
        AccountAPI.getInstance().deleteAccount(account.getId());
    }

    /**
     * Creates an account before scenario.
     */
    @Before("@create-account")
    public void beforeScenario() {
        Map<String, String> createNewAccount = new HashMap<>();
        createNewAccount.put("Name", "Account");
        account.setId(AccountAPI.getInstance().createAccount(createNewAccount));
    }
}
