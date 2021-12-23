Feature: Open cart feature

Background: Login Page
Given i am on Login page 
When user enters email "sowndaryak18@gmail.com"
When user enter password "sow123"
Then user clicks on login button
Then user landed to home page



Scenario: Place an order
Given User is on homepage
When User search an "phone"
And User add item to cart
Then Item must be  available in cart

Scenario: Checkout cart items
Given User is on homepage
When User clicks on cart items
And User click on checkout
And User add item to cart
Then Item must be  available in cart


 