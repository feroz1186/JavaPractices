Feature: Verify the Login functionality
  As a user, he should able to login the product page

  Scenario: Login - success
    Given User enters the URL page
    When User enter the email id as username
    And User enter the password in password field
    Then User verify the greeting message
    Then User verify the logout button
    But User should not visible the forgotpassword link
