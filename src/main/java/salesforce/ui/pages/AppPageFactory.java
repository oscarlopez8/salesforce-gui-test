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

import salesforce.ui.pages.home.HomePage;
import salesforce.ui.pages.home.HomePageClassic;
import salesforce.ui.pages.home.HomePageLightning;

/**
 * App Page Factory class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class AppPageFactory {

    /**
     * Constant for the page layout type.
     */
    private static final String PAGE_LAYOUT_TYPE = PageUserExperienceType.getPageLayoutName();

    /**
     * Constant for the message of exception.
     */
    public static final String MESSAGE_FOR_UNKNOWN_LAYOUT = "Unknown layout type";

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
        final HomePage homePage;
        switch (PAGE_LAYOUT_TYPE) {
            case "classic":
                homePage = new HomePageClassic();
                break;
            case "lightning":
                homePage = new HomePageLightning();
                break;
            default:
                throw new RuntimeException(MESSAGE_FOR_UNKNOWN_LAYOUT);
        }
        return homePage;
    }
}
