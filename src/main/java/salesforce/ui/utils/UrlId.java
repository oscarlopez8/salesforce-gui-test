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

package salesforce.ui.utils;

import core.selenium.util.SalesForceGetProperties;
import salesforce.ui.pages.AppPageFactory;
import salesforce.ui.pages.PageUserExperienceType;

/**
 * Url Id class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class UrlId {

    /**
     * Variable to save the page layout type.
     */
    /**
     * Constant for the page layout type.
     */
    private static final String PAGE_LAYOUT_TYPE = PageUserExperienceType.getPageLayoutName();

    /**
     * Constructor of UrlComponents.
     */
    protected UrlId() { }

    /**
     * Returns a new instance of url components.
     *
     * @return an urlComponents.
     */
    public static UrlId getInstance() {
        return new UrlId();
    }

    /**
     * Returns the id for a object from the url.
     *
     * @param url to do a split of the id.
     * @return the id as string.
     */
    public static String splitUrlToId(final String url) {
        String[] idArray = url.split("/");
        String id = "";
        if (PAGE_LAYOUT_TYPE.equals("classic")) {
            id = idArray[idArray.length - 1];
        } else if (PAGE_LAYOUT_TYPE.equals("lightning")) {
            id = idArray[idArray.length - 2];
        }
        return id;
    }
}
