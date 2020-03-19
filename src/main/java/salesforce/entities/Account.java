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

package salesforce.entities;

/**
 * Account class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class Account {

    /**
     * Variable for the id of account.
     */
    private String id;

    /**
     * Variable for the name account of an Account.
     */
    private String accountName;

    /**
     * Returns the id of the account.
     *
     * @return the id as string.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id of account sending a string.
     *
     * @param id for the account.
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * Returns the name account.
     *
     * @return name account as string.
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the name of an Account sending a string.
     *
     * @param accountName for the name of the account.
     */
    public void setAccountName(final String accountName) {
        this.accountName = accountName;
    }
}
