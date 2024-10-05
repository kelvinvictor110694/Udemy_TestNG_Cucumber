Feature: The user successfully submits the order on ECommerce Site

  Background:
  Given I landed on the Ecommerce page
  Scenario Outline: Validation for successful order submission
    Given The user completes the login process with <username> and <password>
    When user cliks on add products to the cart
    And The user must see the added products to the cart
    Then The user must complete the payment process successully

    Examples:
    | username        | password |
    | kelvin@test.com | P@55word |