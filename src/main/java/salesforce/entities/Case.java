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
 * Case class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class Case {

    /**
     * Variable for the id.
     */
    private String id;

    /**
     * Variable for the caseNumber.
     */
    private  String caseNumber;

    /**
     * Variable for the status.
     */
    private  String status;

    /**
     * Variable for the reason.
     */
    private  String reason;

    /**
     * Variable for the priority.
     */
    private  String priority;

    /**
     * Variable for the origin.
     */
    private  String origin;

    /**
     * Returns Id of a Case.
     * @return id of a Case.
     */
    public String getId() {
        return id;
    }

    /**
     * Set Id of a Case.
     * @param id of a Case.
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * Returns caseNumber of a Case.
     * @return caseNumber of a Case.
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * Set caseNumber of a Case.
     * @param caseNumber of a Case.
     */
    public void setCaseNumber(final String caseNumber) {
        this.caseNumber = caseNumber;
    }

    /**
     * Returns status of a Case.
     * @return status of a Case.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set status of a Case.
     * @param status of a Case.
     */
    public void setStatus(final String status) {
        this.status = status;
    }

    /**
     * Returns reason of a Case.
     * @return reason of a Case.
     */
    public String getReason() {
        return reason;
    }

    /**
     * Set reason of a Case.
     * @param reason of a Case.
     */
    public void setReason(final String reason) {
        this.reason = reason;
    }

    /**
     * Returns priority of a Case.
     * @return priority of a Case.
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Set priority of a Case.
     * @param priority of a Case.
     */
    public void setPriority(final String priority) {
        this.priority = priority;
    }

    /**
     * Returns origin of a Case.
     * @return origin of a Case.
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Set origin of a Case.
     * @param origin of a Case.
     */
    public void setOrigin(final String origin) {
        this.origin = origin;
    }
}
