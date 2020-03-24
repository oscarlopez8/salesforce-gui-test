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

package salesforce.ui.pages;

import core.selenium.util.GetProperties;

import java.util.Properties;

/**
 * Page User Experience class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public final class PageUserExperienceType {

    /**
     * Path of gradle properties file.
     */
    public static final String PATH_OF_GRADLE_PROPERTIES_FILE = "gradle.properties";

    /**
     * Constant for the key of layout.
     */
    private static final String LAYOUT = "layoutpage";

    /**
     * Constant properties.
     */
    private static Properties properties;

    /**
     * Constructor of PageUserExperienceType.
     */
    private PageUserExperienceType() {

    }

    /**
     * Initializes the page layout config.
     *
     * @return a new PageLayoutConfig.
     */
    public static PageUserExperienceType getInstance() {
        return new PageUserExperienceType();
    }

    /**
     * Gets the name of page layout in which the tests are being executed.
     *
     * @return page layout.
     */
    public static String getPageLayoutName() {
        properties = GetProperties.getProperties(PATH_OF_GRADLE_PROPERTIES_FILE);
        //return = System.getProperty(LAYOUT).toUpperCase();
        return properties.getProperty(LAYOUT).toLowerCase();
    }
}
