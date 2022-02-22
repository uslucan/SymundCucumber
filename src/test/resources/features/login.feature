Feature: Login feature

  Agile story : As a user, I should be able to login.

  Background:
    Given the user is on the login page

  @SYMU-1037
  Scenario: user login with valid credentials
    When the user enters valid credentials
    Then user should be able to login

  @SYMU-1043
  Scenario: user login with valid credentials (hitting enter on keyboard)
    When the user enters valid credentials and hit the enter on keyboard
    Then user should be able to login

  @SYMU-1038
  Scenario Outline: user can not login with any invalid credentials
    When When the user enters invalid credentials "<username>" and "<password>"
    Then An error message should be displayed

    Examples:
      | username    | password    |
      | Employee111 | employee111 |
      | employe111  | Employee123 |

  @SYMU-1039
  Scenario Outline: user can not login with any empty username or password
    When When the user enters invalid credentials "<username>" and "<password>"
    Then "Please fill out this field." message should be displayed

    Examples:
      | username    | password    |
      | Employee111 |             |
      |             | Employee123 |

  @SYMU-1040
  Scenario: Verify default inputbox positions
    Then user should see the palceholders "Username or email" and "Password"
    When user types something in password box and it should be seen in form of dots
    And user clicks the eye button on passwordbox
    Then password should be seen explicitly

  @SYMU-1041
  Scenario: Forgot Password and Reset Password
    And user should be able to see "Forgot password?" link on login page
    When user clicks on forget password link
    Then user should be able to see "Reset password" button










