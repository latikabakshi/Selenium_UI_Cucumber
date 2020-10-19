package com.productStore.stepimplementations;

import com.productStore.utilities.WaitHandeler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import pageObjects.DemoApplicationPage;

public class DemoAppplication_StepImp {

    public static Logger log = LogManager.getLogger(DemoAppplication_StepImp.class.getName());
    WaitHandeler wait = new WaitHandeler();
    DemoApplicationPage p = new DemoApplicationPage();
    //class variables
    String cartFinalAmount;

    public void verifyHomePage() throws Exception {
        boolean onHomePage = p.gethomePage().isDisplayed();
        String title = p.getTitle();
        log.info("The title of page is : " + title);
        Assert.assertTrue("User is succesfully navigated to home page", onHomePage);
    }

    public void userClickonCategoryByName(String categoryName) {
        boolean iscategoryPresent = p.getCategorytype(categoryName).isDisplayed();
        if (iscategoryPresent) {
            p.getCategorytype(categoryName).click();
        } else {
            Assert.fail(categoryName + "is not present under categories section on home page ");
        }
    }

    public void userClickOnProduct(String productName) {
        boolean isProductClickable = p.getProductByName(productName).isEnabled();
        if (isProductClickable) {
            p.getProductByName(productName).click();
        } else {
            Assert.fail(productName + "is either not present or clickable on specifed category");
        }
    }

    public void clickOnButton(String button) {
        boolean isButtonClickable = p.getButtonByText(button).isEnabled();
        if (isButtonClickable) {
            p.getButtonByText(button).click();
        } else {
            Assert.fail(button + "is either not present or clickable on product page");
        }
    }

    public void acceptAlert() {
        wait.waitUntilliSAlertPresent(10);
        Alert popUp = p.driver.switchTo().alert();
        popUp.accept();
    }

    public void userClickOnLink(String linkText) {
        boolean isheaderPresent = p.getLinkByTextOnApplicationheader(linkText).isEnabled();
        if (isheaderPresent) {
            p.getLinkByTextOnApplicationheader(linkText).click();
        } else {
            Assert.fail(linkText + "is either not present or clickable on application header");
        }
    }

    public void userDeleteProductFromCartByname(String productName) {
        p.deleteFromCartByProductName(productName);
    }
    public void getCartAmount(){
        cartFinalAmount=p.getTotalCartAmount().getText().trim();
     }

    public void userVerifiesPlaceholerModalPresent() {
        boolean isPlaceOrderPresent = p.getPlaceHolderModal().isDisplayed();
        if (!isPlaceOrderPresent) {
            Assert.fail("Place order modal is  not present on post clicking Purchase button");
        }
    }

    public void enterPlaceOrderFormFeild(String name, String country, String city, String creditCard, String month, String year){
        p.setName().sendKeys(name);
        p.setCountry().sendKeys(country);
        p.setCity().sendKeys(city);
        p.setCard().sendKeys(creditCard);
        p.setMonth().sendKeys(month);
        p.setYear().sendKeys(year);
    }

    public void getPurchaseIdAndAmount(){
        if(p.getSuccessMessage().isDisplayed()) {
            String messageText=p.getMessageBox().getText().trim();

        }else{
            Assert.fail("Order not placed successfully");
        }
        }

    }




