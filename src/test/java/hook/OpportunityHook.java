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
import salesforce.api.OpportunityAPI;
import salesforce.entities.Context;
import salesforce.entities.Opportunity;

import java.util.HashMap;
import java.util.Map;

/**
 * Opportunity Hook class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class OpportunityHook {

    /**
     * Variable for the context.
     */
    private Context context;

    /**
     * Variable for Opportunity.
     */
    private Opportunity opportunity;

    /**
     * Account hooks constructor sending the context.
     *
     * @param context init the context.
     */
    public OpportunityHook(final Context context) {
        this.context = context;
        opportunity = context.getOpportunity();
    }

    /**
     * Deletes an Opportunity by id.
     */
    @After("@delete-opportunity")
    public void afterScenario() {
        OpportunityAPI.getInstance().deleteOpportunity(opportunity.getId());
    }

    /**
     * Creates an opportunity before scenario.
     */
    @Before("@create-opportunity")
    public void beforeScenarioWithName() {
        Map<String, String> createOpportunity = new HashMap<>();
        createOpportunity.put("Name", "New opportunity name");
        createOpportunity.put("StageName", "Prospecting");
        createOpportunity.put("CloseDate", "2020-04-15");
        opportunity.setId(OpportunityAPI.getInstance().createOpportunity(createOpportunity));
    }
}
