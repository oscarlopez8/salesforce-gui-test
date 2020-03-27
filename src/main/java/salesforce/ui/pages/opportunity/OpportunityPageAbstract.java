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

package salesforce.ui.pages.opportunity;

import salesforce.ui.pages.BasePage;

import java.util.List;

/**
 * Opportunity Abstract Page class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public abstract class OpportunityPageAbstract extends BasePage {

    /**
     * Click On Opportunity.
     * @param idOpportunity param.
     */
    public abstract void clickOnOpportunity(String idOpportunity);

    /**
     * Returns a list with name Opportunity from the Opportunity page.
     *
     * @return a list of names Opportunity as string.
     */
    public abstract List<String> getListOfOpportunityName();

    /**
     * Set Account Name.
     * @param nameAccount param.
     */
    public abstract void setAccountName(String nameAccount);

    /**
     * Get Account Name.
     *
     * @return account Name.
     */
    public abstract String getAccountName();

    /**
     * Go to form Abstract Page.
     */
    public abstract void goToFormPageAbstract();
}
