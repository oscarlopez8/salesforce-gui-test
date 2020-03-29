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
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static salesforce.ui.utils.keys.EventKeys.ASSIGNED_TO;
import static salesforce.ui.utils.keys.EventKeys.SUBJECT;
import static salesforce.ui.utils.keys.EventKeys.START_DATE;
import static salesforce.ui.utils.keys.EventKeys.END_DATE;

/**
 * Event Page Abstract class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public abstract class EventPageAbstract extends BasePage {

    /**
     * Returns a web element for verify the detail event is open.
     *
     * @return an instance web element.
     */
    public abstract WebElement getDetailEvent();

    /**
     * Return the Event page.
     *
     * @return an instance eventPageAbstract.
     */
    public abstract EventPageAbstract getEventPage();

    private Map<String, String> eventDetailInMap = new HashMap<>();

    /**
     * Gets all values from event detail.
     *
     * @param keyEvent is the keys of Event into a set.
     * @return  HashMap of event detail.
     */
    public Map<String, String> getEventDetail(final Set<String> keyEvent) {
        final HashMap<String, Runnable> strategyMap = composeStrategyMap();
        keyEvent.forEach(key -> strategyMap.get(key).run());
        return eventDetailInMap;
    }

    /**
     * Composes an Strategy Map.
     *
     * @return an instance HashMap with keys and methods to run.
     */
    public HashMap<String, Runnable> composeStrategyMap() {
        final HashMap<String, Runnable> eventDetail = new HashMap<>();
        eventDetail.put(ASSIGNED_TO, () -> eventDetailInMap.put(ASSIGNED_TO, getAssignedToUser()));
        eventDetail.put(SUBJECT, () -> eventDetailInMap.put(SUBJECT, getSubject()));
        eventDetail.put(START_DATE, () -> eventDetailInMap.put(START_DATE, getStartDate()));
        eventDetail.put(END_DATE, () -> eventDetailInMap.put(END_DATE, getEndDate()));

        return eventDetail;
    }

    /**
     * Returns the assigned to user of a event detail.
     *
     * @return as a string the assigned to user of a event detail.
     */
    public abstract String getAssignedToUser();

    /**
     * Returns the subject of a event detail.
     *
     * @return as a string the subject of a event detail.
     */
    public abstract String getSubject();

    /**
     * Returns the start date of a event detail.
     *
     * @return as a string the start date of a event detail.
     */
    public abstract String getStartDate();

    /**
     * Returns the end date of a event detail.
     *
     * @return as a string the end date of a event detail.
     */
    public abstract String getEndDate();

    /**
     * Method to go an event page.
     */
    public abstract void goToEventPage();
}
