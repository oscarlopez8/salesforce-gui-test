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

package salesforce.ui.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date Methods class.
 *
 * @author Oscar Lopez.
 * @version 1.0
 */
public final class DateMethods {

    /**
     * Constant for the patter of hour of a Date.
     */
    private static final String PATTERN_TIME = "h:mm a";

    /**
     * Constant for the patter of fe of a Date.
     */
    private static final String PATTERN_DATE = "dd-MM-yyyy";

    /**
     * Constant for number Zero.
     */
    private static final short ZERO = 0;

    /**
     * Constant for number one.
     */
    private static final short ONE = 1;

    /**
     * Constant for number two.
     */
    private static final short TWO = 2;

    /**
     * Constant for number ten.
     */
    private static final short TEN = 10;

    /**
     * Constat for number eleven.
     */
    private  static final short ELEVEN = 11;
    /**
     * Constant for number Twelve.
     */
    private static final short TWELVE = 12;

    /**
     * Constructor method class.
     */
    private DateMethods() {
    }

    /**
     * Returns the hour with a format as a string.
     *
     * @param date    is the information by get a time.
     * @param addHour is information by add hours.
     * @return a hour with a format as a string..
     */
    public static String getHourBefore(final Date date, final int addHour) {
        String resTime = "";
        final String timeAsString = convertDateToString(date, PATTERN_TIME);
        String dateAsString = convertDateToString(date, PATTERN_DATE);
        final String[] dateHour = (timeAsString).split(":", TWO);
        final String[] minAndBeforeAfterMidday = dateHour[ONE].split(" ");
        final int hour = Integer.parseInt(dateHour[ZERO]);
        final int nextHour = hour + addHour;
        if ((ONE <= nextHour) && (nextHour <= ELEVEN)) {
            resTime = addZeroBeforeString(nextHour).concat(":" + dateHour[ONE]);
        } else {
            if (hour == TWELVE) {
                resTime = addZeroBeforeString(ONE) + ":" + dateHour[ONE];
            } else {
                if ((minAndBeforeAfterMidday[ONE].compareTo("AM")) == ZERO) {
                    resTime = addZeroBeforeString(nextHour) + ":" + minAndBeforeAfterMidday[ZERO].concat("PM");
                } else {
                    dateAsString = addDayInDate(dateAsString);
                    resTime = addZeroBeforeString(nextHour) + ":" + minAndBeforeAfterMidday[ZERO].concat("AM");
                }
            }
        }
        return dateAsString.concat(" " + resTime);
    }

    /**
     * Returns the number add an space and zero before it.
     *
     * @param number is for verifies if value need a zero before it.
     * @return as a string the number with space an zero.
     */
    private static String addZeroBeforeString(final int number) {
        return number < TEN ? ("0" + (number)) : Integer.toString(number);
    }

    /**
     * Adds one day in the date.
     *
     * @param date is a date as string for add a day.
     * @return as a string the next day in a date.
     */
    private static String addDayInDate(final String date) {
        final String[] dayDate = (date).split("-", 2);
        final int day = Integer.parseInt(dayDate[0]) + 1;
        return addZeroBeforeString(day).concat(dayDate[1]);
    }

    /**
     * Returns the date or time as a string of a date..
     *
     * @param date is the date as a string.
     * @param nameDateOrTime is the value that get the date.
     * @return as a strin the date or time.
     */
    public static String getDateTime(final String date, final String nameDateOrTime) {
        final String[] arrayDate = date.split(" ", 2);
        return nameDateOrTime.equals("date") ? arrayDate[0] : arrayDate[1];
    }

    /**
     * Converts a date to string applying a pattern.
     *
     * @param date    changes of type to convert in a string, applying "pattern" variable
     * @param pattern is format that assign to "date" parameter.
     * @return an string build from a "date" parameter.
     */
    private static String convertDateToString(final Date date, final String pattern) {
        // Create an instance of SimpleDateFormat used for formatting
        // the string representation of date according to the chosen pattern
        final DateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(date);

    }
}
