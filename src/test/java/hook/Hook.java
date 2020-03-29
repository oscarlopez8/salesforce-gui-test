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

package hook;

import core.selenium.WebDriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import salesforce.ui.utils.TokenGenerator;

/**
 * This class manage the Hooks.
 *
 * @author Oscar Lopez
 * @version 1.0
 */
public class Hook {

    private WebDriver driver;

    private TokenGenerator tokenGenerator;

    /**
     * Initializes getting the web driver from web driver manager.
     */
    public Hook() {
        driver = WebDriverManager.getInstance().getWebDriver();
    }

    /**
     * Takes screenshot after the scenario if it has failed.
     *
     * @param scenario - Scenario to test.
     */
    @After
    public void takeScreenshot(final Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
    }
}
