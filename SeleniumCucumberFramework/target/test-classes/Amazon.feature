Feature: Adding items to the cart
  Inorder to verify the items are adding in to the cart.

  Scenario: Adding one plus mobile to the cart

    Given  user is on the Amazon homepage
    When user click on the mobiles tab
    Then mobiles should be displayed

  Scenario Outline: Login to the Amzon application
    Given  user is on the Amazon homepage
    When user click on sign in button
    Then Login page should be displayed
    And user enters "<UserName>"
    When user click on continue button
    Then password field should be dispalyed
    And user enters "<password>"
    When user click on signin button
    Then User should be successfully login to the amazon application
    Examples:
      | UserName | password |
      |9963321819|*****     |
      |Navya     |*****     |