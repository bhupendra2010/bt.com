$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/bhupe/bt.com/src/test/Resources/phone.feature");
formatter.feature({
  "line": 1,
  "name": "Phonedeal",
  "description": "",
  "id": "phonedeal",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12642463100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Phonedeal check",
  "description": "",
  "id": "phonedeal;phonedeal-check",
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
  "name": "user navigate to mobiledeal",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user find sim only deal",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user should select the deal and put it in basket",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefBroadband.user_is_on_homepage()"
});
formatter.result({
  "duration": 191000600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefPhonedeal.user_navigate_to_mobiledeal()"
});
formatter.result({
  "duration": 3531691700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefPhonedeal.user_find_sim_only_deal()"
});
formatter.result({
  "duration": 1890908900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefPhonedeal.user_should_select_the_deal_and_put_it_in_basket()"
});
formatter.result({
  "duration": 44400,
  "status": "passed"
});
});