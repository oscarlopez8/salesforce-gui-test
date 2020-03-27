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

/**
 * Base Case Lightning Page class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class CaseLightningPage extends CasePageAbstract {

    /**
     * Returns an Case Form page after clicking on new button.
     *
     * @return an case form page.
     */
    @Override
    public CaseFormAbstract clickNewBtn() {
        return null;
    }

    /**
     * Return the Case page.
     *
     * @return an instance eventPageAbstract.
     */
    @Override
    public CasePageAbstract getCasePage() {
        return null;
    }

    /**
     * Waits until a webElement is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {

    }
}
