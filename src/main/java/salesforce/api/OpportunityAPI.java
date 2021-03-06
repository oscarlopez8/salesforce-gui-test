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

package salesforce.api;

import io.restassured.response.Response;
import salesforce.api.rest.RestClientAPI;

import java.util.Map;

import static salesforce.api.EndPoints.OPPORTUNITY_ENDPOINT;
import static salesforce.api.EndPoints.SLASH;

/**
 * OpportunityAPI class to information of Opportunity.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class OpportunityAPI {

    /**
     * Variable for the rest client.
     */
    private RestClientAPI restClient;

    /**
     * Variable for the response.
     */
    private Response response;

    /**
     * Variable for the final endpoint.
     */
    private String finalEndpoint;

    /**
     * Constructor of OpportunityAPI.
     */
    protected OpportunityAPI() {
        restClient = RestClientAPI.getInstance();
    }

    /**
     * Returns the instance the Opportunity API.
     *
     * @return a opportunity API.
     */
    public static OpportunityAPI getInstance() {
        return new OpportunityAPI();
    }

    /**
     * Creates an opportunity.
     *
     * @param newOpportunity to sent the body of the request.
     * @return the id of account created.
     */
    public String createOpportunity(final Map<String, String> newOpportunity) {
        finalEndpoint = OPPORTUNITY_ENDPOINT;
        newOpportunity.forEach((k, v) -> System.out.println("Key: " + k + ": Value: " + v));
        response = restClient.post(finalEndpoint, newOpportunity);
        return response.body().jsonPath().getString("id");
    }

    /**
     * Deletes a Opportunity by id.
     *
     * @param opportunityId to concat with the base endpoint.
     */
    public void deleteOpportunity(final String opportunityId) {
        finalEndpoint = OPPORTUNITY_ENDPOINT.concat(SLASH.concat(opportunityId));
        response = restClient.delete(finalEndpoint);
    }
}
