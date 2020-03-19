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

package salesforce.api.rest;

import core.selenium.util.SalesForceGetProperties;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

import static core.selenium.util.SalesForceGetProperties.CONTENT_TYPE;
import static io.restassured.RestAssured.given;

/**
 * Rest Client API class.
 *
 * @author Oscar Lopez
 * @version 1.0
 */
public final class RestClientAPI {

    /**
     * Variable for the url base of API.
     */
    private String urlAPI;

    /**
     * Variable for the access token.
     */
    private String accessToken;

    /**
     * Variable for the content type.
     */
    private String contentType;

    /**
     * Variable for concat the url of API with the endpoint.
     */
    private String url;

    /**
     * Variable for the response.
     */
    private Response response;

    /**
     * Variable for the request.
     */
    private RequestSpecification request;

    /**
     * Variable for  initialize base api.
     */
    private static RestClientAPI instance;

    /**
     * Constructor of base API.
     */
    private RestClientAPI() {
        initialize();
        requestAuthentication();
    }

    /**
     * Returns an instance of RestClientAPI.
     *
     * @return a instance.
     */
    public static RestClientAPI getInstance() {
        if (instance == null) {
            instance = new RestClientAPI();
        }
        return instance;
    }

    /**
     * Initializes the setting for the API.
     */
    private void initialize() {
        urlAPI = SalesForceGetProperties.getInstance().getUrlApi();
        accessToken = SalesForceGetProperties.getInstance().getAccessToken();
        contentType = SalesForceGetProperties.getInstance().getContentType();
    }

    /**
     * Requests the authentication.
     */
    private void requestAuthentication() {
        request = given().headers(CONTENT_TYPE, contentType).auth().oauth2(accessToken);
    }

    /**
     * Returns a response after requesting a post.
     *
     * @param endpoint to do the request.
     * @param valuesForTheBody the
     * @return a response
     */
    public Response post(final String endpoint, final Map<String, String> valuesForTheBody) {
        url = urlAPI.concat(endpoint);
        response = request.body(valuesForTheBody).when().post(url);
        return response;
    }

    /**
     * Returns a response after requesting a delete.
     *
     * @param endpoint to do the request.
     * @return a response.
     */
    public Response delete(final String endpoint) {
        url = urlAPI.concat(endpoint);
        response = request.when().delete(url);
        return response;
    }

    /**
     * Returns a response after requesting a delete.
     *
     * @param endpoint to do the request.
     * @return a response.
     */
    public Response get(final String endpoint) {
        url = urlAPI.concat(endpoint);
        response = request.when().get(url);
        return response;
    }
}
