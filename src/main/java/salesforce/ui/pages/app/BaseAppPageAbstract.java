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

package salesforce.ui.pages.app;

import salesforce.ui.pages.BasePage;
import salesforce.ui.pages.navbar.NavBar;

/**
 * Base App PageAbstract class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public abstract class BaseAppPageAbstract extends BasePage {

    /**
     * Gets NavBar.
     *
     * @return NavBar.
     */
    public abstract NavBar getNavBar();

    /**
     * Clicks on the link to change of layout.
     */
    public abstract void clickSwitchLayout();
}
