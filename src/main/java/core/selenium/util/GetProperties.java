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

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * This class creates to read a gradle.properties.
 *
 * @author Oscar Lopez
 * @version 1.0
 */
public final class GetProperties {

    /**
     * Constructor of the Class.
     */
    private GetProperties() {

    }
    /**
     * Initialize a new GetProperties.
     * @return GetProperties.
     */
    public static GetProperties getInstance() {
        return new GetProperties();
    }

    /**
     * Gets properties from properties file.
     *
     * @param path - Path of Gradle properties file.
     * @return Properties.
     */
    public static Properties getProperties(final String path) {

        try  {
            InputStream input = new FileInputStream(path);
            Properties properties = new Properties();
            properties.load(input);
            return properties;
        } catch (IOException ioe) {
            Log.getInstance().getLogger().info("IOException: " + ioe);
            throw new RuntimeException(ioe + path + " could not be read.");
        }
    }
}
