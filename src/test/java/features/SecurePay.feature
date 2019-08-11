Feature: Secure Pay contact us page

Scenario: Validate Google search box is enabled and SecurePay can be written in search text box
Given Open Chrome and navigate to "https://www.google.com.au"
When The google website text box is enabled
Then Enter SecurePay on google website

Scenario: Validate successfully able to navigate to SecurePay Website
Given Click on enter on the google search text box
When Click the SecurePay link
Then Successfully able to navigate to the SecurePay Website

Scenario: Validate successfully able to navigate to contactus page
Given point the mouse at support tag
When Click on contactus
Then Successfully able to navigate to ContactUs page

Scenario: Check if Random data is entered in ContactUs page
Given Generate Random data for FirstName,LastName,Company
And Generate Random data for Email
And Generate Random data for Phonenumber
And Generate Random data for URL
When Enter Random data in ContactUs Page and donot click on submit button
Then submit button not clicked and browser is closed
 



