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

import org.openqa.selenium.WebElement;
import salesforce.ui.pages.BasePage;

/**
 * Case Page Abstract class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public abstract class CasePageAbstract extends BasePage {

    /**
     * Returns a web element for verify the detail event is open.
     *
     * @return an instance web element.
     */
    public abstract WebElement buttonNew();

    /**
     * Return the Case page.
     *
     * @return an instance eventPageAbstract.
     */
    public abstract CasePageAbstract getCasePage();
}
