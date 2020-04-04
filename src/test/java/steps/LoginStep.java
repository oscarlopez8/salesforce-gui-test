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
import cucumber.api.java.en.When;
import org.testng.Assert;
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
    public void amLoggedInSalesForceWithAnd(final String userName, final String password) {
        loginPage = transporterPage.navigateToLoginPage();
        loginPage.login(userName, password);
    }

    @Given("Url Login Page")
    public void urlLoginPage() {
        loginPage = transporterPage.navigateToLoginPage();
    }

    @Then("Login should be unsuccessful")
    public void loginShouldBeUnsuccessful() {

        String expectedResult = "Compruebe su nombre de usuario y contrase\u00f1a. Si sigue sin poder iniciar " +
        "sesi\u00f3n, p\u00f3ngase en contacto con su administrador de Salesforce.";
        String actualResult = loginPage.getErrorMessage();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @When("I enter Username as {string} and Password as {string}")
    public void enterUsernameAsAndPasswordAs(final String userName, final String password) {
        loginPage.loginOutLine(userName,password);
    }
}
