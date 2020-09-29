$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/bhupe/bt.com/src/test/Resources/broadband.feature");
formatter.feature({
  "line": 1,
  "name": "broadband deal",
  "description": "",
  "id": "broadband-deal",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11367308300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "broadband",
  "description": "",
  "id": "broadband-deal;broadband",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user navigate the broadband section",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user find a broadband deal",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user select the appropriate deal for him",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefBroadband.user_is_on_homepage()"
});
formatter.result({
  "duration": 382592400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBroadband.user_navigate_the_broadband_section()"
});
formatter.result({
  "duration": 3108725400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBroadband.user_find_a_broadband_deal()"
});
formatter.result({
  "duration": 1028414900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBroadband.user_select_the_appropriate_deal_for_him()"
});
formatter.result({
  "duration": 45500,
  "status": "passed"
});
});