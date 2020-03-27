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

package salesforce.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Show All Tabs Page class.
 *
 * @author Limbert Vargas.
 * @version 1.0
 */
public class ShowAllTabsPage extends BasePage {

    /**
     * Locator of Accounts option.
     */
    @FindBy(css = "td.dataCol.accountBlock>a")
    private WebElement accountsBlock;

    /**
     * Click on Accounts button.
     */
    public void clickAccountsBlock() {
        accountsBlock.click();
    }

    /**
     * Waits until a webElement is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.elementToBeClickable(accountsBlock));
    }
}
