$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Feature.feature");
formatter.feature({
  "name": "Verifying the adactin hotel login details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying the adactin hotel login details with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the adactin login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should enter the Room Details\"\u003clocation\u003e\",\"\u003chotel\u003e\",\"\u003croomType\u003e\",\"\u003cnoOfRooms\u003e\",\"\u003ccheckInDate\u003e\",\"\u003ccheckOutDate\u003e\",\"\u003cadults\u003e\"and\"\u003cchild\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should click the search button",
  "keyword": "And "
});
formatter.step({
  "name": "user should select the room by clicking radio button and click continue",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter the payment details\"\u003cfirstName\u003e\",\"\u003clastName\u003e\",\"\u003caddress\u003e\"",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "cardNumber",
        "cardType",
        "month",
        "year",
        "cvvNumber"
      ]
    },
    {
      "cells": [
        "1234567890123456",
        "VISA",
        "January",
        "2022",
        "123"
      ]
    },
    {
      "cells": [
        "1234567890134534",
        "American Express",
        "March",
        "2021",
        "445"
      ]
    },
    {
      "cells": [
        "1234567890122345",
        "Master Card",
        "June",
        "2022",
        "989"
      ]
    },
    {
      "cells": [
        "1234567890122345",
        "Other",
        "July",
        "2021",
        "674"
      ]
    }
  ]
});
formatter.step({
  "name": "user should click the book now button",
  "keyword": "And "
});
formatter.step({
  "name": "get order id in console",
  "keyword": "And "
});
formatter.step({
  "name": "user should click the my itenerary button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "location",
        "hotel",
        "roomType",
        "noOfRooms",
        "checkInDate",
        "checkOutDate",
        "adults",
        "child",
        "firstName",
        "lastName",
        "address"
      ]
    },
    {
      "cells": [
        "uvaishjj",
        "MCM9J3",
        "Sydney",
        "Hotel Creek",
        "Standard",
        "2 - Two",
        "17/12/2020",
        "18/12/2020",
        "2 - Two",
        "2 - Two",
        "mohammed",
        "uvaish",
        "madurai"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying the adactin hotel login details with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_is_on_the_adactin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"uvaishjj\" and \"MCM9J3\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_should_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter the Room Details\"Sydney\",\"Hotel Creek\",\"Standard\",\"2 - Two\",\"17/12/2020\",\"18/12/2020\",\"2 - Two\"and\"2 - Two\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_should_enter_the_Room_Details_and(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_should_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the room by clicking radio button and click continue",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_should_select_the_room_by_clicking_radio_button_and_click_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the payment details\"mohammed\",\"uvaish\",\"madurai\"",
  "rows": [
    {
      "cells": [
        "cardNumber",
        "cardType",
        "month",
        "year",
        "cvvNumber"
      ]
    },
    {
      "cells": [
        "1234567890123456",
        "VISA",
        "January",
        "2022",
        "123"
      ]
    },
    {
      "cells": [
        "1234567890134534",
        "American Express",
        "March",
        "2021",
        "445"
      ]
    },
    {
      "cells": [
        "1234567890122345",
        "Master Card",
        "June",
        "2022",
        "989"
      ]
    },
    {
      "cells": [
        "1234567890122345",
        "Other",
        "July",
        "2021",
        "674"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_should_enter_the_payment_details(String,String,String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the book now button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_should_click_the_book_now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get order id in console",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.get_order_id_in_console()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the my itenerary button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_should_click_the_my_itenerary_button()"
});
formatter.result({
  "status": "passed"
});
});