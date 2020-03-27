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

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;

/**
 * Account Classic Page class.
 *
 * @author Limbert Vargas.
 * @version 1.0
 */
public class AccountClassicPage extends BasePage {

    /**
     *  Locator for User button.
     */
    @FindBy(id = "userNavLabel")
    private WebElement userMenuButton;

    /**
     * Locator for My Setting option button.
     */
    @FindBy(css = "a[title='My Settings']")
    private WebElement mySettingsButton;

    /**
     * Locator for Account option.
     */
    @FindBy(css = "tr.dataRow.even.first>th>a")
    private WebElement account;

    /**
     * Locator for detect an Account.
     */
    @FindBy(css = "div[class*=first]")
    private WebElement firstRelatedList;

    /**
     * Click un User name button.
     */
    public void clickUserMenuButton() {
        userMenuButton.click();
    }

    /**
     * Click in My Setting option.
     */
    public void clickMySettingsButton() {
        mySettingsButton.click();
    }

    /**
     * Click in Account tittle option.
     */
    public void clickAccount() {
        account.click();
    }

    /**
     * Get a Text of the Accounts.
     * @return a text
     */
    public String containFirstRelatedList() {
        return firstRelatedList.findElement(By.cssSelector("td.pbTitle>h3")).getAttribute("innerText");
    }

    /**
     * Waits until a webElement is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.invisibilityOf(firstRelatedList));
    }
}
