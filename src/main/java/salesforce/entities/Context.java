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
 * Context class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class Context {

    /**
     * Account to manage in the context.
     */
    private Account account;

    /**
     * Contact to manage in the context.
     */
    private Contact contact;

    /**
     * Case to manage in the context.
     */
    private Case cases;

    /**
     * Opportunity to manage in the context.
     */
    private Opportunity opportunity;

    /**
     * Constructor of Context.
     */
    public Context() {
        this.account = new Account();
        this.contact = new Contact();
        this.cases = new Case();
        this.opportunity = new Opportunity();
    }

    /**
     * Returns the account of context.
     *
     * @return an account.
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Returns the contact of context.
     *
     * @return contact.
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Returns the case of context.
     *
     * @return case.
     */
    public Case getCases() {
        return cases;
    }

    /**
     * Returns the Opportunity of context.
     *
     * @return Opportunity.
     */
    public Opportunity getOpportunity() {
        return opportunity;
    }
}
