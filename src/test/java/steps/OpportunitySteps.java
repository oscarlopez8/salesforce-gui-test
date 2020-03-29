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

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import salesforce.api.AccountAPI;
import salesforce.entities.Context;
import salesforce.ui.pages.AppPageFactory;
import salesforce.ui.pages.TransporterPage;
import salesforce.ui.pages.app.BaseAppPageAbstract;
import salesforce.ui.pages.opportunity.OpportunityPageAbstract;
import salesforce.ui.utils.TokenGenerator;

import java.util.Map;

/**
 * Opportunity Steps class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class OpportunitySteps {

    /**
     * Variable for Webdriver.
     */
    private WebDriver driver;

    /**
     * Variable for the Transporter Page.
     */
    private TransporterPage transporterPage;

    /**
     * Variable for the response of request to API.
     */
    private Response response;

    /**
     * Variable for the context.
     */
    private Context context;

    private TokenGenerator tokenAPI;

    /**
     * Variable for the Opportunity Abstract page.
     */
    private OpportunityPageAbstract opportunityPage;

    /**
     * App Base Abstract Page Class.
     */
    private BaseAppPageAbstract baseAppPage;

    /**
     * Constructor of Opportunity steps sending the context.
     *
     * @param context init the context.
     */
    public OpportunitySteps(final Context context) {
        this.context = context;
    }

    /**
     * Open Opportunity Page.
     */
    @When("I open the Opportunity page")
    public void openTheOpportunityPage() {
        baseAppPage = AppPageFactory.getBaseAppPage();
        opportunityPage = baseAppPage.getNavBar().goToOpportunityPage();
    }

    /**
     * Opportunity form from Opportunity page.
     */
    @When("I am on the Opportunity form from Opportunity page")
    public void onTheOpportunityFormFromOpportunityPage() {
        opportunityPage.clickOnOpportunity(context.getOpportunity().getId());
        opportunityPage.setAccountName(context.getAccount().getAccountName());
        opportunityPage.goToFormPageAbstract();
    }

    /**
     * Creates a new Account with the following information.
     * @param newAccount map. param.
     */
    @When("I create a new Account with the following information")
    public void createANewAccountWithTheFollowingInformation(final Map<String, String> newAccount) {
        context.getAccount().setAccountName(newAccount.get("Name"));
        context.getAccount().setId(AccountAPI.getInstance().createAccount(newAccount));
    }

    /**
     * Account name should be displayed in the Account Name input Text.
     */
    @Then("The account name should be displayed in the Account Name input Text")
    public void theAccountNameShouldBeDisplayedInTheAccountNameInputText() {
        String expectedResult = "John Doe Test";
        System.out.println(opportunityPage.getAccountName());
        Assert.assertEquals(opportunityPage.getAccountName(), expectedResult);
    }
}
