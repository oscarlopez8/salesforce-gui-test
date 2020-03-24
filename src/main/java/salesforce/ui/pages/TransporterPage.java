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

import core.selenium.WebDriverManager;
import core.selenium.util.SalesForceGetProperties;
import org.openqa.selenium.WebDriver;
import salesforce.ui.pages.home.HomePage;

import java.util.Properties;

/**
 * TransporterPage class provides links to navigate salesforce.com.
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
     * Constant for the page layout type.
     */
    private static final String PAGE_LAYOUT_TYPE = PageUserExperienceType.getPageLayoutName();

    /**
     * Constant for the message of exception.
     */
    private static final String MESSAGE_FOR_UNKNOWN_LAYOUT = "Unknown layout type";

    /**
     * Navigates to the login page.
     *
     * @return a new login page.
     */
    public LoginPage navigateToLoginPage() {
        Properties props = System.getProperties();
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

    /**
     * Navigates a the home page according to the page layout.
     *
     * @return a home page according to the page layout.
     */
    public HomePage navigateToHomePage() {
        switch (PAGE_LAYOUT_TYPE) {
            case "classic":
                navigateToURL(SalesForceGetProperties.getInstance().getAppProperties().get("classic-url"));
                break;
            case "lightning":
                navigateToURL(SalesForceGetProperties.getInstance().getAppProperties().get("lightning-url"));
                break;
            default:
                throw new RuntimeException(MESSAGE_FOR_UNKNOWN_LAYOUT);
        }
        return AppPageFactory.getHomePageManager();
    }
}
