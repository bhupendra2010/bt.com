$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/bhupe/bt.com/src/test/Resources/sports.feature");
formatter.feature({
  "line": 1,
  "name": "Sports package",
  "description": "",
  "id": "sports-package",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11889315000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "sports",
  "description": "",
  "id": "sports-package;sports",
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
  "name": "user navigate to sports option",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user click on cricket",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user find the right deal for cricket sports",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefBroadband.user_is_on_homepage()"
});
formatter.result({
  "duration": 289759600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefSports.user_navigate_to_sports_option()"
});
formatter.result({
  "duration": 3793807700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefSports.user_click_on_cricket()"
});
formatter.result({
  "duration": 28100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefSports.user_find_the_right_deal_for_cricket_sports()"
});
formatter.result({
  "duration": 44700,
  "status": "passed"
});
});