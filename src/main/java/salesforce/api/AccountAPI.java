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

import static salesforce.api.EndPoints.ACCOUNT_ENDPOINT;
import static salesforce.api.EndPoints.SLASH;

/**
 * AccountAPI class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class AccountAPI {

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
     * Constructor of AccountAPI.
     */
    protected AccountAPI() {
        restClient = RestClientAPI.getInstance();
    }

    /**
     * Returns the instance the account API.
     *
     * @return a account API.
     */
    public static AccountAPI getInstance() {
        return new AccountAPI();
    }

    /**
     * Deletes an account by id.
     *
     * @param accountId to concat with the base endpoint.
     */
    public void deleteAccount(final String accountId) {
        finalEndpoint = ACCOUNT_ENDPOINT.concat(SLASH.concat(accountId));
        response = restClient.delete(finalEndpoint);
    }

    /**
     * Creates an account.
     *
     * @param newAccount to sent the body of the request.
     * @return the id of account created.
     */
    public String createAccount(final Map<String, String> newAccount) {
        finalEndpoint = ACCOUNT_ENDPOINT;
        response = restClient.post(finalEndpoint, newAccount);
        return response.body().jsonPath().getString("id");
    }

    /**
     * return the response after requesting an account by Id.
     *
     * @param id to request.
     * @return the response.
     */
    public Response getAccountById(final String id) {
        finalEndpoint = ACCOUNT_ENDPOINT.concat(SLASH.concat(id));
        response = restClient.get(finalEndpoint);
        return response;
    }
}
