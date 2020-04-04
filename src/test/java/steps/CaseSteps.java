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

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import salesforce.api.AccountAPI;
import salesforce.entities.Context;
import salesforce.ui.pages.AppPageFactory;
import salesforce.ui.pages.app.BaseAppPageAbstract;
import salesforce.ui.pages.cases.CaseClassicForm;
import salesforce.ui.pages.cases.CaseDetailsAbstract;
import salesforce.ui.pages.cases.CaseFormAbstract;
import salesforce.ui.pages.cases.CasePageAbstract;

import java.util.Map;

import static salesforce.ui.utils.Constants.PAGE_CLASSIC;
import static salesforce.ui.utils.Constants.PAGE_LAYOUT_TYPE;

/**
 * Case Steps class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class CaseSteps {

    /**
     * Variable for the response of request to API.
     */
    private Response response;

    /**
     * Variable for the id Case.
     */
    private String id;

    /**
     * Variable for the context.
     */
    private Context context;

    /**
     * Variable for the Base App Page Abstract page.
     */
    private BaseAppPageAbstract baseAppPage;

    /**
     * Variable for the Case Abstract page.
     */
    private CasePageAbstract casePage;

    /**
     * Variable for the case form.
     */
    private CaseFormAbstract caseForm;

    /**
     * Variable for the case form.
     */
    private CaseDetailsAbstract caseDetails;

    /**
     * Constructor of Case steps sending the context.
     *
     * @param context init the context.
     */
    public CaseSteps(final Context context) {
        this.context = context;
    }

    /**
     * Opens the Case form from Cases page.
     */
    @When("I open the Case form from Cases page")
    public void openTheCaseFormFromCasesPage() {
        caseForm = casePage.clickNewBtn();
        //caseForm.getStatus();
    }

    /**
     * Creates a new Case with the following information.
     *
     * @param caseMap map param.
     */
    @When("I create a new Case with the following information")
    public void createANewCaseWithTheFollowingInformation(final Map<String, String> caseMap) {
        caseForm.clickOnSaveButton(caseMap);
    }

    @When("I open the Case page")
    public void openTheCasePage() {
        baseAppPage = AppPageFactory.getBaseAppPage();
        casePage = baseAppPage.getNavBar().goToCasePage();
    }

    @When("I do click on Details Menu")
    public void soClickOnDetailsMenu() {
        caseDetails = AppPageFactory.getCaseDetailsPage();
        caseDetails.clickOnDetails();
    }

    @When("I close the Case")
    public void closeTheCase() {
        caseDetails.closeTheCase();
    }

    @Then("The case should be closed.")
    public void theCaseShouldBeClosed() {
        if (PAGE_LAYOUT_TYPE.equals(PAGE_CLASSIC)) {
            String expectedResult = "Closed.";
            Assert.assertEquals(caseDetails.getCaseClosed(), expectedResult);
        } else {
            String expectedResult = "Case status updated";
            Assert.assertEquals(caseDetails.getCaseClosed(), expectedResult);
        }


    }
}
