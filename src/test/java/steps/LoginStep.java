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
import cucumber.api.java.en.Then;
import salesforce.pages.LoginPage;
import salesforce.pages.TransporterPage;

/**
 * LoginStep class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class LoginStep {

    private TransporterPage transporterPage = new TransporterPage();
    private LoginPage loginPage;

    /**
     * This is the login Method
     * @param userName parameter.
     * @param password parameter.
     */
    @Given("I login with {string} and {string}")
    public void iLoginWithAnd(final String userName, final String password) {
        loginPage = transporterPage.navigateToLoginPage();
        loginPage.login(userName, password);
    }
}
