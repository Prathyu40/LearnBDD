$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/signin.feature");
formatter.feature({
  "name": "Signin feature",
  "description": "  I want to signin into my portal. Create the new coupon in the portal\n  and delete the created coupon.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify that user is able to create new coupon and delete once it got created.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Enter Coupon name \"\u003cCoupon name\u003e\" and Code \"\u003cCode\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Coupon should be created",
  "keyword": "And "
});
formatter.step({
  "name": "Select the created coupon and delete from the list",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Coupon name",
        "Code"
      ]
    },
    {
      "cells": [
        "TestCoupon41",
        "141"
      ]
    }
  ]
});
formatter.background({
  "name": "Open the browser and land on the create coupon page.",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigated to the Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinationclass.user_navigated_to_the_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Username \"admin\" and password \"Admin@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinationclass.enter_Username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinationclass.error_message_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on coupon create page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinationclass.couponpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that user is able to create new coupon and delete once it got created.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Enter Coupon name \"TestCoupon41\" and Code \"141\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinationclass.enter_CouponDetails(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Coupon should be created",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinationclass.SuccessCoupon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the created coupon and delete from the list",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinationclass.DeleteCoupon()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});