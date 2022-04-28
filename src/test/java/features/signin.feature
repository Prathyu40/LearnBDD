Feature: Signin feature
  I want to signin into my portal. Create the new coupon in the portal
  and delete the created coupon.

  Background: Open the browser and land on the create coupon page.
    Given User navigated to the Login page
    When Enter Username "admin" and password "Admin@123"
    Then Home page should be displayed
    Given User is on coupon create page

  @Smoke
  Scenario Outline: Verify that user is able to create new coupon and delete once it got created.
    When Enter Coupon name "<Coupon name>" and Code "<Code>"
    And Coupon should be created
    And Select the created coupon and delete from the list

    Examples: 
      | Coupon name  | Code |
      | TestCoupon41 |  141 |
