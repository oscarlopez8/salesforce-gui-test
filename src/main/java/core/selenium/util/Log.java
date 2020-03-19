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

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * This class creates a log file.
 *
 * @author Oscar Lopez
 * @version 1.0
 */
public final class Log {

    private static Logger logger = Logger.getLogger(Log.class);
    private static Log loggerInstance;

    /**
     * Initializes LogManager.
     */
    private Log() {
        initLogManager();
    }

    /**
     * Sets configurations for log and the level.
     */
    public void initLogManager() {
        PropertyConfigurator.configure("log4j.properties");
        logger.setLevel(Level.ALL);
    }

    /**
     * Allows to get the only instance of LogManager.
     *
     * @return loggerInstance.
     */
    public static Log getInstance() {
        if (loggerInstance == null) {
            loggerInstance = new Log();
        }
        return loggerInstance;
    }

    /**
     * Allows to get the log.
     *
     * @return logger.
     */
    public Logger getLogger() {
        return logger;
    }
}
