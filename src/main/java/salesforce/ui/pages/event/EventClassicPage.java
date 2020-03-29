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

package salesforce.ui.pages.event;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import salesforce.ui.pages.TransporterPage;

/**
 * Event Page Abstract class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public class EventClassicPage extends EventPageAbstract{


    /**
     * Web element for verify the event classic page is open.
     */
    private TransporterPage transporterPage;
    /**
     * Web element for verify the event classic page is open.
     */
    @FindBy(id = "ep")
    private WebElement detailEvent;

    /**
     * Web element for verifies the assigned to user.
     */
    @FindBy(xpath = "//div[@id='evt1_ileinner']//span/a[last()]")
    private WebElement assignedToUserLnk;

    /**
     * Web element to verify the subject of an Event..
     */
    @FindBy(xpath = "//td[text()='Subject']/following-sibling::td[1]//div")
    private WebElement subjectTxtb;

    /**
     * Web element to verify the name of an Event.
     */
    @FindBy(xpath = "//td[text()='Name']/following-sibling::td[@class='dataCol col02']//a")
    private WebElement nameContactLnk;

    /**
     * Web element to verify the related to account of an Event.
     */
    @FindBy(xpath = "//td[text()='Related To']/following-sibling::td[@class='dataCol col02']//a")
    private WebElement relatedToAccountLnk;

    /**
     * Web element to verify the description of an Event.
     */
    @FindBy(xpath = "//td[text()='Description']/following-sibling::td//div")
    private WebElement descriptionTxtb;

    /**
     * Web element to verify the location of an Event.
     */
    @FindBy(xpath = "//td[text()='Location']/following-sibling::td//div")
    private WebElement locationTxtb;

    /**
     * Web element to verify the start date of an Event.
     */
    @FindBy(id = "StartDateTime_ileinner")
    private WebElement startDateTxtb;

    /**
     * Web element to verifies the end date of an Event.
     */
    @FindBy(id = "EndDateTime_ileinner")
    private WebElement endDateTxtb;

    /**
     * Returns a web element for verify the detail event is open.
     *
     * @return an instance web element.
     */
    @Override
    public WebElement getDetailEvent() {
        return detailEvent;
    }

    /**
     * Returns the event page type EventClassicPage.
     *
     * @return an instance eventClassicPage.
     */
    @Override
    public EventPageAbstract getEventPage() {
        return new EventClassicPage();
    }

    /**
     * Returns the assigned to user of a Event.
     *
     * @return as a string the assigned to user of a Event.
     */
    @Override
    public String getAssignedToUser() {
        return assignedToUserLnk.getText();
    }

    /**
     * Returns the subject of a Event.
     *
     * @return as a string the subject of a Event.
     */
    @Override
    public String getSubject() {
        return subjectTxtb.getText();
    }

    /**
     * Returns the start date of a Event.
     *
     * @return as a string start date of a Event.
     */
    @Override
    public String getStartDate() {
        final String[] dateTime = startDateTxtb.getText().split("    ");
        return dateTime[0];
    }

    /**
     * Returns the end date of a Event.
     *
     * @return as a string end date of a Event.
     */
    @Override
    public String getEndDate() {
        return endDateTxtb.getText();
    }

    /**
     * Method to go an event page.
     */
    @Override
    public void goToEventPage() {

    }

    /**
     * Waits until a webElement is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {

    }
}
