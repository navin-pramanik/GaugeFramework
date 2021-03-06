package com.automation.stepDefs;


import com.automation.pages.ElementsPage;
import com.thoughtworks.gauge.Step;

public class ElementsPageStepDefs {

    ElementsPage elementsPage = new ElementsPage();

    @Step("User click on Elements section")
    public void clickOnElementSection()  {
        elementsPage.clickElementsSection();
    }

    @Step("User click on Text box element")
    public void clickOnTextBox()  {
        elementsPage.clickTextBox();
    }

    @Step("User click on Check box element")
    public void clickOnCheckBox()  {
        elementsPage.clickCheckBox();
    }

    @Step("User perform double click on DoubleClickButton element")
    public void doubleclick(){
        elementsPage.doubleClickOnButton();
    }

    @Step("User perform right click on RightClickButton element")
    public void rightClick(){
        elementsPage.rightClickOnButton();
    }

    @Step("User click on Button section")
    public void clickOnButtonSection()  {
        elementsPage.clickOnButtonSection();
    }
}
