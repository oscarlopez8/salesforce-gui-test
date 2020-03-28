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

import salesforce.ui.pages.app.BaseAppClassicPage;
import salesforce.ui.pages.app.BaseAppLightningPage;
import salesforce.ui.pages.app.BaseAppPageAbstract;
import salesforce.ui.pages.cases.CaseClassicPage;
import salesforce.ui.pages.cases.CaseFormAbstract;
import salesforce.ui.pages.cases.CaseLightningPage;
import salesforce.ui.pages.cases.CasePageAbstract;
import salesforce.ui.pages.cases.CaseClassicForm;
import salesforce.ui.pages.home.HomePage;
import salesforce.ui.pages.home.HomePageClassic;
import salesforce.ui.pages.home.HomePageLightning;
import salesforce.ui.pages.opportunity.OpportunityClassicPage;
import salesforce.ui.pages.opportunity.OpportunityLightningPage;
import salesforce.ui.pages.opportunity.OpportunityPageAbstract;

/**
 * App Page Factory class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class AppPageFactory {

    /**
     * Constant for the classic layout.
     */
    private static final String PAGE_CLASSIC = "classic";

    /**
     * Constant for the page layout type.
     */
    private static final String PAGE_LAYOUT_TYPE = PageUserExperienceType.getPageLayoutName();

    /**
     * Constructor of App Page Factory.
     */
    protected AppPageFactory() { }

    /**
     * Returns the home page according the page layout.
     *
     * @return a home page.
     */
    public static HomePage getHomePageManager() {
        if (PAGE_LAYOUT_TYPE.equals(PAGE_CLASSIC)) {
            return new HomePageClassic();
        }
        return new HomePageLightning();
    }

    /**
     * Gets the Base App page according the page layout.
     *
     * @return a base app page.
     */
    public static BaseAppPageAbstract getBaseAppPage() {

        if (PAGE_LAYOUT_TYPE.equals(PAGE_CLASSIC)) {
            return  new BaseAppClassicPage();
        }
        return new BaseAppLightningPage();
    }

    /**
     * Returns the case page according the page layout.
     *
     * @return a case page.
     */
    public static CasePageAbstract getCasePage() {

        if (PAGE_LAYOUT_TYPE.equals(PAGE_CLASSIC)) {
            return  new CaseClassicPage();
        }
        return new CaseLightningPage();
    }

    /**
     * Returns the case form page according the page layout.
     *
     * @return a case form page.
     */
    public static CaseFormAbstract getCaseFormPage() {

        if (PAGE_LAYOUT_TYPE.equals(PAGE_CLASSIC)) {
            return  new CaseClassicForm();
        }
        return new CaseClassicForm();
    }

    /**
     * Returns the Opportunity page according the page layout.
     *
     * @return a Opportunity page.
     */
    public static OpportunityPageAbstract getOpportunityPage() {

        if (PAGE_LAYOUT_TYPE.equals(PAGE_CLASSIC)) {
            return  new OpportunityClassicPage();
        }
        return new OpportunityLightningPage();
    }
}
