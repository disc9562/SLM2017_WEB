Feature: Issuing invoice for companies

  Scenario: Issuing invoices with one item for companies by providing tax included prices
    Given Ｔhe VAT rate is 0.05
    And   the tax included price is 17000
    When  I issue a company invoice
    Then  I should see the VAT is 810
    And   the tax excluded price is 16190
