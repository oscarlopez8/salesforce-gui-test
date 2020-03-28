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
import io.restassured.response.Response;
import salesforce.entities.Context;
import salesforce.ui.pages.AppPageFactory;
import salesforce.ui.pages.cases.CaseFormAbstract;
import salesforce.ui.pages.cases.CasePageAbstract;

import java.util.Map;

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
     * Variable for the context.
     */
    private Context context;

    /**
     * Variable for the Case Abstract page.
     */
    private CasePageAbstract casePage;

    /**
     * Variable for the case form.
     */
    private CaseFormAbstract caseForm;

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
    @And("I open the Case form from Cases page")
    public void openTheCaseFormFromCasesPage() {
        casePage = AppPageFactory.getCasePage();
        caseForm = casePage.clickNewBtn();
    }

    /**
     * Creates a new Case with the following information.
     *
     * @param caseMap map param.
     */
    @And("I create a new Case with the following information")
    public void createANewCaseWithTheFollowingInformation(final Map<String, String> caseMap) {

    }
}
