Feature: Demo application

Scenario Outline: Customer navigation through product categories
  Given Initialize the browser with "chrome"
    And Navigates to "https://www.demoblaze.com/prod.html?idp_=8#" Site
    And User is on Homepage
  When User Navigate to "Laptop" category
    And User click on "Sony vaio i5" product
    And User click on "Add to cart" button
  Then User Accepts pop up
  When User click on "Home"
    And User Navigate to "Laptop"
    And User click on "Dell i7 8gb" product
    And User click on "Add to cart" button
  Then User Accepts pop up
  When User click on "Cart"
  Then User Deletes following product from cart "Dell i7 8gb"
    And User check updated amount on cart is correct
    And User click on "Place Order" button
    And Place order model appears
    And User enter feild values in form Name as "<Name>",Country as "<Country>",City as "<City>",Credit card as "<Credit card>",Month as "<Month>",Year as "<Year>"
    And User click on "Purchase"
    And User captures Purchase Id and Amount
    And User verifies purchase amount equals product cart amount
    And User click on "OK" button
  Examples:
    | Name | Country | City | Credit card | Month | Year |
    | Jinny| India   |Delhi | 1234567890  |01     |2000 |








