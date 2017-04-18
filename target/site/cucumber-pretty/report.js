$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/features/web_entering_vatid_and_company_name.feature");
formatter.feature({
  "line": 1,
  "name": "Entering VAT ID and the company name",
  "description": "In order to avoid errors\r\nAs a Teddysoft employee\r\nI want to make sure the VAT ID and company name are consistency",
  "id": "entering-vat-id-and-the-company-name",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Entering company name gets the corresponding VAT ID with web",
  "description": "",
  "id": "entering-vat-id-and-the-company-name;entering-company-name-gets-the-corresponding-vat-id-with-web",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I am on the google browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter the company name \"\u003ccompanyName\u003e\" in company name field",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see the VAT ID field show \"\u003cvatid\u003e\" in browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "entering-vat-id-and-the-company-name;entering-company-name-gets-the-corresponding-vat-id-with-web;",
  "rows": [
    {
      "cells": [
        "companyName",
        "vatid"
      ],
      "line": 11,
      "id": "entering-vat-id-and-the-company-name;entering-company-name-gets-the-corresponding-vat-id-with-web;;1"
    },
    {
      "cells": [
        "泰迪軟體科技有限公司",
        "53909614"
      ],
      "line": 12,
      "id": "entering-vat-id-and-the-company-name;entering-company-name-gets-the-corresponding-vat-id-with-web;;2"
    },
    {
      "cells": [
        "蒂森電梯股份有限公司",
        "14070857"
      ],
      "line": 13,
      "id": "entering-vat-id-and-the-company-name;entering-company-name-gets-the-corresponding-vat-id-with-web;;3"
    },
    {
      "cells": [
        "鼓勵閣商業顧問有限公司",
        "24940741"
      ],
      "line": 14,
      "id": "entering-vat-id-and-the-company-name;entering-company-name-gets-the-corresponding-vat-id-with-web;;4"
    },
    {
      "cells": [
        "百碩工業股份有限公司",
        "97352022"
      ],
      "line": 15,
      "id": "entering-vat-id-and-the-company-name;entering-company-name-gets-the-corresponding-vat-id-with-web;;5"
    },
    {
      "cells": [
        "大鵰生技股份有限公司",
        "86831314"
      ],
      "line": 16,
      "id": "entering-vat-id-and-the-company-name;entering-company-name-gets-the-corresponding-vat-id-with-web;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Entering company name gets the corresponding VAT ID with web",
  "description": "",
  "id": "entering-vat-id-and-the-company-name;entering-company-name-gets-the-corresponding-vat-id-with-web;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I am on the google browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter the company name \"泰迪軟體科技有限公司\" in company name field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see the VAT ID field show \"53909614\" in browser",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "WebEnteringVatidAndCompanyName.iAmOnTheGoogleBrowser()"
});
formatter.result({
  "duration": 2281532314,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "泰迪軟體科技有限公司",
      "offset": 26
    }
  ],
  "location": "WebEnteringVatidAndCompanyName.iEnterTheCompanyNameInCompanyNameField(String)"
});
formatter.result({
  "duration": 484850342,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "53909614",
      "offset": 36
    }
  ],
  "location": "WebEnteringVatidAndCompanyName.iShouldSeeTheVATIDFieldShow(String)"
});
formatter.result({
  "duration": 34468376,
  "status": "passed"
});
formatter.after({
  "duration": 810703620,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Entering company name gets the corresponding VAT ID with web",
  "description": "",
  "id": "entering-vat-id-and-the-company-name;entering-company-name-gets-the-corresponding-vat-id-with-web;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I am on the google browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter the company name \"蒂森電梯股份有限公司\" in company name field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see the VAT ID field show \"14070857\" in browser",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "WebEnteringVatidAndCompanyName.iAmOnTheGoogleBrowser()"
});
formatter.result({
  "duration": 2080272444,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "蒂森電梯股份有限公司",
      "offset": 26
    }
  ],
  "location": "WebEnteringVatidAndCompanyName.iEnterTheCompanyNameInCompanyNameField(String)"
});
formatter.result({
  "duration": 220429907,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "14070857",
      "offset": 36
    }
  ],
  "location": "WebEnteringVatidAndCompanyName.iShouldSeeTheVATIDFieldShow(String)"
});
formatter.result({
  "duration": 30387127,
  "status": "passed"
});
formatter.after({
  "duration": 752388378,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Entering company name gets the corresponding VAT ID with web",
  "description": "",
  "id": "entering-vat-id-and-the-company-name;entering-company-name-gets-the-corresponding-vat-id-with-web;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I am on the google browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter the company name \"鼓勵閣商業顧問有限公司\" in company name field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see the VAT ID field show \"24940741\" in browser",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "WebEnteringVatidAndCompanyName.iAmOnTheGoogleBrowser()"
});
formatter.result({
  "duration": 2126639307,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "鼓勵閣商業顧問有限公司",
      "offset": 26
    }
  ],
  "location": "WebEnteringVatidAndCompanyName.iEnterTheCompanyNameInCompanyNameField(String)"
});
formatter.result({
  "duration": 218057280,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "24940741",
      "offset": 36
    }
  ],
  "location": "WebEnteringVatidAndCompanyName.iShouldSeeTheVATIDFieldShow(String)"
});
formatter.result({
  "duration": 30474083,
  "status": "passed"
});
formatter.after({
  "duration": 777960402,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Entering company name gets the corresponding VAT ID with web",
  "description": "",
  "id": "entering-vat-id-and-the-company-name;entering-company-name-gets-the-corresponding-vat-id-with-web;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I am on the google browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter the company name \"百碩工業股份有限公司\" in company name field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see the VAT ID field show \"97352022\" in browser",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "WebEnteringVatidAndCompanyName.iAmOnTheGoogleBrowser()"
});
formatter.result({
  "duration": 2139504862,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "百碩工業股份有限公司",
      "offset": 26
    }
  ],
  "location": "WebEnteringVatidAndCompanyName.iEnterTheCompanyNameInCompanyNameField(String)"
});
formatter.result({
  "duration": 234189545,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "97352022",
      "offset": 36
    }
  ],
  "location": "WebEnteringVatidAndCompanyName.iShouldSeeTheVATIDFieldShow(String)"
});
formatter.result({
  "duration": 28407658,
  "status": "passed"
});
formatter.after({
  "duration": 797643909,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Entering company name gets the corresponding VAT ID with web",
  "description": "",
  "id": "entering-vat-id-and-the-company-name;entering-company-name-gets-the-corresponding-vat-id-with-web;;6",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I am on the google browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter the company name \"大鵰生技股份有限公司\" in company name field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see the VAT ID field show \"86831314\" in browser",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "WebEnteringVatidAndCompanyName.iAmOnTheGoogleBrowser()"
});
formatter.result({
  "duration": 2094567506,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "大鵰生技股份有限公司",
      "offset": 26
    }
  ],
  "location": "WebEnteringVatidAndCompanyName.iEnterTheCompanyNameInCompanyNameField(String)"
});
formatter.result({
  "duration": 218815369,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "86831314",
      "offset": 36
    }
  ],
  "location": "WebEnteringVatidAndCompanyName.iShouldSeeTheVATIDFieldShow(String)"
});
formatter.result({
  "duration": 29865958,
  "status": "passed"
});
formatter.after({
  "duration": 751035851,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "Entering VAT ID gets the corresponding company name with web",
  "description": "",
  "id": "entering-vat-id-and-the-company-name;entering-vat-id-gets-the-corresponding-company-name-with-web",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "I am on the google browser",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I enter the VAT ID \"\u003cvatid\u003e\" in VAT ID field",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I should see the company name field show \"\u003ccompanyName\u003e\" in browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "entering-vat-id-and-the-company-name;entering-vat-id-gets-the-corresponding-company-name-with-web;",
  "rows": [
    {
      "cells": [
        "companyName",
        "vatid"
      ],
      "line": 23,
      "id": "entering-vat-id-and-the-company-name;entering-vat-id-gets-the-corresponding-company-name-with-web;;1"
    },
    {
      "cells": [
        "泰迪軟體科技有限公司",
        "53909614"
      ],
      "line": 24,
      "id": "entering-vat-id-and-the-company-name;entering-vat-id-gets-the-corresponding-company-name-with-web;;2"
    },
    {
      "cells": [
        "蒂森電梯股份有限公司",
        "14070857"
      ],
      "line": 25,
      "id": "entering-vat-id-and-the-company-name;entering-vat-id-gets-the-corresponding-company-name-with-web;;3"
    },
    {
      "cells": [
        "鼓勵閣商業顧問有限公司",
        "24940741"
      ],
      "line": 26,
      "id": "entering-vat-id-and-the-company-name;entering-vat-id-gets-the-corresponding-company-name-with-web;;4"
    },
    {
      "cells": [
        "百碩工業股份有限公司",
        "97352022"
      ],
      "line": 27,
      "id": "entering-vat-id-and-the-company-name;entering-vat-id-gets-the-corresponding-company-name-with-web;;5"
    },
    {
      "cells": [
        "大鵰生技股份有限公司",
        "86831314"
      ],
      "line": 28,
      "id": "entering-vat-id-and-the-company-name;entering-vat-id-gets-the-corresponding-company-name-with-web;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "Entering VAT ID gets the corresponding company name with web",
  "description": "",
  "id": "entering-vat-id-and-the-company-name;entering-vat-id-gets-the-corresponding-company-name-with-web;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "I am on the google browser",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I enter the VAT ID \"53909614\" in VAT ID field",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I should see the company name field show \"泰迪軟體科技有限公司\" in browser",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "WebEnteringVatidAndCompanyName.iAmOnTheGoogleBrowser()"
});
formatter.result({
  "duration": 2133286766,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "53909614",
      "offset": 20
    }
  ],
  "location": "WebEnteringVatidAndCompanyName.iEnterTheVATIDInVATIDField(String)"
});
formatter.result({
  "duration": 202828506,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "泰迪軟體科技有限公司",
      "offset": 42
    }
  ],
  "location": "WebEnteringVatidAndCompanyName.iShouldSeeTheCompanyNameFieldShow(String)"
});
formatter.result({
  "duration": 29640727,
  "status": "passed"
});
formatter.after({
  "duration": 735855544,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Entering VAT ID gets the corresponding company name with web",
  "description": "",
  "id": "entering-vat-id-and-the-company-name;entering-vat-id-gets-the-corresponding-company-name-with-web;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "I am on the google browser",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I enter the VAT ID \"14070857\" in VAT ID field",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I should see the company name field show \"蒂森電梯股份有限公司\" in browser",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "WebEnteringVatidAndCompanyName.iAmOnTheGoogleBrowser()"
});
formatter.result({
  "duration": 2093641777,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "14070857",
      "offset": 20
    }
  ],
  "location": "WebEnteringVatidAndCompanyName.iEnterTheVATIDInVATIDField(String)"
});
formatter.result({
  "duration": 218092633,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "蒂森電梯股份有限公司",
      "offset": 42
    }
  ],
  "location": "WebEnteringVatidAndCompanyName.iShouldSeeTheCompanyNameFieldShow(String)"
});
formatter.result({
  "duration": 30801382,
  "status": "passed"
});
formatter.after({
  "duration": 762917515,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Entering VAT ID gets the corresponding company name with web",
  "description": "",
  "id": "entering-vat-id-and-the-company-name;entering-vat-id-gets-the-corresponding-company-name-with-web;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "I am on the google browser",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I enter the VAT ID \"24940741\" in VAT ID field",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I should see the company name field show \"鼓勵閣商業顧問有限公司\" in browser",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "WebEnteringVatidAndCompanyName.iAmOnTheGoogleBrowser()"
});
formatter.result({
  "duration": 2110847739,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "24940741",
      "offset": 20
    }
  ],
  "location": "WebEnteringVatidAndCompanyName.iEnterTheVATIDInVATIDField(String)"
});
formatter.result({
  "duration": 244243415,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "鼓勵閣商業顧問有限公司",
      "offset": 42
    }
  ],
  "location": "WebEnteringVatidAndCompanyName.iShouldSeeTheCompanyNameFieldShow(String)"
});
formatter.result({
  "duration": 32918556,
  "status": "passed"
});
formatter.after({
  "duration": 748825732,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Entering VAT ID gets the corresponding company name with web",
  "description": "",
  "id": "entering-vat-id-and-the-company-name;entering-vat-id-gets-the-corresponding-company-name-with-web;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "I am on the google browser",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I enter the VAT ID \"97352022\" in VAT ID field",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I should see the company name field show \"百碩工業股份有限公司\" in browser",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "WebEnteringVatidAndCompanyName.iAmOnTheGoogleBrowser()"
});
formatter.result({
  "duration": 2090385901,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "97352022",
      "offset": 20
    }
  ],
  "location": "WebEnteringVatidAndCompanyName.iEnterTheVATIDInVATIDField(String)"
});
formatter.result({
  "duration": 227834315,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "百碩工業股份有限公司",
      "offset": 42
    }
  ],
  "location": "WebEnteringVatidAndCompanyName.iShouldSeeTheCompanyNameFieldShow(String)"
});
formatter.result({
  "duration": 31651273,
  "status": "passed"
});
formatter.after({
  "duration": 750041411,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Entering VAT ID gets the corresponding company name with web",
  "description": "",
  "id": "entering-vat-id-and-the-company-name;entering-vat-id-gets-the-corresponding-company-name-with-web;;6",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "I am on the google browser",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I enter the VAT ID \"86831314\" in VAT ID field",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I should see the company name field show \"大鵰生技股份有限公司\" in browser",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "WebEnteringVatidAndCompanyName.iAmOnTheGoogleBrowser()"
});
formatter.result({
  "duration": 2085702230,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "86831314",
      "offset": 20
    }
  ],
  "location": "WebEnteringVatidAndCompanyName.iEnterTheVATIDInVATIDField(String)"
});
formatter.result({
  "duration": 211705471,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "大鵰生技股份有限公司",
      "offset": 42
    }
  ],
  "location": "WebEnteringVatidAndCompanyName.iShouldSeeTheCompanyNameFieldShow(String)"
});
formatter.result({
  "duration": 29272374,
  "status": "passed"
});
formatter.after({
  "duration": 748228156,
  "status": "passed"
});
});