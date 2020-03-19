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

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.io.File;
import java.util.HashMap;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

/**
 * This class creates a instance Chrome.
 *
 * @author Oscar Lopez
 * @version 1.0
 */
public class Chrome implements IDriver {

    @Override
    public WebDriver initDriver() {

        ChromeDriverManager.getInstance(CHROME).version("80.0.3987.16").setup();

        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        //Boolean which specifies whether we should ask the user if we should download a file (true) or just download it
        //automatically.
        chromePrefs.put("download.prompt_for_download", "false");
        //This configuration allows to download multiples files
        chromePrefs.put("profile.content_settings.exceptions.automatic_downloads.*.setting", 1);

        String path = "C:\\downloads";

        File file = new File(path);
        // String which specifies where to download files to by default.
        chromePrefs.put("download.default_directory", file.getAbsolutePath());
        // To avoid alert message when download XML Files.
        chromePrefs.put("safebrowsing.enabled", "true");

        ChromeOptions chromeOptions = new ChromeOptions();
        // Passing the disable-infobars ChromeOption to the WebDriver,
        // prevents Chrome from displaying this notification.
        // -- Chrome is being controlled by automated test software --
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.setExperimentalOption("prefs", chromePrefs);

        //Use to ignore ssl errors
        chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        chromeOptions.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);

        //Todo Add more code here if need to do some configurations
        return new ChromeDriver(chromeOptions);
    }
}
