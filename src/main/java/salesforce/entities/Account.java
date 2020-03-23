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
     * Variable for the id.
     */
    private String id;

    /**
     * Variable for the name account.
     */
    private String name;

    /**
     * Variable for the name Account Number.
     */
    private String accountNumber;

    /**
     * Variable for the phone.
     */
    private String phone;

    /**
     * Variable for the phone.
     */
    private String webSite;

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
        return name;
    }

    /**
     * Sets the name of an Account sending a string.
     *
     * @param name for the name of the account.
     */
    public void setAccountName(final String name) {
        this.name = name;
    }

    /**
     * Returns the accountNumber of the account.
     *
     * @return the id as string.
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Set a Account Number.
     * @param accountNumber param.
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Returns the phone of the account.
     *
     * @return the id as string.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set a Account phone.
     * @param phone param.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Returns the webSite of the account.
     *
     * @return the id as string.
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * Set a Account Web Site.
     * @param webSite param.
     */
    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
}
