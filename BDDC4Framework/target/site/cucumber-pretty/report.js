$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Messenger.feature");
formatter.feature({
  "line": 4,
  "name": "Messenger page feature",
  "description": "",
  "id": "messenger-page-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.before({
  "duration": 7843038322,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on messenger page",
  "keyword": "Given "
});
formatter.match({
  "location": "MessengerPageSD.setMessengerPage()"
});
formatter.result({
  "duration": 4008220889,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify invalid login from messenger page",
  "description": "",
  "id": "messenger-page-feature;verify-invalid-login-from-messenger-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@messenger"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I enter kralshakirr@gmail.com into username field on the messenger page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I enter lompen123 into password field on the messenger page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on login button on messenger page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I verify invalid login message on sign page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "kralshakirr@gmail.com",
      "offset": 8
    },
    {
      "val": "username",
      "offset": 35
    }
  ],
  "location": "MessengerPageSD.enterDataIntoTextField(String,String)"
});
formatter.result({
  "duration": 413311960,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lompen123",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 23
    }
  ],
  "location": "MessengerPageSD.enterDataIntoTextField(String,String)"
});
formatter.result({
  "duration": 69639379,
  "status": "passed"
});
formatter.match({
  "location": "MessengerPageSD.clickOnSignButton()"
});
formatter.result({
  "duration": 1470359266,
  "status": "passed"
});
formatter.match({
  "location": "MessengerPageSD.iVerifyInvalidLoginMessageOnSignPage()"
});
formatter.result({
  "duration": 38288687,
  "status": "passed"
});
formatter.after({
  "duration": 353825974,
  "status": "passed"
});
});