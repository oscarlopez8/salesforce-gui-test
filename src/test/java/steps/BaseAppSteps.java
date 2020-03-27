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
import salesforce.ui.pages.AppPageFactory;
import salesforce.ui.pages.app.BaseAppPageAbstract;
import salesforce.ui.pages.cases.CasePageAbstract;

/**
 * BaseAppSteps Class.
 *
 * @author Oscar Lopez
 * @version 1.0
 */
public class BaseAppSteps {

    /**
     * Variable for the Case page.
     */
    private CasePageAbstract casePage;

    /**
     * Variable for the base app page.
     */
    private BaseAppPageAbstract baseAppPage;

    /**
     * Opens the case page.
     */
    @When("I open the Case page")
    public void goToCasePage() {
        baseAppPage = AppPageFactory.getBaseAppPage();
        casePage = baseAppPage.getNavBar().goToCasePage();
    }
}
