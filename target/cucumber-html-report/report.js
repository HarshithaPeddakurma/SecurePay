$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SecurePay.feature");
formatter.feature({
  "line": 1,
  "name": "Secure Pay contact us page",
  "description": "",
  "id": "secure-pay-contact-us-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Google search box is enabled and SecurePay can be written in search text box",
  "description": "",
  "id": "secure-pay-contact-us-page;validate-google-search-box-is-enabled-and-securepay-can-be-written-in-search-text-box",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open Chrome and navigate to \"https://www.google.com.au\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "The google website text box is enabled",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Enter SecurePay on google website",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com.au",
      "offset": 29
    }
  ],
  "location": "stepdefination.open_chrome_and_navigate_to_something(String)"
});
formatter.result({
  "duration": 4997935300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.the_google_website_text_box_is_enabled()"
});
formatter.result({
  "duration": 105965300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.enter_securepay_on_google_website()"
});
formatter.result({
  "duration": 160642600,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Validate successfully able to navigate to SecurePay Website",
  "description": "",
  "id": "secure-pay-contact-us-page;validate-successfully-able-to-navigate-to-securepay-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "Click on enter on the google search text box",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Click the SecurePay link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Successfully able to navigate to the SecurePay Website",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.click_on_enter_on_the_google_search_text_box()"
});
formatter.result({
  "duration": 1974312700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.click_the_securepay_link()"
});
formatter.result({
  "duration": 3691224200,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.successfully_able_to_navigate_to_the_securepay_website()"
});
formatter.result({
  "duration": 81893100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Validate successfully able to navigate to contactus page",
  "description": "",
  "id": "secure-pay-contact-us-page;validate-successfully-able-to-navigate-to-contactus-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "point the mouse at support tag",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Click on contactus",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Successfully able to navigate to ContactUs page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.point_the_mouse_at_support_tag()"
});
formatter.result({
  "duration": 1505370100,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.click_on_contactus()"
});
formatter.result({
  "duration": 133281200,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.successfully_able_to_navigate_to_ContactUs_page()"
});
formatter.result({
  "duration": 3399150100,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Check if Random data is entered in ContactUs page",
  "description": "",
  "id": "secure-pay-contact-us-page;check-if-random-data-is-entered-in-contactus-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "Generate Random data for FirstName,LastName,Company",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Generate Random data for Email",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Generate Random data for Phonenumber",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Generate Random data for URL",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Enter Random data in ContactUs Page and donot click on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "submit button not clicked and browser is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.generate_random_data_for_firstnamelastnamecompany()"
});
formatter.result({
  "duration": 89100,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.generate_random_data_for_email()"
});
formatter.result({
  "duration": 43200,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.generate_random_data_for_phonenumber()"
});
formatter.result({
  "duration": 34900,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.generate_random_data_for_url()"
});
formatter.result({
  "duration": 37700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.enter_random_data_in_contactus_page_and_donot_click_on_submit_button()"
});
formatter.result({
  "duration": 2023822400,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.submit_button_not_clicked_and_browser_is_closed()"
});
formatter.result({
  "duration": 164391000,
  "status": "passed"
});
});