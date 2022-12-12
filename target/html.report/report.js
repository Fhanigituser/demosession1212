$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("t112.feature");
formatter.feature({
  "line": 1,
  "name": "Testing the orange HRM application",
  "description": "",
  "id": "testing-the-orange-hrm-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 13,
  "name": "Validate if user is able to login2",
  "description": "",
  "id": "testing-the-orange-hrm-application;validate-if-user-is-able-to-login2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@smoke"
    },
    {
      "line": 12,
      "name": "@TC_002"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "when user hits the url in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user should be successfully able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "orangelogin.when_user_hits_the_url_in_the_browser()"
});
formatter.result({
  "duration": 10550581000,
  "status": "passed"
});
formatter.match({
  "location": "orangelogin.user_enters_and()"
});
formatter.result({
  "duration": 540528400,
  "status": "passed"
});
formatter.match({
  "location": "orangelogin.user_should_be_successfully_able_to_login()"
});
formatter.result({
  "duration": 2866419700,
  "status": "passed"
});
});