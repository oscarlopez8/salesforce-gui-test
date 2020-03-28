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

package salesforce.ui.pages.navbar;

import salesforce.ui.pages.BasePage;
import salesforce.ui.pages.cases.CasePageAbstract;
import salesforce.ui.pages.opportunity.OpportunityPageAbstract;

/**
 * Navigation Bar Abstract class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public abstract class NavBar extends BasePage {

    /**
     * Returns Case page after clicking on contact option.
     *
     * @return an Case page.
     */
    public abstract CasePageAbstract goToCasePage();

    /**
     * Returns Opportinuty page after clicking on contact option.
     *
     * @return an Opportinuty page.
     */
    public abstract OpportunityPageAbstract goToOpportunityPage();
}
