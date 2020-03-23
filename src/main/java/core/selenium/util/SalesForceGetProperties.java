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

package core.selenium.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Get Sales Force Properties class.
 *
 * @author Oscar Lopez
 * @version 1.0
 */
public class SalesForceGetProperties {

    /**
     * Constant for path of application properties.
     */
    private static final String SALESFORCE_PROPERTIES = "salesforce.properties";

    /**
     * Constant for the key content type.
     */
    public static final String CONTENT_TYPE = "Content-Type";

    /**
     * Constant for the key Json Account.
     */
    public static final String JSON_ACCOUNT = "accountPath";

    /**
     * Constant for the key access token.
     */
    public static final String TOKEN = "Access-Token";

    /**
     * Constant for the key url.
     */
    public static final String URL_API = "urlAPI";

    /**
     * Map to save the properties of the application.
     */
    private Map<String, String> applicationProperties;

    /**
     * Create a new reader with the properties of the application.
     */
    protected SalesForceGetProperties() {
        applicationProperties = new HashMap<>();
        addSalesForceProperties();
    }

    /**
     * Returns a new instance of SalesForceGetProperties.
     *
     * @return a SalesForceGetProperties.
     */
    public static SalesForceGetProperties getInstance() {
        return new SalesForceGetProperties();
    }

    /**
     * Returns the properties of the application.
     *
     * @return a map of properties.
     */
    public Map<String, String> getAppProperties() {
        return applicationProperties;
    }

    /**
     * Adds properties for the Salesforce to map applicationProperties.
     */
    private void addSalesForceProperties() {
        Properties propertiesSalesForce = GetProperties.getProperties(SALESFORCE_PROPERTIES);
        propertiesSalesForce.forEach((key, value) -> applicationProperties.put(key.toString(), value.toString()));
    }

    /**
     * Returns the token from the properties file.
     *
     * @return the token as string.
     */
    public String getAccessToken() {
        return getAppProperties().get(TOKEN);
    }

    /**
     * Returns the url to request to the API from the properties file.
     *
     * @return the url as string.
     */
    public String getUrlApi() {
        return getAppProperties().get(URL_API);
    }

    /**
     * Returns the content type from the properties file.
     *
     * @return the content type as string.
     */
    public String getContentType() {
        return getAppProperties().get(CONTENT_TYPE);
    }

    /**
     * Returns the Json Account from the properties file.
     *
     * @return the content type as string.
     */
    public String getJsonAccount() {
        return getAppProperties().get(JSON_ACCOUNT);
    }
}
