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

package runner;

import core.selenium.WebDriverManager;
import core.selenium.report.ReportGenerator;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;


/**
 * This class to TestNG hooks.
 *
 * @author Oscar Lopez
 * @version 1.0
 */
public class RunCukesTest extends AbstractTestNGCucumberTests {

    /**
     * Generates de utils after the test execution. Also quits from the browser.
     */
    @AfterTest
    public void afterExecution() {
        ReportGenerator.getInstance().generateReport();
        WebDriverManager.getInstance().getWebDriver().quit();
    }
}
