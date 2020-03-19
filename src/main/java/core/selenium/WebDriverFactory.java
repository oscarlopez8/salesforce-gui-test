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

package core.selenium;

import core.selenium.webdrivers.Chrome;
import core.selenium.webdrivers.FireFox;
import core.selenium.webdrivers.IDriver;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is to select a browser.
 *
 * @author Oscar Lopez
 * @version 1.0
 */
public final class WebDriverFactory {

    /**
     * Contructor of the class.
     */
    private WebDriverFactory() {

    }

    private static Map<String, IDriver> browsers = new HashMap<>();
    static {
        browsers.put("chrome", new Chrome());
        browsers.put("firefox", new FireFox());
    }

    /**
     * Uses for select a Browser.
     *
     * @param browser Parameter content a Browser Name.
     * @return a webDriver.
     */
    public static WebDriver getWebDriver(final String browser) {
        return browsers.get(browser).initDriver();
    }
}
