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

package salesforce.pages;

import core.selenium.util.SalesForceGetProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * LoginPage class.
 *
 * @author Oscar Lopez
 * @version 1.0
 */
public class LoginPage extends BasePage {

    /**
     * Constant for the title of home page.
     */
    public static final String HOME_PAGE_TITLE = "Home Page ~ Salesforce - Developer Edition";

    /**
     * Web element for the user name text-box.
     */
    @FindBy(css = "input#username")
    private WebElement userNameTextBox;

    /**
     * Web element for the password text-box.
     */
    @FindBy(id = "password")
    private WebElement passwordTextBox;

    /**
     * Web element for the login button.
     */
    @FindBy(id = "Login")
    private WebElement loginButton;

    /**
     * Waits to Web Element be visible.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
    }

    /**
     * Login into salesforce.com.
     *
     * @param userName of the user.
     * @param password of the user.
     */
    public void login(final String userName, final String password) {
        setUserName(SalesForceGetProperties.getInstance().getAppProperties().get(userName));
        setPassword(SalesForceGetProperties.getInstance().getAppProperties().get(password));
        clickSignInBtn();
        //wait.until(ExpectedConditions.titleIs(HOME_PAGE_TITLE));
    }

    /**
     * Sets the user name in the text-box.
     *
     * @param userName for the log in.
     */
    public void setUserName(final String userName) {
        userNameTextBox.sendKeys(userName);
    }

    /**
     * Sets the password in the text-box.
     *
     * @param password for the log in.
     */
    public void setPassword(final String password) {
        passwordTextBox.sendKeys(password);
    }

    /**
     * Clicks on sing in button.
     */
    public void clickSignInBtn() {
        loginButton.click();
    }
}
