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

package steps;

import cucumber.api.java.en.Given;
import salesforce.ui.pages.LoginPage;
import salesforce.ui.pages.TransporterPage;

/**
 * LoginStep class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class LoginStep {

    /**
     * Variable for the page transporter.
     */
    private TransporterPage transporterPage = new TransporterPage();

    /**
     * Variable for the home page.
     */
    private LoginPage loginPage;

    /**
     * This is the login Method.
     * @param userName parameter.
     * @param password parameter.
     */
    @Given("I am logged in SalesForce with {string} and {string}")
    public void iAmLoggedInSalesForceWithAnd(final String userName, final String password) {
        loginPage = transporterPage.navigateToLoginPage();
        loginPage.login(userName, password);
    }
}
