Feature: Entering VAT ID and the company name
  In order to avoid errors
  As a Teddysoft employee
  I want to make sure the VAT ID and company name are consistency

  Scenario: Entering VAT ID gets the corresponding company name
    When  I enter the VAT ID "53909614"
    Then  I should see the company name "泰迪軟體科技有限公司"

  Scenario: Entering company name gets the corresponding VAT ID
    When  I enter the company name "泰迪軟體科技有限公司"
    Then  I should see the VAT ID "53909614"
