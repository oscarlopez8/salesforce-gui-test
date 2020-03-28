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

package salesforce.ui.pages.home;


import core.selenium.util.SalesForceGetProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import salesforce.ui.pages.BasePage;

/**
 * Home Page class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public abstract class HomePage extends BasePage {

    /**
     * Constructor of Home Page.
     */
    public HomePage() {
        switchToLightning();
    }

    /**
     * To switch To Lightning layout.
     */
    public void switchToLightning() {
        String layoutPage = SalesForceGetProperties.getInstance().getAppProperties().get("layoutpage").toLowerCase();

        if (!driver.getCurrentUrl().contains("lightning") && layoutPage.equals("lightning")) {
            WebElement switchToLightning = driver.findElement(By.cssSelector("a.switch-to-lightning"));
            switchToLightning.click();
        } else if (driver.getCurrentUrl().contains("lightning") && layoutPage.equals("classic")) {
            WebElement switchToClassic = driver.findElement(
                    By.xpath("//a[@class='profile-link-label switch-to-aloha uiOutputURL']"));
            switchToClassic.click();
        }
    }
}
