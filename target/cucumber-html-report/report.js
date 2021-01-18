$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FF01_NavToSecurePaynFillContactUsForm.feature");
formatter.feature({
  "line": 2,
  "name": "Navigate to SecurePay website",
  "description": "",
  "id": "navigate-to-securepay-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Search for SecurePay on google and Navigate to website",
  "description": "",
  "id": "navigate-to-securepay-website;search-for-securepay-on-google-and-navigate-to-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TestRun"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Navigate to Google site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "search for securePay and navigate to homepage of SecurePay",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Verify ContactUs page is loaded",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Fill ContactUs form",
  "keyword": "Then "
});
formatter.match({
  "location": "SD01_NavToSecPay.navigate_to_Google_site()"
});
formatter.result({
  "duration": 8876292900,
  "status": "passed"
});
formatter.match({
  "location": "SD01_NavToSecPay.search_for_securePay_and_navigate_to_homepage_of_SecurePay()"
});
formatter.result({
  "duration": 5059989300,
  "status": "passed"
});
formatter.match({
  "location": "SD02_FillContactUsForm.verify_ContactUs_page_is_loaded()"
});
formatter.result({
  "duration": 1561311200,
  "status": "passed"
});
formatter.match({
  "location": "SD02_FillContactUsForm.fill_ContactUs_form()"
});
formatter.result({
  "duration": 1600931300,
  "status": "passed"
});
});