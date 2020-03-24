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

import cucumber.api.java.en.When;
import salesforce.ui.pages.TransporterPage;
import salesforce.ui.pages.home.HomePage;

/**
 * HomeStep Class.
 *
 * @author Oscar Lopez
 * @version 1.0
 */
public class HomeStep {

    /**
     * Variable for the home page.
     */
    private HomePage homePage;

    /**
     * Variable for the page transporter.
     */
    private TransporterPage transporterPage = new TransporterPage();

    /**
     * Home Page.
     */
    @When("I be on the Homepage")
    public void iBeOnTheHomepage() {
        homePage = transporterPage.navigateToHomePage();
    }
}
