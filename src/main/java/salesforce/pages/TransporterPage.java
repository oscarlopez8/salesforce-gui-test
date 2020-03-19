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

package salesforce.pages;

import core.selenium.WebDriverManager;
import core.selenium.util.SalesForceGetProperties;
import org.openqa.selenium.WebDriver;

/**
 * TransporterPage class.
 *
 * @author Oscar Lopez
 * @version 1.0
 */
public class TransporterPage {

    /**
     * Constant for webDriver.
     */
    private static final WebDriver WEB_DRIVER = WebDriverManager.getInstance().getWebDriver();

    /**
     * Navigates to the login page.
     *
     * @return a new login page.
     */
    public LoginPage navigateToLoginPage() {
        navigateToURL(SalesForceGetProperties.getInstance().getAppProperties().get("login"));
        return new LoginPage();
    }

    /**
     * Navigate to URL use and and point.
     *
     * @param uriPage Gets a uri.
     */
    public static void navigateToURL(final String uriPage) {
        try {
            WEB_DRIVER.navigate().to(uriPage);
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }
}
