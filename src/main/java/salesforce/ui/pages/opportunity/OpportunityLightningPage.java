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

package salesforce.ui.pages.opportunity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.TransporterPage;

import java.util.List;

import static salesforce.ui.utils.Constants.URI_OPPORTUNITY;
import static salesforce.ui.utils.Constants.URI_OPPORTUNITY_PART_TWO;
import static salesforce.ui.utils.Constants.URL_SALES_FORCE_LIGHTNING;

/**
 * OpportunityLightningPage.
 *
 * @author Oscar Lopez
 * @version 1.0
 */
public class OpportunityLightningPage extends OpportunityPageAbstract {

    /**
     * Variable to actions.
     */
    private Actions actions;

    @FindBy(css = "a.slds-grid")
    private WebElement menuButton;

    @FindBy(css = "div[title='New']")
    private WebElement newButton;

    @FindBy(css = "li.uiMenuItem div[title='Edit']")
    private WebElement editButton;

    @FindBy(css = "input[title='Search Accounts']")
    private WebElement inputAccountName;

    @FindBy(css = "span[title='New Account']")
    private WebElement newAccount;

    @FindBy(css = "div[title='John Doe Test']")
    private WebElement nameAccount;

    @FindBy(css = "span[class='pillText']")
    private WebElement pillNameAccount;

    /**
     * Returns an Opportunity Abstract Page after clicking on menu button.
     *
     * @param idOpportunity
     */
    @Override
    public void clickOnOpportunity(final String idOpportunity) {
        TransporterPage.navigateToURL(URL_SALES_FORCE_LIGHTNING.concat(URI_OPPORTUNITY).concat(idOpportunity)
                .concat(URI_OPPORTUNITY_PART_TWO));
        wait.until(ExpectedConditions.visibilityOf(menuButton));
        menuButton.click();
        actions = new Actions(driver);
        actions.moveToElement(editButton).click().build().perform();
    }

    /**
     * Returns a list with name Opportunity from the Opportunity page.
     *
     * @return a list of names Opportunity as string.
     */
    @Override
    public List<String> getListOfOpportunityName() {
        return null;
    }

    /**
     * Set Account Name.
     *
     * @param nameAccount param.
     */
    @Override
    public void setAccountName(final String nameAccount) {
        inputAccountName.sendKeys(nameAccount);
    }

    /**
     * Get Account Name.
     */
    @Override
    public String getAccountName() {
        return pillNameAccount.getText().trim();
    }

    /**
     * Go to form Abstract Page.
     */
    @Override
    public void goToFormPageAbstract() {
        wait.until(ExpectedConditions.visibilityOf(inputAccountName));
        wait.until(ExpectedConditions.elementToBeClickable(inputAccountName));
        inputAccountName.click();
        nameAccount.click();
    }

    /**
     * Waits until a webElement is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        //wait.until(ExpectedConditions.visibilityOf(inputAccountName));
    }
}
