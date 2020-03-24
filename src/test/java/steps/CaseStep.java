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
import io.restassured.response.Response;
import salesforce.entities.Context;
import salesforce.ui.pages.AppPageFactory;
import salesforce.ui.pages.app.BaseAppPageAbstract;
import salesforce.ui.pages.cases.CasePageAbstract;

/**
 * CaseStep Class.
 *
 * @author Oscar Lopez
 * @version 1.0
 */
public class CaseStep {

    /**
     * Variable for the response of request to API.
     */
    private Response response;

    /**
     * Variable for the context.
     */
    private Context context;

    /**
     * Variable for the accounts page.
     */
    private CasePageAbstract casePage;

    /**
     * Variable for the base app page.
     */
    private BaseAppPageAbstract baseAppPage;

    /**
     * Constructor of Case steps sending the context.
     *
     * @param context init the context.
     */
    public CaseStep(final Context context) {
        this.context = context;
    }
}
