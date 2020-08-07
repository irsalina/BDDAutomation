Feature: Login

  Scenario: Verify Login Function with Correct Account
 	 	Given user on the homepage
		And user clicks "Masuk" icon in the homepage
    When user fills "Email" textbox with "correct.address@email.com"
    And user enters "Kata sandi" textbox with "correctpassword"
    And user clicks "MASUK" button
    Then user logged in the account

  Scenario: Unsuccessful Login
 	 	Given user on the homepage
		And user clicks "Masuk" icon in the homepage
    When user fills "Email" textbox with "wrong.address@email.com"
    And user enters "Kata sandi" textbox with "wrongpassword"
    And user clicks "MASUK" button
    Then user stays in the same form
    And error message "Mohon periksa kembali alamat email / password anda." is displayed
