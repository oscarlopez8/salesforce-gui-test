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

package core.selenium.webdrivers;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.io.File;
import java.util.HashMap;

import static io.github.bonigarcia.wdm.DriverManagerType.FIREFOX;

/**
 * This class creates a instance of FireFox.
 *
 * @author Oscar Lopez
 * @version 1.0
 */
public class FireFox implements IDriver {

    /**
     * Initializes FireFox driver.
     * @return A new geckodriver.
     */
    @Override
    public WebDriver initDriver() {
        FirefoxDriverManager.getInstance(FIREFOX).version("73.0.1").setup();

        HashMap<String, Object> fireFoxPrefs = new HashMap<String, Object>();

        fireFoxPrefs.put("profile.default_content_settings.popups", 0);
        //Boolean which specifies whether we should ask the user if we should download a file (true) or just download it
        //automatically.
        fireFoxPrefs.put("download.prompt_for_download", "false");
        //This configuration allows to download multiples files
        fireFoxPrefs.put("profile.content_settings.exceptions.automatic_downloads.*.setting", 1);

        String path = "C:\\downloads";

        File file = new File(path);
        // String which specifies where to download files to by default.
        fireFoxPrefs.put("download.default_directory", file.getAbsolutePath());
        // To avoid alert message when download XML Files.
        fireFoxPrefs.put("safebrowsing.enabled", "true");

        FirefoxOptions firefoxOptions = new FirefoxOptions();

        //Use to ignore ssl errors
        firefoxOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        //firefoxOptions.setCapability(firefoxOptions., firefoxOptions);
        firefoxOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);

        //Todo Add more code here if need to do some configurations
        return new FirefoxDriver(firefoxOptions);
    }
}
