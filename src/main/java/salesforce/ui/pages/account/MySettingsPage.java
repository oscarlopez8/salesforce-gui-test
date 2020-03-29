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

package salesforce.ui.pages.account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import salesforce.ui.pages.BasePage;

import java.util.List;

/**
 * My Settings Page class.
 *
 * @author Limbert Vargas.
 * @version 1.0
 */
public class MySettingsPage extends BasePage {

    /**
     * Locator of Display and Layout button.
     */
    @FindBy(id = "DisplayAndLayout_font")
    private WebElement displayAndLayoutButton;

    /**
     * locator for Customize My Pages option.
     */
    @FindBy(id = "CustomizeDisplay_font")
    private WebElement customizeMyPageButton;

    /**
     * locator of Dropbox to select options.
     */
    @FindBy(id = "pageid")
    private WebElement configurePageDropbox;

    /**
     * Locator for select an option into the Dropbox.
     */
    @FindBy(css = "#pageid>option")
    private List<WebElement> optionsConfigurePageDropbox;

    /**
     * locator of Customize Page button.
     */
    @FindBy(name = "customizePageSubmit")
    private WebElement customizePageButton;

    /**
     * Locator for Selected List field.
     */
    @FindBy(id = "duel_select_1")
    private WebElement optionReleatedList;

    /**
     * Locator for Up arrow button.
     */
    @FindBy(id = "duel_select_1_up")
    private WebElement upButton;

    /**
     * Locator of Save button.
     */
    @FindBy(css = "input.btn.primary")
    private WebElement saveButton;

    /**
     * Click Display and Layout button.
     */
    public void clickDisplayAndLayoutButton() {
        displayAndLayoutButton.click();
    }

    /**
     * Click on Customize My Page option.
     */
    public void clickCustomizeMyPage() {
        customizeMyPageButton.click();
    }

    /**
     * Click on Dropbox to display it.
     */
    public void clickConfigurePageDropbox() {
        configurePageDropbox.click();
    }

    /**
     * Click an option into the Dropbox.
     */
    public void clickOptionConfigurePageDropbox() {
        optionsConfigurePageDropbox.get(1).click();
    }

    /**
     * Click on Customize Page button.
     */
    public void clickCustomizePage() {
        customizePageButton.click();
    }

    /**
     * Select the option in the Selected List field.
     */
    public void selectLastOptionRelatedList() {
        Select optionItem = new Select(optionReleatedList);
        optionItem.selectByIndex(6);
    }

    /**
     * Click on Up arrow button.
     */
    public void clickUpButton() {
        upButton.click();
    }

    /**
     * Click as many times as required to move the option to the top of the list.
     */
    public void moveItem() {
        for (int cont = 0; cont <= 6; cont++) {
            clickUpButton();
        }
    }

    /**
     * Click on Save button.
     */
    public void clickSaveButton() {
        saveButton.click();
    }

    /**
     * Waits to Web Element be visible.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        //wait.until(ExpectedConditions.elementToBeClickable(saveButton));
    }
}
