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

package salesforce.ui.utils;

import core.selenium.util.GetProperties;
import core.selenium.util.SalesForceGetProperties;
import io.restassured.response.Response;
import salesforce.entities.Context;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static salesforce.api.EndPoints.TOKEN_ENDPOINT;
import static salesforce.ui.utils.Constants.FIRST_TOKEN;
import static salesforce.ui.utils.Constants.USER_NAME;
import static salesforce.ui.utils.Constants.PASSWORD;
import static salesforce.ui.utils.Constants.GRANT_TYPE;
import static salesforce.ui.utils.Constants.CLIENT_ID;
import static salesforce.ui.utils.Constants.CLIENT_SECRET;
import static salesforce.ui.utils.Constants.ACCESS_TOKEN;

/**
 * Token Generator class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class TokenGenerator {

    /**
     * Variable for the Response.
     */
    private Response response;

    /**
     * Variable for the context.
     */
    private Context context;

    /**
     * Constant for path of application properties.
     */
    private static final String SALESFORCE_PROPERTIES = "salesforce.properties";

    /**
     * Constructor Token Generator.
     *
     */
    public TokenGenerator() {

    }

    /**
     * Generates a token.
     * @return return Map with response.
     */
    private Map<String, String> generateToken() {
        Properties propertiesToken = GetProperties.getProperties(SALESFORCE_PROPERTIES);
        Map<String, String> responseGenerateToken = new HashMap<>();
        response = given()
                .param(Constants.USER_NAME, propertiesToken.getProperty(USER_NAME))
                .param(Constants.PASSWORD, propertiesToken.getProperty(PASSWORD)
                        + propertiesToken.getProperty(FIRST_TOKEN))
                .param(Constants.GRANT_TYPE, propertiesToken.getProperty(GRANT_TYPE))
                .param(Constants.CLIENT_ID, propertiesToken.getProperty(CLIENT_ID))
                .param(Constants.CLIENT_SECRET, propertiesToken.getProperty(CLIENT_SECRET))
                .when().post(SalesForceGetProperties.getInstance().getAccessLogin() + TOKEN_ENDPOINT);
        responseGenerateToken = response.jsonPath().getMap("$");
        return responseGenerateToken;
    }

    /**
     * @return access token.
     */
    public String setToken() {
        Map<String, String> responseGenerateToken = new HashMap<>();
        responseGenerateToken = generateToken();
        String asd = responseGenerateToken.get(ACCESS_TOKEN);
        return responseGenerateToken.get(ACCESS_TOKEN);
    }
}
