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

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Home Page Classic class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class HomePageClassic extends HomePage {

    /**
     * Web element for the body the the home page in layout classic.
     */
    @FindBy(css = "div[class='bodyDiv brdPalette brandPrimaryBrd']")
    private WebElement bodyHomePage;

    /**
     * Web element to open the event form.
     */
    @FindBy(name = "newEvent")
    private WebElement newEventBtn;

    /**
     * Web element to open the event form.
     */
    @FindBy(id = "setup")
    private WebElement setupButton;

    /**
     * Opens the event form.
     *
     * @return an instance eventClassicForm.
     */
//    public EventFormAbstract openEventForm() {
//        newEventBtn.click();
//        return new EventClassicForm();
//    }

    /**
     * Waits until a webElement is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(bodyHomePage));
    }
}
