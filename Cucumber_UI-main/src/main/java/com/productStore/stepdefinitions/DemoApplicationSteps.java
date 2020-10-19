package com.productStore.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.productStore.stepimplementations.DemoAppplication_StepImp;

public class DemoApplicationSteps {
        DemoAppplication_StepImp steps=new DemoAppplication_StepImp();

        @Given("^User is on Homepage$")
        public void user_is_on_Homepage() throws Throwable {
                steps.verifyHomePage();
        }

        @When("^User Navigate to \"([^\"]*)\" category$")
        public void user_Navigate_to_category(String categoryName){
                steps.userClickonCategoryByName(categoryName);
        }

        @When("^User click on \"([^\"]*)\"$")
        public void user_click_on(String linkName) {
                steps.userClickOnLink(linkName);
        }

        @When("^User Navigate to \"([^\"]*)\"$")
        public void user_Navigate_to(String categoryName) {
                steps.userClickonCategoryByName(categoryName);
        }

        @When("^User click on \"([^\"]*)\" product$")
        public void user_click_on_product(String productName){
                steps.userClickOnProduct(productName);
        }

        @When("^User click on \"([^\"]*)\" button$")
        public void user_click_on_button(String buttonText) {
                   steps.clickOnButton(buttonText);
        }

        @Then("^User Accepts pop up$")
        public void user_Accepts_pop_up() {
                steps.acceptAlert();
        }

        @Then("^User Deletes following product from cart \"([^\"]*)\"$")
        public void user_Deletes_following_product_from_cart(String productName) throws Throwable {
                steps.userDeleteProductFromCartByname(productName);
        }

        @Then("^Place order model appears$")
        public void place_order_model_appears()  {
                steps.userVerifiesPlaceholerModalPresent();
        }

        @Then("^User enter feild values in form Name as \"([^\"]*)\",Country as \"([^\"]*)\",City as \"([^\"]*)\",Credit card as \"([^\"]*)\",Month as \"([^\"]*)\",Year as \"([^\"]*)\"$")
        public void user_enter_feild_values_in_form_Name_as_Country_as_City_as_Credit_card_as_Month_as_Year_as(String name, String country, String city, String creditCard, String month, String year) throws Throwable {
                steps.enterPlaceOrderFormFeild(name,country,city,creditCard,month,year);
        }

        @Then("^User check updated amount on cart is correct$")
        public void user_check_updated_amount_on_cart_is_correct() throws Throwable {
                 steps.getCartAmount();
        }

        @Then("^User captures Purchase Id and Amount$")
        public void user_captures_Purchase_Id_and_Amount() throws Throwable {
                steps.getPurchaseIdAndAmount();
        }

        @Then("^User verifies purchase amount equals product cart amount$")
        public void user_verifies_purchase_amount_equals_product_cart_amount() throws Throwable {

        }



}


