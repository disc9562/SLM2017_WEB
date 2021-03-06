Feature: Entering VAT ID and the company name using web site
  In order to avoid errors
  As a Teddysoft employee
  I want to make sure the VAT ID and company name are consistency
#  Background :
#    Given Open service
#  @OpenWeb
  Scenario Outline: Entering company name gets the corresponding VAT ID using web site
  Given I am on the google browser
  When I enter the company name "<companyName>" in company name field
  Then I should see the VAT ID field show "<vatid>" in browser
  Examples:
  | companyName | vatid |
  | 泰迪軟體科技有限公司  | 53909614 |
  | 蒂森電梯股份有限公司 |  14070857  |
  | 鼓勵閣商業顧問有限公司 |  24940741  |
  | 百碩工業股份有限公司  | 97352022  |
  | 大鵰生技股份有限公司 | 86831314  |
  | 泰迪軟體科技公司       |  查無資料   |
  | 東發視聽社         | 共有2筆資料        |

  Scenario Outline: Entering VAT ID gets the corresponding company using web site
  Given I am on the google browser
  When I enter the VAT ID "<vatid>" in VAT ID field
  Then I should see the company name field show "<companyName>" in browser
  Examples:
  | companyName | vatid |
  | 泰迪軟體科技有限公司  | 53909614 |
  | 蒂森電梯股份有限公司 |  14070857  |
  | 鼓勵閣商業顧問有限公司 |  24940741  |
  | 百碩工業股份有限公司  | 97352022  |
  | 大鵰生技股份有限公司 | 86831314  |
  | 東發視聽社       | 11111111       |
  | 國立臺北科技大學  | 92021164     |
  | 統一編號錯誤           | 999999999      |
    |      復華廣告有限公司            |                |