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

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber",
                "json:target/cucumber.json"},
        glue = {"steps", "hooks"},
        features = {"src/test/resources/features"},
        monochrome = true)
public class RunCukesTest extends AbstractTestNGCucumberTests {

    /**
     * Generates de utils after the test execution. Also quits from the browser.
     */
    @AfterTest
    public void afterExecution() {
        ReportGenerator.generateReport();
        WebDriverManager.getInstance().getWebDriver().quit();
    }
}
