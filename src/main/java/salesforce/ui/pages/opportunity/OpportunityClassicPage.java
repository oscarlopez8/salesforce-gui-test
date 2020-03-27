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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.TransporterPage;

import java.util.ArrayList;
import java.util.List;

import static salesforce.ui.utils.Constants.URL_SALES_FORCE;

/**
 * OpportunityClassicPage Class.
 *
 * @author Oscar Lopez
 * @version 1.0
 */
public class OpportunityClassicPage extends OpportunityPageAbstract {

    /**
     * List of web elements opportunity name.
     */
    @FindBy(css = "th[class=' dataCell  ']")
    private List<WebElement> opportunityNameList;

    /**
     * Button New Web Element.
     */
    @FindBy(name = "new")
    private WebElement btnNew;

    /**
     * Web Element Button New.
     */
    @FindBy(css = "td[id='topButtonRow'] input[name='edit']")
    private WebElement btnEdit;

    /**
     * Web Element Button New Account.
     */
    @FindBy(css = "#opp4_lkwgt > img")
    private WebElement btnNewAccount;

    /**
     * Button New WebElement.
     */
    @FindBy(css = "input[class=btn][name='new']")
    private WebElement buttonNew;

    /**
     * inputTextName WebElement.
     */
    @FindBy(css = "div[class='requiredInput'] input[name='2']")
    private WebElement inputTextName;

    /**
     * inputTextCity WebElement.
     */
    @FindBy(css = "input[name='city']")
    private WebElement inputTextCity;

    /**
     * Phone WebElement.
     */
    @FindBy(css = "td[class='data2Col'] input[name='10']")
    private WebElement inputTextPhone;

    /**
     * InputTextName WebElement.
     */
    @FindBy(css = "td[class='last data2Col'] input[name='12']")
    private WebElement inputTextWebSite;

    /**
     * Button New WebElement.
     */
    @FindBy(css = "td[id='topButtonRow'] input[name='save']")
    private WebElement buttonSave;

    /**
     * Button New WebElement.
     */
    @FindBy(css = "input[name='opp4']")
    private WebElement accountName;

      /**
     * Returns an Opportunity Abstract Page after clicking on menu button.
     *
     */
    @Override
    public void clickOnOpportunity(final String idOpportunity) {
        TransporterPage.navigateToURL(URL_SALES_FORCE.concat(idOpportunity));
        wait.until(ExpectedConditions.visibilityOf(btnEdit));
        btnEdit.click();
    }

    /**
     * Returns a list with name Opportunity from the Opportunity page.
     *
     * @return a list of names Opportunity as string.
     */
    @Override
    public List<String> getListOfOpportunityName() {
        final List<String> opportunityNames = new ArrayList<>();
        for (WebElement accountName : opportunityNameList) {
            opportunityNames.add(accountName.getText());
        }
        return opportunityNames;
    }

    /**
     * Set Account Name.
     *
     * @param nameAccount param.
     */
    @Override
    public void setAccountName(final String nameAccount) {
        accountName.sendKeys(nameAccount);
    }

    /**
     * Get Account Name.
     */
    @Override
    public String getAccountName() {
        return accountName.getAttribute("value");
    }


    @Override
    public void goToFormPageAbstract() {
        // To do
    }

    /**
     * Waits until a webElement is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(btnNew));
    }
}
