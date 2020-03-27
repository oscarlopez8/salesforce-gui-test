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

package salesforce.ui.pages.cases;

import salesforce.ui.pages.BasePage;

/**
 * Case Page Abstract class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public abstract class CasePageAbstract extends BasePage {

    /**
     * Returns an Case Form page after clicking on new button.
     *
     * @return an case form page.
     */
    public abstract CaseFormAbstract clickNewBtn();

    /**
     * Return the Case page.
     *
     * @return an instance eventPageAbstract.
     */
    public abstract CasePageAbstract getCasePage();
}
