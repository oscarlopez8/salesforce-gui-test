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

package core.selenium.webdrivers;

import org.openqa.selenium.WebDriver;

/**
 * This Interface is to init a driver.
 *
 * @author Oscar Lopez
 * @version 1.0
 */
public interface IDriver {

    /**
     * This method initialize browser.
     *
     * @return a IDriver
     */
    WebDriver initDriver();
}
