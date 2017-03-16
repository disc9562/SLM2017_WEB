Feature: Issuing invoices for companies
  In order to avoid errors
  As a Teddysoft employee
  I want to brainlessly issue an company invoice with tax included price

  Scenario: Issuing invoices with one item for companies by providing tax included prices
    Given Ｔhe VAT rate is 0.05
    And   the tax included price is 17000
    When  I issue a company invoice
    Then  I should see the VAT is 810
    And   the tax excluded price is 16190
