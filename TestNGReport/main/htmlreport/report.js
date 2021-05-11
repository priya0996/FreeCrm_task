$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/main.feature");
formatter.feature({
  "line": 1,
  "name": "Test Login Functionality",
  "description": "",
  "id": "test-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "check login is successful valid credentials",
  "description": "",
  "id": "test-login-functionality;check-login-is-successful-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user click\u0027s on login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user is navigated to the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on create button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user fills the data",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on save button",
  "keyword": "Then "
});
formatter.match({
  "location": "Newlogin.browser_is_open()"
});
formatter.result({
  "duration": 4914170100,
  "status": "passed"
});
formatter.match({
  "location": "Newlogin.user_enters_username_and_password()"
});
formatter.result({
  "duration": 5099624700,
  "status": "passed"
});
formatter.match({
  "location": "Newlogin.useer_clicks_on_login()"
});
formatter.result({
  "duration": 89894800,
  "status": "passed"
});
formatter.match({
  "location": "Newlogin.user_is_navigated_to_the_home_page()"
});
formatter.result({
  "duration": 3646122600,
  "status": "passed"
});
formatter.match({
  "location": "Newlogin.user_click_on_create_button()"
});
formatter.result({
  "duration": 2155449700,
  "status": "passed"
});
formatter.match({
  "location": "Newlogin.user_fills_the_data()"
});
formatter.result({
  "duration": 12278707000,
  "status": "passed"
});
formatter.match({
  "location": "Newlogin.user_clicks_on_save_button()"
});
formatter.result({
  "duration": 171523000,
  "status": "passed"
});
});