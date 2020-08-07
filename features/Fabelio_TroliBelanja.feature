Feature: Troli Belanja

  Scenario: Verify Total Prices of Items in Cart
 	 	Given user added 2 items in the cart
		When user clicks "Cart" icon in the homepage
    Then user should see 2 items in the cart with the prices
    And user should see the total prices

  Scenario: Remove Item in the Cart
 	 	Given user added an item in the cart
		When user clicks "Cart" icon in the homepage
		And user clicks "Trash" icon in the cart
		And user clicks "Hapus produk" button in the confirmation pop-up
    Then user should see "Troli Belanja Masih Kosong" message in the cart 
