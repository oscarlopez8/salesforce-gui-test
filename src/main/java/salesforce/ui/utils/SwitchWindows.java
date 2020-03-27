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

import core.selenium.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Set;

/**
 * Switch hWindows.
 *
 * @author Alan Escalera.
 * @version 1.0
 */
public final class SwitchWindows {

    /**
     * Constructor Class.
     */
    private SwitchWindows() {

    }

    private static final int TWO_WINDOWS = 2;

    /**
     * Switches to new windows.
     * @param parentHandle string value.
     */
    public static void switchToNewWindow(final String parentHandle) {
        WebDriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.numberOfWindowsToBe(TWO_WINDOWS));
        Set<String> handles = WebDriverManager.getInstance().getWebDriver().getWindowHandles();
        for (String winHandle : handles) {
            if (!parentHandle.equals(winHandle)) {
                WebDriverManager.getInstance().getWebDriver().switchTo().window(winHandle);
                break;
            }
        }
    }
}
