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

import salesforce.ui.pages.BasePage;

/**
 * Case Form Abstract Page class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public abstract class CaseFormAbstract extends BasePage {

    /**
     * Return the Case page.
     *
     * @return an instance getCaseFormPage.
     */
    public abstract CaseFormAbstract getCaseFormPage();

    /**
     * Enters a status in the form.
     *
     * @param status to set the status.
     */
    public abstract void setStatus(String status);

    /**
     * Enters a priority in the form.
     *
     * @param priority to set the priority.
     */
    public abstract void setPriority(String priority);

    /**
     * Enters a origin in the form.
     *
     * @param origin to set the origin.
     */
    public abstract void setOrigin(String origin);

    /**
     * Enters a contactName in the form.
     *
     * @param contactName to set the contactName.
     */
    public abstract void setContactName(String contactName);

    /**
     * Enters a accountName in the form.
     *
     * @param accountName to set the accountName.
     */
    public abstract void setAccountName(String accountName);

    /**
     * Enters a reason in the form.
     *
     * @param reason to set the reason.
     */
    public abstract void setReason(String reason);
}
