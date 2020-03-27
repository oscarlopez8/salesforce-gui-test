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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Opportunity Entity class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class Opportunity {

    /**
     * Variable for the id.
     */
    private String id;

    /**
     * Variable for the name.
     */
    private String name;

    /**
     * Variable for the type.
     */
    private String type;

    /**
     * Variable for the amount.
     */
    private String amount;

    /**
     * Variable for the probability.
     */
    private String probability;

    /**
     * Variable for the description.
     */
    private String description;

    /**
     * Variable for the closeDate.
     */
    private String closeDate;

    /**
     * Variable for the nextStep.
     */
    private String nextStep;

    /**
     * Constant for the Days.
     */
    private static final int DAYS = 3;

    /**
     * Constant for the name.
     */
    private static final String OPPORTUNITY_NAME = "name";

    /**
     * Constant for the type.
     */
    private static final String OPPORTUNITY_TYPE = "type";

    /**
     * Constant for the amount.
     */
    private static final String OPPORTUNITY_AMOUNT = "amount";

    /**
     * Constant for the probability.
     */
    private static final String OPPORTUNITY_PROBABILITY = "probability";

    /**
     * Constant for the description.
     */
    private static final String OPPORTUNITY_DESCRIPTION = "description";

    /**
     * Constant for the closeDate.
     */
    private static final String OPPORTUNITY_CLOSE_DATE = "closeDate";

    /**
     * Constant for the nextStep.
     */
    private static final String OPPORTUNITY_NEXT_STEP = "";

    /**
     * Variable of date.
     */
    private Date todayDate = new Date();

    /**
     * Returns the id of the Opportunity.
     *
     * @return the id as string.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id of Opportunity sending a string.
     *
     * @param id for the Opportunity.
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * Returns the name of the Opportunity.
     *
     * @return the name as string.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of Opportunity sending a string.
     *
     * @param name for the Opportunity.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Returns the type of the Opportunity.
     *
     * @return the type as string.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the id of Opportunity sending a string.
     *
     * @param type for the Opportunity.
     */
    public void setType(final String type) {
        this.type = type;
    }

    /**
     * Returns the amount of the Opportunity.
     *
     * @return the amount as string.
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the id of Opportunity sending a string.
     *
     * @param amount for the Opportunity.
     */
    public void setAmount(final String amount) {
        this.amount = amount;
    }

    /**
     * Returns the probability of the Opportunity.
     *
     * @return the probability as string.
     */
    public String getProbability() {
        return probability;
    }

    /**
     * Sets the id of Opportunity sending a string.
     *
     * @param probability for the Opportunity.
     */
    public void setProbability(final String probability) {
        this.probability = probability;
    }

    /**
     * Returns the description of the Opportunity.
     *
     * @return the description as string.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the id of Opportunity sending a string.
     *
     * @param description for the Opportunity.
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Returns the closeDate of the Opportunity.
     *
     * @return the closeDate as string.
     */
    public String getCloseDate() {
        return closeDate;
    }

    /**
     * Sets the id of Opportunity sending a string.
     *
     * @param closeDate for the Opportunity.
     */
    public void setCloseDate(final String closeDate) {
        this.closeDate = closeDate;
    }

    /**
     * Returns the nextStep of the Opportunity.
     *
     * @return the nextStep as string.
     */
    public String getNextStep() {
        return nextStep;
    }

    /**
     * Sets the id of Opportunity sending a string.
     *
     * @param nextStep for the Opportunity.
     */
    public void setNextStep(final String nextStep) {
        this.nextStep = nextStep;
    }

    /**
     * Returns a map with the information the opportunity.
     *
     * @param opportunityMap to set the information.
     * @return strategyMap with the information of opportunity.
     */
    private HashMap<String, Runnable> composeStrategyMap(final Map<String, String> opportunityMap) {
        HashMap<String, Runnable> strategyOpportunityMap = new HashMap<>();
        strategyOpportunityMap.put(OPPORTUNITY_NAME, () -> setName(opportunityMap.get(OPPORTUNITY_NAME)));
        strategyOpportunityMap.put(OPPORTUNITY_TYPE, () -> setType(opportunityMap.get(OPPORTUNITY_NAME)));
        strategyOpportunityMap.put(OPPORTUNITY_AMOUNT, () -> setAmount(opportunityMap.get(OPPORTUNITY_AMOUNT)));
        strategyOpportunityMap.put(OPPORTUNITY_PROBABILITY, () ->
                setProbability(opportunityMap.get(OPPORTUNITY_PROBABILITY)));
        strategyOpportunityMap.put(OPPORTUNITY_DESCRIPTION, () ->
                setDescription(opportunityMap.get(OPPORTUNITY_DESCRIPTION)));
        strategyOpportunityMap.put(OPPORTUNITY_CLOSE_DATE, () ->
                setCloseDate(opportunityMap.get(OPPORTUNITY_CLOSE_DATE)));
        return strategyOpportunityMap;
    }

    /**
     * Sets the values of an opportunity sending a map with the information to set.
     *
     * @param opportunityMap to set the information.
     */
    public void setAccountInformation(final Map<String, String> opportunityMap) {
        HashMap<String, Runnable> strategyOpportunityMap = composeStrategyMap(opportunityMap);
        opportunityMap.keySet().forEach(key -> strategyOpportunityMap.get(key).run());
    }
}
