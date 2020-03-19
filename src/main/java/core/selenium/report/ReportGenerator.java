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

package core.selenium.report;

import core.selenium.util.GetProperties;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * This class creates a instance of Browser.
 *
 * @author Oscar Lopez
 * @version 1.0
 */
public final class ReportGenerator {

    // Path of gradle properties file.
    public static final String PATH_OF_GRADLE_PROPERTIES_FILE = "gradle.properties";
    public static final String BROWSER = "gradle.properties";

    /**
     * Constructor of a class.
     */
    private ReportGenerator() {

    }

    /**
     * Sets up and creates the cucumber report.
     */
    public static void generateReport() {
        Properties properties = GetProperties.getProperties(PATH_OF_GRADLE_PROPERTIES_FILE);
        final File reportOutputDirectory = new File("target");
        final List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/cucumber.json");
        final String projectName = "Trello-GUI";
        final boolean runWithJenkins = false;
        final Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        // additional metadata presented on main page
        configuration.addClassifications("Platform", "Windows 10");
        configuration.addClassifications("Browser", properties.getProperty(BROWSER));
        configuration.addClassifications("Branch", "RELEASE/1.0");
        final ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        final Reportable result = reportBuilder.generateReports();
    }
}
